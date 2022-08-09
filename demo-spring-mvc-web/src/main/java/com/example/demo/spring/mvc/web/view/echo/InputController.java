package com.example.demo.spring.mvc.web.view.echo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import com.example.demo.spring.mvc.constant.ViewUri.Echo;
import com.example.demo.spring.mvc.web.tododelete.EchoForm;

@Controller
@RequestMapping(Echo.INPUT)
public class InputController {

	private static final String VIEW_URL = Echo.INPUT;
	
	@RequestMapping(method = RequestMethod.GET)
	public String doGetInput(Model model) {
		EchoForm echoForm = new EchoForm();
		model.addAttribute(echoForm);
		return VIEW_URL;
	}
}
