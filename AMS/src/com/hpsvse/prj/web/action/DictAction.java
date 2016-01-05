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
		
	 //添加
	public String save(){
		this.dictService.save(dictinfo);
		return "success";
	}
	//根据编号查询
	public String findById(){
		this.dictinfo=this.dictService.findById(this.dictinfo.getDictid());	       
		return "success";
	}
	//修改
	public String update(){
		this.dictService.update(dictinfo);
		return "success";
	}
	//删除
	public String delete(){
		this.dictService.deleteById(dictinfo.getDictid());
		return "success";
	}
 
}
