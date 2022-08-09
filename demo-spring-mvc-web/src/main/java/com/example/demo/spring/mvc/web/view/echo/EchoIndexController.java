package com.example.demo.spring.mvc.web.view.echo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.spring.mvc.constant.ViewUri.Echo;

@Controller
@RequestMapping(Echo.INDEX)
public class EchoIndexController {

	private static final String VIEW_URL = Echo.INDEX + "/index";
	
	@RequestMapping(method = RequestMethod.GET)
	public String doGetIndex() {
		return VIEW_URL;
	}
}
