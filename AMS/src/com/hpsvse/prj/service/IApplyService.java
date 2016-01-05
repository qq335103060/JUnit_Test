package com.hpsvse.prj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hpsvse.prj.entity.Applyinfo;
@Service
public interface IApplyService {
	public List<Applyinfo> findApprove(Applyinfo apply);
	//根据编号查询
	public Applyinfo findApplyById(long appId);
	
	//审批
	public void update(Applyinfo applyinfo);
	
	public List<Applyinfo> findFenpei(Applyinfo applyinfo);
	
	
	//查询当前编号用户所有的申请单
	public List<Applyinfo> findAllById(Long id);
	
	//删除
	public void delete(Long id);
	
	//查询所有当前登陆人、需要处理的申请单
	public List<Applyinfo> findAllchuli(Applyinfo apply);
	
}
