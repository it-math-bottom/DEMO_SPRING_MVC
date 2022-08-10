package com.example.demo.spring.mvc.web.view.echo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.BindingResult;
import com.example.demo.spring.mvc.constant.ViewUri.Echo;
import com.example.demo.spring.mvc.domain.form.EchoForm;

@Controller
@RequestMapping(Echo.ECHO)
public class EchoController {

	private static final String INPUT_VIEW_URL = Echo.ECHO + "/input";
	private static final String OUTPUT_VIEW_URL = Echo.ECHO + "/output";
	
	@RequestMapping(method = RequestMethod.GET)
	public String doGet(EchoForm echoForm) {
		return INPUT_VIEW_URL;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String doPost(@Valid EchoForm form, BindingResult result) {
		if (result.hasErrors()) {
			return INPUT_VIEW_URL;
		}
		return OUTPUT_VIEW_URL;
	}
}
