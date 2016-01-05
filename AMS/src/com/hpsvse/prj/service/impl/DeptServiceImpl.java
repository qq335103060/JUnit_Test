package com.hpsvse.prj.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hpsvse.prj.entity.Deptinfo;
import com.hpsvse.prj.service.IDeptService;
@Service
public class DeptServiceImpl extends BaseService implements IDeptService {

	//��ѯ�������õĲ���
	public List<Deptinfo> findAbledDept(){
		return this.deptDAO.findAbledDept();
	}
	
	//ɾ��
	public void deleteById(Long id){
		this.deptDAO.deleteById(id);
	}

	
	//���
	public void addDept(Deptinfo dept){
		this.deptDAO.save(dept);
	}
	
	//�޸�
	public void updateDept(Deptinfo dept){
		this.deptDAO.update(dept);
	}
	
	
	//���ݱ�Ų�ѯ
	public Deptinfo findById(Long id){
		return this.deptDAO.findById(id);
	}
}
