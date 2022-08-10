package com.example.demo.spring.mvc.domain.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class EchoForm implements IForm {

	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	@Size(min=2, max=30)
	private String inputText;
	
	public String getInputText() {
		return inputText;
	}
	
	public void setInputText(String inputText) {
		this.inputText = inputText;
	}
}
