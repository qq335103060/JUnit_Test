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
	
	//É¾³ý×Öµä
	public void deleteById(Long id);
	
	//ÐÞ¸Ä×Öµä
	public abstract void update(Dictinfo dict);
	//¸ù¾Ý±àºÅ²éÑ¯
	public Dictinfo findById(Long id);
	//Ìí¼Ó
	public void save(Dictinfo dictinfo);
}