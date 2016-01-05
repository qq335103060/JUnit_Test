package com.hpsvse.prj.web.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import com.hpsvse.prj.entity.Dictinfo;


@Controller
@Scope("prototype")
@Namespace("/")
@ParentPackage("json-default")
public class DictAction extends BaseAction{
	  private Dictinfo dictinfo;
	  private List<Dictinfo> list;
	  public List<Dictinfo> getList() {
		return list;
	}

	public void setList(List<Dictinfo> list) {
		this.list = list;
	}

	public Dictinfo getDictinfo() {
		return dictinfo;
	}

	public void setDictinfo(Dictinfo dictinfo) {
		this.dictinfo = dictinfo;
	}

    
	 @Action(value="dict",results={@Result(type="json")})
	 public String findAbledDict(){
	    	 this.list = this.dictService.findAbledDict();
			return "success";
	 }
		
	 //���
	public String save(){
		this.dictService.save(dictinfo);
		return "success";
	}
	//���ݱ�Ų�ѯ
	public String findById(){
		this.dictinfo=this.dictService.findById(this.dictinfo.getDictid());	       
		return "success";
	}
	//�޸�
	public String update(){
		this.dictService.update(dictinfo);
		return "success";
	}
	//ɾ��
	public String delete(){
		this.dictService.deleteById(dictinfo.getDictid());
		return "success";
	}
 
}
