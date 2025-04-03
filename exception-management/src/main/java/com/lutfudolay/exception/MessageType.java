package com.lutfudolay.exception;

import lombok.Getter;

@Getter
public enum MessageType {

	NO_RECORD_EXIST("1001","KAYIT BULUNAMADI"),
	GENERAL_EXCEPTION("9999","GENEL BİR HATA OLUŞTU");
	
	private String code;
	
	private String message;
	
	MessageType(String code, String message) {
		this.code=code;
		this.message=message;
	}

}
