package com.lutfudolay.handler;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Exception <E> {

	private String hostname;
	
	private String path;
	
	private Date createTime;
	
	private E message;
}
