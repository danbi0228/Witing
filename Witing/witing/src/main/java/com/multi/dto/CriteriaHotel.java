package com.multi.dto;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import lombok.Data;

@Data
public class CriteriaHotel {
	private int pageNum;	// 현재 페이지 번호
	private int amount;		// 페이지 표시 개수
	private int skip;		// 페이지 skip
	
	public CriteriaHotel(int pageNum, int amount) {
		this.pageNum = 1;
		this.amount = amount;
		this.skip = (pageNum - 1) * amount;
	}
	
	public CriteriaHotel() {
		this(1, 6);
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
		this.skip = (pageNum - 1) * this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
		this.skip = (this.pageNum - 1) * amount;
	}
	
	public String makeQueryString(int pageNum) {
		UriComponents uriComponents = UriComponentsBuilder.newInstance()
				.queryParam("pageNum", pageNum)
				.queryParam("amount", amount)
				.build()
				.encode();
		
		return uriComponents.toUriString();
	}
	

}
