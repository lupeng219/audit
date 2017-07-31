package com.crdloo.audit.platform.common.hao.bfd;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.data.redis.core.ValueOperations;

import com.bfd.facade.MerchantServer;
import com.crdloo.audit.framework.common.exception.HaoException;
import com.crdloo.audit.framework.router.utils.JsonUtil;
import com.crdloo.audit.framework.router.utils.MonitorLogger;
import com.crdloo.audit.platform.common.enums.BfdExCode;

import net.sf.json.JSONObject;

public class BfdHaoProcess {

	protected final Logger logger = Logger.getLogger(getClass());

	protected final MonitorLogger monitorLog = MonitorLogger.getInstance();

	private static final String CACHE_TOKEN_KEY = "bfd.token.id";

	@Resource(name = "redisTemplate")
	private ValueOperations<String, String> redis;

	private String userName = null;
	private String pwd = null;
	private String apiCode = null;
	private String loginApiName = null;
	private String hxApiName = null;
	private String hnApiName = null;
	
	private MerchantServer ms = new MerchantServer();
	
	private String getToken() throws HaoException {
		String token = redis.get(CACHE_TOKEN_KEY);
		if (StringUtils.isBlank(token)) {
			String result = null;
			try {
				result = ms.login(userName, pwd, loginApiName, apiCode);
				monitorLog.info("bfd login: output=" + result);
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
				monitorLog.info(e.getMessage(), e);
				throw new HaoException(BfdExCode.TOKEN_ID_ERR);
			}

			if (StringUtils.isBlank(result)) {
				throw new HaoException(BfdExCode.TOKEN_ID_ERR);
			}
			Map<String, Object> map = JsonUtil.json2map(result);
			if (MapUtils.isEmpty(map)) {
				throw new HaoException(BfdExCode.TOKEN_ID_ERR);
			}
			String code = (String) map.get("code");
			token = (String) map.get("tokenid");
			logger.info("getToken info: [code=" + code + ", token=" + token + "]");
			if (!"00".equals(code)) {
				throw new HaoException(BfdExCode.TOKEN_ID_ERR);
			}
			if (StringUtils.isBlank(token)) {
				throw new HaoException(BfdExCode.TOKEN_ID_ERR);
			}
			redis.set(CACHE_TOKEN_KEY, token, 40, TimeUnit.MINUTES);

		}
		return token;
	}

	private String query(JSONObject json) throws HaoException {
		String result = null;
		try {
			result = ms.getApiData(json.toString(), apiCode);
			monitorLog.info("bfd query: input=" + json.toString() + ", output=" + result);
			logger.info("bfd query: input=" + json.toString() + ", output=" + result);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			monitorLog.info(e.getMessage(), e);
			throw new HaoException(BfdExCode.QUERY_DATA_ERR);
		}

		if (StringUtils.isBlank(result)) {
			throw new HaoException(BfdExCode.QUERY_DATA_ERR);
		}
		if (!result.contains("code")) {
			throw new HaoException(BfdExCode.QUERY_DATA_ERR);
		}
//		if (!"00".equals(JSONObject.fromObject(result).getString("code"))) {
//			throw new HaoException(BfdExCode.QUERY_DATA_ERR);
//		}

		return result;
	}

	@SuppressWarnings("unchecked")
	public BfdResult<?> query(Map<String, Object> map, Class<?> outputDataClass) throws HaoException {
		JSONObject json = new JSONObject();
		json.put("apiName", hxApiName);
		json.put("tokenid", getToken());

		JSONObject reqData = new JSONObject();
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			reqData.put(entry.getKey(), entry.getValue());
		}
		json.put("reqData", reqData);
		String result = query(json);
		// 处理 百融规则接口，返回结果字段名大写开头，转为小写
		if (result.indexOf("Rule_") > -1) {
			result = result.replaceAll("Rule_", "rule_");
		}
		String code = JsonUtil.getJsonData(result, "code");
		String swift_number = JsonUtil.getJsonData(result, "swift_number");
		Object data = null;
		if("00".equals(code) || "600000".equals(code)){
			data = JsonUtil.toObject(result, outputDataClass);
		}
		return new BfdResult(code, swift_number, data);
	}
	
	@SuppressWarnings("unchecked")
	public BfdResult<?> hnQuery(Map<String, Object> map, Class<?> outputDataClass) throws HaoException {
		JSONObject json = new JSONObject();
		json.put("apiName", hnApiName);
		json.put("tokenid", getToken());

		JSONObject reqData = new JSONObject();
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			reqData.put(entry.getKey(), entry.getValue());
		}
		json.put("reqData", reqData);
		String result = query(json);
		
		if(result.indexOf("flag_ biztreerelationmap_q")>-1){
			result = result.replaceAll("flag_ biztreerelationmap_q", "flag_biztreerelationmap_q");
		}
		// 处理 身份证二要素验证接口，返回结果
		if(result.indexOf("\"RESULT\"")>-1){
			result = result.replaceAll("\"RESULT\"", "\"result\"");
		}
		if(result.indexOf("\"MESSAGE\"")>-1){
			result = result.replaceAll("\"MESSAGE\"", "\"message\"");
		}
		// 处理企业信息接口，返回结果
		if(result.indexOf("\"Status\"")>-1){
			result = result.replaceAll("\"Status\"", "\"status\"");
		}
		if(result.indexOf("\"Message\"")>-1){
			result = result.replaceAll("\"Message\"", "\"message\"");
		}
		if(result.indexOf("\"TermStart\"")>-1){
			result = result.replaceAll("\"TermStart\"", "\"termStart\"");
		}
		if(result.indexOf("\"TeamEnd\"")>-1){
			result = result.replaceAll("\"TeamEnd\"", "\"teamEnd\"");
		}
		if(result.indexOf("\"CheckDate\"")>-1){
			result = result.replaceAll("\"CheckDate\"", "\"checkDate\"");
		}
		if(result.indexOf("\"Name\"")>-1){
			result = result.replaceAll("\"Name\"", "\"name\"");
		}
		if(result.indexOf("\"No\"")>-1){
			result = result.replaceAll("\"No\"", "\"no\"");
		}
		if(result.indexOf("\"BelongOrg\"")>-1){
			result = result.replaceAll("\"BelongOrg\"", "\"belongOrg\"");
		}
		if(result.indexOf("\"OperName\"")>-1){
			result = result.replaceAll("\"OperName\"", "\"operName\"");
		}
		if(result.indexOf("\"StartDate\"")>-1){
			result = result.replaceAll("\"StartDate\"", "\"startDate\"");
		}
		if(result.indexOf("\"EndDate\"")>-1){
			result = result.replaceAll("\"EndDate\"", "\"endDate\"");
		}
		if(result.indexOf("\"Status\"")>-1){
			result = result.replaceAll("\"Status\"", "\"status\"");
		}
		if(result.indexOf("\"Province\"")>-1){
			result = result.replaceAll("\"Province\"", "\"province\"");
		}
		if(result.indexOf("\"updatedDate\"")>-1){
			result = result.replaceAll("\"UpdatedDate\"", "\"updatedDate\"");
		}
		if(result.indexOf("\"CreditCode\"")>-1){
			result = result.replaceAll("\"CreditCode\"", "\"creditCode\"");
		}
		if(result.indexOf("\"RegistCapi\"")>-1){
			result = result.replaceAll("\"RegistCapi\"", "\"registCapi\"");
		}
		if(result.indexOf("\"EconKind\"")>-1){
			result = result.replaceAll("\"EconKind\"", "\"econKind\"");
		}
		if(result.indexOf("\"Address\"")>-1){
			result = result.replaceAll("\"Address\"", "\"address\"");
		}
		if(result.indexOf("\"Scope\"")>-1){
			result = result.replaceAll("\"Scope\"", "\"scope\"");
		}
		if(result.indexOf("\"TotalRecords\"")>-1){
			result = result.replaceAll("\"TotalRecords\"", "\"totalRecords\"");
		}
		if(result.indexOf("\"Links\"")>-1){
			result = result.replaceAll("\"Links\"", "\"links\"");
		}
		if(result.indexOf("\"Source\"")>-1){
			result = result.replaceAll("\"Source\"", "\"source\"");
		}
		if(result.indexOf("\"Target\"")>-1){
			result = result.replaceAll("\"Target\"", "\"target\"");
		}
		if(result.indexOf("\"Nodes\"")>-1){
			result = result.replaceAll("\"Nodes\"", "\"nodes\"");
		}
		if(result.indexOf("\"Category\"")>-1){
			result = result.replaceAll("\"Category\"", "\"category\"");
		}
		if(result.indexOf("\"ShortName\"")>-1){
			result = result.replaceAll("\"ShortName\"", "\"shortName\"");
		}
		if(result.indexOf("\"Count\"")>-1){
			result = result.replaceAll("\"Count\"", "\"count\"");
		}
		if(result.indexOf("\"Children\"")>-1){
			result = result.replaceAll("\"Children\"", "\"children\"");
		}
		
		
		String code = JsonUtil.getJsonData(result, "code");
		String swift_number = JsonUtil.getJsonData(result, "swift_number");
		Object data = null;
		if("00".equals(code) || "600000".equals(code)){
			data = JsonUtil.toObject(result, outputDataClass);
		}
		return new BfdResult(code, swift_number, data);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getApiCode() {
		return apiCode;
	}

	public void setApiCode(String apiCode) {
		this.apiCode = apiCode;
	}

	public String getLoginApiName() {
		return loginApiName;
	}

	public void setLoginApiName(String loginApiName) {
		this.loginApiName = loginApiName;
	}

	public String getHxApiName() {
		return hxApiName;
	}

	public void setHxApiName(String hxApiName) {
		this.hxApiName = hxApiName;
	}

	public String getHnApiName() {
		return hnApiName;
	}

	public void setHnApiName(String hnApiName) {
		this.hnApiName = hnApiName;
	}

	
}
