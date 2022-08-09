package com.example.demo.spring.mvc.web.view.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.spring.mvc.constant.ViewUri.Sample;;

@Controller
@RequestMapping(Sample.INDEX)
public class SampleController {

	private static final String VIEW_URL = Sample.INDEX + "/index";
	
	@RequestMapping(method = RequestMethod.GET)
	public String doGetIndex() {
		return VIEW_URL;
	}
}
