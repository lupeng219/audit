package com.crdloo.audit.web.example.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crdloo.audit.client.dto.ExampleDto;
import com.crdloo.audit.framework.client.PageResults;
import com.crdloo.audit.framework.common.exception.BizException;
import com.crdloo.audit.web.common.controller.BaseController;
import com.crdloo.audit.web.common.enums.GeneralExCode;
import com.crdloo.audit.web.example.form.ExampleForm;
import com.crdloo.audit.web.example.service.IExampleService;
import com.crdloo.audit.web.support.helper.AuditExampleClientHelper;

@Controller
@RequestMapping("/example")
public class ExampleController extends BaseController {

	@Autowired
	private IExampleService exampleService;

	@RequestMapping(value = "/get")
	public String get(Long id, Model model) throws BizException {
		Long userId = getCurrentUserId();
		logger.info("example [getd]: userId=" + userId + ", id=" + id);
		monitorLog.info("example [get]: userId=" + userId + ", id=" + id);
//		if (userId == null || userId <= 0) {
//			throw new BizException(GeneralExCode.USER_NOT_LOGIN);
//		}

		ExampleForm exampleForm = exampleService.getExampleById(id);
		model.addAttribute("exampleForm", exampleForm);

		return "/example/data";
	}

	@RequestMapping(value = "/getList")
	public String getlist(String tag, @RequestParam(required = false, defaultValue = "1") Integer pageNo,
			@RequestParam(required = false, defaultValue = "10") Integer pageSize, Model model) throws BizException {
		Long userId = getCurrentUserId();
		logger.info("example [getlist]: userId=" + userId + ", tag=" + tag + ", pageNo=" + pageNo + ", pageSize="
				+ pageSize);
		if (userId == null || userId <= 0) {
			throw new BizException(GeneralExCode.USER_NOT_LOGIN);
		}

		List<ExampleForm> exampleList = exampleService.getExampleList(tag, pageNo, pageSize);
		model.addAttribute("exampleList", exampleList);

		return "/example/list";
	}

	@RequestMapping(value = "/getPageList")
	public String getDataPageList(String tag, @RequestParam(required = false, defaultValue = "0") Integer pageNo,
			Integer pageSize, Model model) throws BizException {
		Long userId = getCurrentUserId();
		logger.info("example [getlist]: userId=" + userId + ", tag=" + tag + ", pageNo=" + pageNo + ", pageSize="
				+ pageSize);
		if (userId == null || userId <= 0) {
			throw new BizException(GeneralExCode.USER_NOT_LOGIN);
		}
		PageResults<ExampleForm> result = exampleService.getDataPageList(tag, pageNo, pageSize);
		model.addAttribute("list", result.getList());
		model.addAttribute("count", result.getTotalCount());
		model.addAttribute("totalPage", result.getTotalPage());

		return "/example/pagelist";
	}

	@RequestMapping(value = "/save")
	public String save(ExampleForm exampleForm) throws BizException {
		logger.debug("11111 form_name=" + exampleForm.getName());
		exampleService.saveExample(exampleForm);
		return "/example/success";
	}

	@RequestMapping(value = "/saves")
	public String saves(ExampleForm exampleForm) throws BizException {
		ExampleDto dto = AuditExampleClientHelper.insertDatas();
		return "/example/success";
	}

	@RequestMapping(value = "/exportpdf")
	public void exportPdf(HttpServletRequest request, HttpServletResponse response) throws BizException {
		byte[] pdffile = exampleService.exportPdf();
		responsePdf(pdffile, response);
	}
	
}
