package com.hpsvse.prj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.hpsvse.prj.dao.IAllpkinfoDAO;
import com.hpsvse.prj.dao.IApplyinfoDAO;
import com.hpsvse.prj.dao.IComminfoDAO;
import com.hpsvse.prj.dao.IDeptinfoDAO;
import com.hpsvse.prj.dao.IDictinfoDAO;
import com.hpsvse.prj.dao.IIpaddrinfoDAO;
import com.hpsvse.prj.dao.IMailinfoDAO;
import com.hpsvse.prj.dao.IOtherinfoDAO;
import com.hpsvse.prj.dao.IStrroominfoDAO;
import com.hpsvse.prj.dao.ITelmeetingDAO;
import com.hpsvse.prj.dao.ITypeinfo;
import com.hpsvse.prj.dao.IUserinfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BaseService extends ActionSupport {
	@Autowired
	protected IUserinfoDAO userinfoDAO;
	
	@Autowired
	protected IApplyinfoDAO applyinfoDAO;
	
	@Autowired
	protected IDeptinfoDAO deptDAO;
	
	@Autowired
	protected IDictinfoDAO dictinfoDAO;
	
	@Autowired
	protected ITypeinfo typeDAO ;
	
	@Autowired
	protected IComminfoDAO commDAO;
	
	@Autowired 
	protected IIpaddrinfoDAO ipaddDAO;
	
	@Autowired
	protected IMailinfoDAO mailDAO;
	
	@Autowired
	protected IOtherinfoDAO otherDAO;
	
	@Autowired
	protected IStrroominfoDAO strDAO;
	
	@Autowired
	protected ITelmeetingDAO telDAO;
	
	@Autowired
	protected IAllpkinfoDAO apkDAO;
	
}
