package com.hpsvse.prj.web.action;


import java.io.UnsupportedEncodingException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


@Controller
@Scope("prototype")
@Namespace("/")
@ParentPackage("json-default")
public class CookieAction extends BaseAction {
	private String username;
	private String userpwd;
	private String yzm;
	public String getYzm() {
		return yzm;
	}
	public void setYzm(String yzm) {
		this.yzm = yzm;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
@Action(value="findCookie",results={@Result(type="json",name="success")})
	public String findCookie(){
	this.yzm = (String) ServletActionContext.getRequest().getSession().getAttribute("check");
	HttpServletRequest request = ServletActionContext.getRequest();
	HttpServletResponse response = ServletActionContext.getResponse();
	response.setCharacterEncoding("UTF-8");
	
	try {
		request.setCharacterEncoding("UTF-8");
		Cookie[] cks=request.getCookies();
		if(cks!=null){
			for (int i = 0; i < cks.length; i++) {
				String name=cks[i].getName();
				String value=cks[i].getValue();
					if(name.equals(username)==true){
					this.userpwd = value;
					break;
					}
					}
				}
		
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		return "success";
	}


}
