package com.hsi.domain;

import java.util.Date;

import lombok.Data;

@Data
public class MemoVO {
	
	private int num;
	private String userid;
	private String content;
	private Date create;
	private Date update;

}
