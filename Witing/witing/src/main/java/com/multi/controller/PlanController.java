package com.multi.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.dto.CustDTO;
import com.multi.dto.PlanDTO;
import com.multi.dto.PostDTO;
import com.multi.dto.ReplyDTO;
import com.multi.service.CustService;
import com.multi.service.PlanService;
import com.multi.service.ReplyService;

@Controller

public class PlanController {
	
	String dir = "accompany/";
	
	@Autowired
	PlanService service;
	
	@Autowired
	CustService cust_service;
	
	@Autowired
	ReplyService reply_service;
	
	@RequestMapping("/plan")
	public String main(Model model, int accomid, String title, Date traveltime, Integer cnt, String gender,
			String country, String custid, Date birth, String accomtext, String planname, String todo, Integer planid,
			Integer replyid, String certification,String type) {
		List<PlanDTO> list = null;
		List<PlanDTO> xy = null;
		List<ReplyDTO> reply = null;
		CustDTO cust = null;
		try {
			list = service.plandetail(accomid);
			xy = service.xy(accomid);
			reply = reply_service.accomreply(accomid);
			cust = cust_service.get(custid);
			model.addAttribute("cust", cust);
			
			model.addAttribute("type", list.get(0).getType());
			model.addAttribute("certification", list.get(0).getCertification());
			model.addAttribute("reply", reply);
			model.addAttribute("xy", xy);
			model.addAttribute("list", list);
			model.addAttribute("center", dir+"plan");
			
			model.addAttribute("title", list.get(0).getTitle());
			model.addAttribute("traveltime", list.get(0).getTraveltime());
			model.addAttribute("cnt", list.get(0).getCnt());
			model.addAttribute("gender", list.get(0).getGender());
			model.addAttribute("country", list.get(0).getCountry());
			model.addAttribute("custid", list.get(0).getCustid());
			model.addAttribute("birth", list.get(0).getBirth());
			model.addAttribute("accomtext", list.get(0).getAccomtext());
			model.addAttribute("accomid",accomid);
			model.addAttribute("replyid",replyid);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "index";
	}
	
	@RequestMapping("/mbti")
	public String mbti(Model model) {
		model.addAttribute("center", dir+"mbti");
		return "index";
	}
	@RequestMapping("/result")
	public String result(Model model, String type, String custid) {
		CustDTO cust = null;
		try {
			cust = cust_service.mbti(type, custid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("mbtiType", type);
		model.addAttribute("center", dir+"result");
		return "index";
	}
}
