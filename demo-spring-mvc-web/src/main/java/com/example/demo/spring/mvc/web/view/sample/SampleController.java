package com.example.demo.spring.mvc.web.view.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.spring.mvc.constant.ViewUri.Sample;;

@Controller
public class SampleController {

	private static final String TEST_URL = Sample.INDEX;
	private static final String TEST_VIEW_URL = Sample.INDEX + "/index";
	
	@RequestMapping(value = TEST_URL, method = RequestMethod.GET)
	public String doGetIndex() {
		return TEST_VIEW_URL;
	}
}
