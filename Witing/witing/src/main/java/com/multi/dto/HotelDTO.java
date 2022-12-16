package com.multi.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class HotelDTO {
	private int hotelid;
	private int cityid;
	private int cateid;
	private String hotelname;
	private String detail;
	private String hotelimg1;
	private String hotelimg2;
	private String feature;
	
	private String name;
	private String img;
	private String catename;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date sdate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date edate;
 
}
