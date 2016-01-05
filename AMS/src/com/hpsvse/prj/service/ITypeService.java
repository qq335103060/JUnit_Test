package com.hpsvse.prj.service;

import java.util.List;

import com.hpsvse.prj.entity.Typeinfo;

public interface ITypeService {
	public List<Typeinfo> findFeipei(Long userId);
	
	//查询所有启用的申请类型
	public List<Typeinfo> findAbledType(); 
	
	//删除
	public void deleteById(Long id);
	
	//添加
	public void addType(Typeinfo dept);
	
	//修改
	public void updateType(Typeinfo type);
	
	//根据编号查询
	public Typeinfo findById(Long id);


}
