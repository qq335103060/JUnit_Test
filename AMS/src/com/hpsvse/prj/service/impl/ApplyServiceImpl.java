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
	
	

	//��ѯ��ǰ����û����е����뵥
	public List<Applyinfo> findAllById(Long id){
		return this.applyinfoDAO.findAllById(id);
	}
	
	//ɾ��
	public void delete(Long id){
		this.applyinfoDAO.delete(id);
	}
	
//��ѯ���е�ǰ��½�˵ġ���Ҫ��������뵥
	public List<Applyinfo> findAllchuli(Applyinfo apply) {
		// TODO Auto-generated method stub
		return this.applyinfoDAO.findAllchuli(apply);
	}


}
