package com.hpsvse.prj.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hpsvse.prj.entity.Applyinfo;
import com.hpsvse.prj.service.IApplyService;
@Service
public class ApplyServiceImpl extends BaseService implements IApplyService {

	public List<Applyinfo> findApprove(Applyinfo apply) {

		return this.applyinfoDAO.findAllApprove(apply);
	}

	public Applyinfo findApplyById(long appId) {
		return this.applyinfoDAO.findById(appId);
	}

	public void update(Applyinfo applyinfo) {
		this.applyinfoDAO.attachDirty(applyinfo);
	}

	public List<Applyinfo> findFenpei(Applyinfo applyinfo) {
		return this.applyinfoDAO.findAllFenpei(applyinfo);
	}
	
	

	//查询当前编号用户所有的申请单
	public List<Applyinfo> findAllById(Long id){
		return this.applyinfoDAO.findAllById(id);
	}
	
	//删除
	public void delete(Long id){
		this.applyinfoDAO.delete(id);
	}
	
//查询所有当前登陆人的。需要处理的申请单
	public List<Applyinfo> findAllchuli(Applyinfo apply) {
		// TODO Auto-generated method stub
		return this.applyinfoDAO.findAllchuli(apply);
	}


}
