package com.example.demo.spring.mvc.web.view.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {

	private static final String TEST_URL = "/sample";
	private static final String TEST_VIEW_URL = "/view/sample/index";
	
	@RequestMapping(value = TEST_URL, method = RequestMethod.GET)
	public String doGetIndex() {
		return TEST_VIEW_URL;
	}
}
