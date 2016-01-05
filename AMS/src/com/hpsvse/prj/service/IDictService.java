package com.hpsvse.prj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hpsvse.prj.entity.Dictinfo;
@Service
public interface IDictService {
	public List<Dictinfo> getDicts();
	public Dictinfo getDictById(Dictinfo dictinfo);
	public void addDict(Dictinfo dictinfo);
	public void delDict(Dictinfo dictinfo);
	public void updateDict(Dictinfo dictinfo);
	
	public List<Dictinfo> findAbledDict(); 
	
	//ɾ���ֵ�
	public void deleteById(Long id);
	
	//�޸��ֵ�
	public abstract void update(Dictinfo dict);
	//���ݱ�Ų�ѯ
	public Dictinfo findById(Long id);
	//���
	public void save(Dictinfo dictinfo);
}