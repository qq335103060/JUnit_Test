package com.hpsvse.prj.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hpsvse.prj.entity.Applyinfo;
@Service
public interface IApplyService {
	public List<Applyinfo> findApprove(Applyinfo apply);
	//���ݱ�Ų�ѯ
	public Applyinfo findApplyById(long appId);
	
	//����
	public void update(Applyinfo applyinfo);
	
	public List<Applyinfo> findFenpei(Applyinfo applyinfo);
	
	
	//��ѯ��ǰ����û����е����뵥
	public List<Applyinfo> findAllById(Long id);
	
	//ɾ��
	public void delete(Long id);
	
	//��ѯ���е�ǰ��½�ˡ���Ҫ��������뵥
	public List<Applyinfo> findAllchuli(Applyinfo apply);
	
}
