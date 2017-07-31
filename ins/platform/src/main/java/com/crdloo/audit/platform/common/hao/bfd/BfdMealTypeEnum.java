package com.crdloo.audit.platform.common.hao.bfd;

public enum BfdMealTypeEnum {
	
	rule(0, "欺诈规则", "RuleSpecialList,RuleApplyLoan,RuleApplyLoanMon,RuleExecution", "pack"), 
	SpecialList_c(1, "特殊名单核查", "SpecialList_c", "pack"),
	ApplyLoanStr(2, "多次申请核查", "ApplyLoanStr", "pack"),
	ApplyLoanMon(3, "多次申请核查—月度版", "ApplyLoanMon", "pack"),
	InfoRelation(4, "申请信息关联", "InfoRelation", "pack"),
	Execution(5, "法院被执行人—个人版", "Execution", "pack"),
	KeyAttribution(6, "身份证号手机号归属地", "KeyAttribution", "pack"),
	TelCheck(7, "手机三要素", "TelCheck", "single"),
	IdTwo_z(8, "身份证二要素验证", "IdTwo_z", "single"),
	BankThree(9, "银行卡三要素验证", "BankThree", "single"),
	TelPeriod(10, "手机在网时长", "TelPeriod", "single"),
	TelStatus(11, "手机在网状态", "TelStatus", "single"),
	BizLicInfo(12, "企业照面信息查询", "BizLicInfo", "single"),
	BizInvest_q(13, "企业对外投资", "BizInvest_q", "single"),
	BizInfo_q(14, "企业关键字模糊查询", "BizInfo_q", "single"),
	BizInvestMap_q(15, "企业投资关系图谱", "BizInvestMap_q", "single"),
	BizRelationship_q(16, "企业投资及股东关系图谱", "BizRelationship_q", "single"),
	BizTreeRelationMap_q(17, "企业树状关系族谱", "BizTreeRelationMap_q", "single"),
	PhoneRecog(18, "商户电话识别", "PhoneRecog", "single"),
	;

	private int id;
	private String name;
	private String meal;
	private String invokeType;
	
	private BfdMealTypeEnum(int id, String name, String meal, String invokeType){
		this.id = id;
		this.name = name;
		this.meal = meal;
		this.invokeType = invokeType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMeal() {
		return meal;
	}

	public void setMeal(String meal) {
		this.meal = meal;
	}

	public String getInvokeType() {
		return invokeType;
	}

	public void setInvokeType(String invokeType) {
		this.invokeType = invokeType;
	}
	
	public static BfdMealTypeEnum getEnum(int id) {
        for (BfdMealTypeEnum e : BfdMealTypeEnum.values()) {
            if (id==e.getId()) {
                return e;
            }
        }
        return null;
    }
}
