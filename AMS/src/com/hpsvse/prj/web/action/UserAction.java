package com.hpsvse.prj.web.action;


import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hpsvse.prj.entity.Deptinfo;
import com.hpsvse.prj.entity.Userinfo;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
@Namespace("/")
@ParentPackage("json-default")
@SuppressWarnings("serial")
public class UserAction extends BaseAction implements SessionAware{
	private Userinfo user;
	private String msg;
	private String code;
	private List<Userinfo> userList;
	private Map<String, Object> session;
	private List<Deptinfo> deptinfos;

	public List<Deptinfo> getDeptinfos() {
		return deptinfos;
	}
	public void setDeptinfos(List<Deptinfo> deptinfos) {
		this.deptinfos = deptinfos;
	}
	
	
	private Deptinfo dept;
	
	public Deptinfo getDept() {
		return dept;
	}
	public void setDept(Deptinfo dept) {
		this.dept = dept;
	}
	
	
	
	
	public void setSession(Map<String, Object> arg0) {
		this.session=arg0;
	}

	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Userinfo getUser() {
		return user;
	}
	public void setUser(Userinfo user) {
		this.user = user;
	}
	
	
	public List<Userinfo> getUserList() {
		return userList;
	}
	public void setUserList(List<Userinfo> userList) {
		this.userList = userList;
	}
	

	



	//����û������
	@Action(value = "find",results={@Result(type="redirect",name="error",location="/login.jsp"),
			@Result(type="dispatcher",name="success1",location="/index2.jsp")	,
			@Result(type="dispatcher",name="success2",location="/index.jsp"),			
	})

	public String findByName() throws UnsupportedEncodingException{
		String a = "error";
		String yzm = (String) ServletActionContext.getRequest().getSession().getAttribute("check");
		if (!yzm.equalsIgnoreCase(this.code)) {
			this.msg = "��֤���������";
			
		}else{
			this.user = this.userService.findByName(user);
			if(user==null){
				this.msg="�û�����������";
			}
			else{
				session.put("u", user);
				
				HttpServletResponse response = ServletActionContext.getResponse();
				HttpServletRequest request = ServletActionContext.getRequest();
				response.setCharacterEncoding("UTF-8");
				request.setCharacterEncoding("UTF-8");
				if(user.getUserlevel().equals("1")== true || user.getUserlevel().equals("0")==true){
					String username = user.getUsername();
					String userpwd = user.getUserpwd();
					Cookie ck=new  Cookie(username,userpwd);
					ck.setMaxAge(18000);
					response.addCookie(ck);
					a="success1";
				}
				else{
					String username = user.getUsername();
					String userpwd = user.getUserpwd();
					Cookie ck=new  Cookie(username,userpwd);
					ck.setMaxAge(18000);
					response.addCookie(ck);
					a="success2";
				}
			}
		}
		session.put("msg", msg);
		return a;
	}
	
	//��ѯ���е��û�
	@Action(value="user",results={@Result(type="json",name="success")})
	public String findAll(){
		this.userList=this.userService.findAll();
		return "success";
	}

	
	
	
	//��ѯ���������õ��û�
	@Action(value="abled",results={@Result(type="json",name="success")})
	public String findAbledUser(){
		this.userList=this.userService.findAbledUser();
		return "success";
	}
	
	

	//ɾ���û�
	public String deleteById(){
		this.userService.deleteById(user.getUserid());
		return null;
	}

	
	//��ѯ��ǰ�û���Ϣ
	@Action(value="detail",results={@Result(type="json",name="success")})
	public String findById(){
		//�û�
		this.user=this.userService.findById(user.getUserid());
		this.deptinfos=this.deptService.findAbledDept();
		return "success";
	}
	
	//�޸�
	public String update(){
		this.userService.update(user);
		return null;
	}

	
	
	
	//���
	public String addUser(){
		this.userService.addUser(user);
		return null;
	}
	
	
	//�������õ��û���Ϣ�Ĳ�ѯ���޸�
	@Action(value="induser",results={@Result(type="json")})
	public String findByuserid(){
		long userid = this.user.getUserid();
		this.user = this.userService.findByuserid(userid);
		return "success";
	}
	public String updateforuserId(){
		long userid = this.user.getUserid();
		String username = this.user.getUsername();
		String userpwd = this.user.getUserpwd();
		String useradd = this.user.getUseradd();
		String usertel = this.user.getUsertel();
		String usersex = this.user.getUsersex();
		this.user = this.userService.findById(userid);
		this.user.setUseradd(useradd);
		this.user.setUsername(username);
		this.user.setUsertel(usertel);
		this.user.setUsersex(usersex);
		this.userService.updateforuserId(user);
		return "success";
	}
	
	
	//ģ���ѯ
	@Action(value="mohu",results={@Result(type="json")})
	public String findBCondition(){
		this.userList=this.userService.findBCondition(user.getUsername());
		return "success";
	}
	
	//��ݲ��ű�Ų�ѯ
	@Action(value="findDeptId",results={@Result(type="json")})
	public String findByUserDeptId(){
		this.userList=this.userService.findUserByDept(dept.getDeptid());
		return "success";
	}

	
	
	//��ѯ��ǰ�û��Ƿ����
	@Action(value="isExist",results={@Result(type="json")})
	public String findByUname(){
		this.userList=this.userService.findbyUname(user.getUsername());
		return "success";
	}
}
