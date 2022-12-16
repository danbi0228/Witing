package com.multi.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Service;

import com.multi.dto.AccompanyDTO;
import com.multi.dto.Criteria;
import com.multi.frame.MyService;
import com.multi.mapper.AccompanyMapper;

@Service
public class AccompanyService implements MyService<Integer, AccompanyDTO>{

	@Autowired
	AccompanyMapper mapper;

	@Override
	public void register(AccompanyDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(AccompanyDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public AccompanyDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<AccompanyDTO> getall() throws Exception {
		return mapper.selectall();
	}
	
	public void accomdel(int accomid) throws Exception {
		mapper.accomdel(accomid);
	}
	
	public List<AccompanyDTO> accompage(Criteria cri) throws Exception {
		return mapper.accompage(cri);
	}
	
	public int accomcnt(Criteria cri) throws Exception {
		return mapper.accomcnt(cri);
	}
	
	public List<AccompanyDTO> searchaccom(Criteria cri, Date sdate, Date edate) throws Exception {
		return mapper.searchaccom(cri, sdate, edate);
	}
	
	public int searchaccomcnt(Criteria cri, Date sdate, Date edate) throws Exception {
		return mapper.searchaccomcnt(cri, sdate, edate);
	}
}
