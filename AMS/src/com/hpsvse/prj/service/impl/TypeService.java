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
	

	//��ѯ�������õĲ���
	public List<Typeinfo> findAbledType(){
		return this.typeDAO.findAbledType();
	}
	
	//ɾ��
	public void deleteById(Long id){
		this.typeDAO.deleteById(id);
	}

	
	//���
	public void addType(Typeinfo type){
		this.typeDAO.save(type);
	}
	
	//�޸�
	public void updateType(Typeinfo type){
		this.typeDAO.update(type);
	}
	
	
	//���ݱ�Ų�ѯ
	public Typeinfo findById(Long id){
		return this.typeDAO.findById(id);
	}

}
