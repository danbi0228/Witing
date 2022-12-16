package com.multi.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.multi.dto.AccompanyDTO;
import com.multi.dto.Criteria;
import com.multi.dto.PostDTO;
import com.multi.frame.MyService;
import com.multi.mapper.PostMapper;

@Service
public class PostService implements MyService<Integer, PostDTO>{
	@Autowired
	PostMapper mapper;

	@Override
	public void register(PostDTO v) throws Exception {
		mapper.insert(v);
	}

	@Override
	public void remove(Integer k) throws Exception {
		mapper.delete(k);
	}

	@Override
	public void modify(PostDTO v) throws Exception {
		mapper.update(v);
	}

	@Override
	public PostDTO get(Integer k) throws Exception {
		return mapper.select(k);
	}

	@Override
	public List<PostDTO> getall() throws Exception {
		return mapper.selectall();
	}
	public void qnainsert(PostDTO v) throws Exception {
		mapper.qnainsert(v);
	}
	public void reviewinsert(PostDTO v) throws Exception {
		mapper.reviewinsert(v);
	}
	public List<PostDTO> myqna(String custid) throws Exception {
		return mapper.myqna(custid);
	}
	public List<PostDTO> qnalist5(int hotelid) throws Exception {
		return mapper.qnalist5(hotelid);
	}
	public List<PostDTO> hotelqnaall(int hotelid) throws Exception {
		return mapper.hotelqnaall(hotelid);
	}

	public PostDTO selectanswer(int postid) throws Exception {
		return mapper.selectanswer(postid);
	}
	public PostDTO answercheck(int toppostid) throws Exception {
		return mapper.answercheck(toppostid);
	}
	public List<PostDTO> myreview(String custid) throws Exception{
		return mapper.myreview(custid);
	}
	public PostDTO reviewdetail(int postid) throws Exception {
		return mapper.reviewdetail(postid);
	}
	public List<PostDTO> reviewlist5(int hotelid) throws Exception {
		return mapper.reviewlist5(hotelid);
	}
	public List<PostDTO> hotelreviewall(int hotelid) throws Exception {
		return mapper.hotelreviewall(hotelid);
	}
	public PostDTO reviewocr(int orderid) throws Exception{
		return mapper.reviewocr(orderid);
	}
	public List<PostDTO> myreviewpage(Criteria cri) throws Exception {
		return mapper.myreviewpage(cri);
	}
	public int myreviewcnt(Criteria cri) throws Exception {
		return mapper.myreviewcnt(cri);
	}
	public List<PostDTO> reviewmorepage(Criteria cri) throws Exception {
		return mapper.reviewmorepage(cri);
	}
	public int reviewmorecnt(Criteria cri) throws Exception {
		return mapper.reviewmorecnt(cri);
	}
	public List<PostDTO> myqnapage(Criteria cri) throws Exception {
		return mapper.myqnapage(cri);
	}
	public int myqnacnt(Criteria cri) throws Exception {
		return mapper.myqnacnt(cri);
	}
	public List<PostDTO> qnamorepage(Criteria cri) throws Exception {
		return mapper.qnamorepage(cri);
	}
	public int qnamorecnt(Criteria cri) throws Exception {
		return mapper.qnamorecnt(cri);
	}
}
