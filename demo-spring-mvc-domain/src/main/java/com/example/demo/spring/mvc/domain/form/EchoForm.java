package com.example.demo.spring.mvc.domain.form;

import java.io.Serializable;

public class EchoForm implements Serializable {

	private static final long serialVersionUID = 1L;

	private String inputText;
	
	public String getInputText() {
		return inputText;
	}
	
	public void setInputText(String inputText) {
		this.inputText = inputText;
	}
}
