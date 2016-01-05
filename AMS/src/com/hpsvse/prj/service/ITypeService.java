package com.hpsvse.prj.service;

import java.util.List;

import com.hpsvse.prj.entity.Typeinfo;

public interface ITypeService {
	public List<Typeinfo> findFeipei(Long userId);
	
	//��ѯ�������õ���������
	public List<Typeinfo> findAbledType(); 
	
	//ɾ��
	public void deleteById(Long id);
	
	//���
	public void addType(Typeinfo dept);
	
	//�޸�
	public void updateType(Typeinfo type);
	
	//���ݱ�Ų�ѯ
	public Typeinfo findById(Long id);


}
