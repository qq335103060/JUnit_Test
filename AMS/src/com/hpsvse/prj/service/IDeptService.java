package com.hpsvse.prj.service;

import java.util.List;

import com.hpsvse.prj.entity.Deptinfo;

public interface IDeptService {
	//��ѯ�������õĲ���
	public List<Deptinfo> findAbledDept(); 
	
	//ɾ��
	public void deleteById(Long id);
	
	//���
	public void addDept(Deptinfo dept);
	
	//�޸�
	public void updateDept(Deptinfo dept);
	
	//���ݱ�Ų�ѯ
	public Deptinfo findById(Long id);

}
