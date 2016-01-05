package com.hpsvse.prj.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hpsvse.prj.entity.Applyinfo;
import com.hpsvse.prj.entity.Typeinfo;
import com.hpsvse.prj.service.ITypeService;
@Service
public class TypeService extends BaseService implements ITypeService {
	public List<Typeinfo> findFeipei(Long userId){
		return this.typeDAO.findByuserId(userId);
	}
	

	//查询所有启用的部门
	public List<Typeinfo> findAbledType(){
		return this.typeDAO.findAbledType();
	}
	
	//删除
	public void deleteById(Long id){
		this.typeDAO.deleteById(id);
	}

	
	//添加
	public void addType(Typeinfo type){
		this.typeDAO.save(type);
	}
	
	//修改
	public void updateType(Typeinfo type){
		this.typeDAO.update(type);
	}
	
	
	//根据编号查询
	public Typeinfo findById(Long id){
		return this.typeDAO.findById(id);
	}

}
