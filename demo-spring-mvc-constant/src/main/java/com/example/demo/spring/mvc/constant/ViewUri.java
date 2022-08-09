package com.example.demo.spring.mvc.constant;

public interface ViewUri {
	
	public interface Echo {
		static final String BASE = "/view/echo";
		static final String ECHO = BASE;
	}
	
	public interface Sample {
		static final String INDEX = "/view/sample";
	}
}