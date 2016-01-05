package com.hpsvse.prj.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hpsvse.prj.entity.Deptinfo;
import com.hpsvse.prj.service.IDeptService;
@Service
public class DeptServiceImpl extends BaseService implements IDeptService {

	//查询所有启用的部门
	public List<Deptinfo> findAbledDept(){
		return this.deptDAO.findAbledDept();
	}
	
	//删除
	public void deleteById(Long id){
		this.deptDAO.deleteById(id);
	}

	
	//添加
	public void addDept(Deptinfo dept){
		this.deptDAO.save(dept);
	}
	
	//修改
	public void updateDept(Deptinfo dept){
		this.deptDAO.update(dept);
	}
	
	
	//根据编号查询
	public Deptinfo findById(Long id){
		return this.deptDAO.findById(id);
	}
}
