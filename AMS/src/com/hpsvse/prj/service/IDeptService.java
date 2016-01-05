package com.hpsvse.prj.service;

import java.util.List;

import com.hpsvse.prj.entity.Deptinfo;

public interface IDeptService {
	//查询所有启用的部门
	public List<Deptinfo> findAbledDept(); 
	
	//删除
	public void deleteById(Long id);
	
	//添加
	public void addDept(Deptinfo dept);
	
	//修改
	public void updateDept(Deptinfo dept);
	
	//根据编号查询
	public Deptinfo findById(Long id);

}
