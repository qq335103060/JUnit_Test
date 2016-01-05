package com.hpsvse.prj.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.hpsvse.prj.entity.Dictinfo;
import com.hpsvse.prj.service.IDictService;
@Service
public class DictServiceImpl extends BaseService implements IDictService {

	public void addDict(Dictinfo dictinfo) { 
       this.dictinfoDAO.save(dictinfo);
	}

	public void delDict(Dictinfo dictinfo) {
		// TODO Auto-generated method stub
		this.dictinfoDAO.delete(dictinfo);

	}
	
	public Dictinfo getDictById(Dictinfo dictinfo) {
		// TODO Auto-generated method stub
		return null;
	}
         //查询所有
	public List<Dictinfo> getDicts() {
		// TODO Auto-generated method stub
		return this.dictinfoDAO.findAll();
	}
         //删除
	public void updateDict(Dictinfo dictinfo) {
		// TODO Auto-generated method stub
		this.dictinfoDAO.attachDirty(dictinfo);
	}
                 
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		this.dictinfoDAO.deleteById(id);
		
	}
        //查询启用的所有字典
	public List<Dictinfo> findAbledDict() {
		// TODO Auto-generated method stub
		return this.dictinfoDAO.findAbledDict();
	}
       //修改
	public void update(Dictinfo dict) {
		// TODO Auto-generated method stub
		this.dictinfoDAO.update(dict);
		
	}
        //根据编号查询
	public Dictinfo findById(Long id) {
		return this.dictinfoDAO.findById(id);
	}

	public void save(Dictinfo dictinfo) {
		// TODO Auto-generated method stub
		this.dictinfoDAO.save(dictinfo);
	}

}
