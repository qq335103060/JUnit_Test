package com.hpsvse.prj.web.action;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.hpsvse.prj.service.AppUpdateService;
import com.hpsvse.prj.service.IAllPKService;
import com.hpsvse.prj.service.IApplyService;
import com.hpsvse.prj.service.IDeptService;
import com.hpsvse.prj.service.IDictService;
import com.hpsvse.prj.service.IIpApplyService;
import com.hpsvse.prj.service.ITypeService;
import com.hpsvse.prj.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {
	@Autowired
	protected IUserService userService;
	
	@Autowired
	protected IApplyService applyService;
	
	@Autowired
	protected IDeptService deptService;
	
	@Autowired
	protected IDictService dictService;
	
	@Autowired
	protected ITypeService typeService ;
	
	@Autowired
	protected IAllPKService apkService;
	
	@Autowired
	protected IIpApplyService ipApplyService;
	
	@Autowired
	protected AppUpdateService appUpdateService;
	
	
	
}
