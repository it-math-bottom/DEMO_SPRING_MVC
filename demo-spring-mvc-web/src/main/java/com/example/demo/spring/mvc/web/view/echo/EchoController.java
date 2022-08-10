package com.example.demo.spring.mvc.web.view.echo;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.BindingResult;
import com.example.demo.spring.mvc.constant.ViewUri.Echo;
import com.example.demo.spring.mvc.domain.form.EchoForm;
import com.example.demo.spring.mvc.web.reqhandler.controller.AbstractController;
import com.example.demo.spring.mvc.web.reqhandler.process.AbstractViewProcess;

@Controller
@RequestMapping(Echo.ECHO)
public class EchoController extends AbstractController {

	private static final String INPUT_VIEW_URL = Echo.ECHO + "/input";
	private static final String OUTPUT_VIEW_URL = Echo.ECHO + "/output";
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView doGet(final EchoForm echoForm) {
		return super.handleRequest(echoForm, null, new AbstractViewProcess<EchoForm>() {
			@Override
			public ModelAndView onMainProcess() {
				return new ModelAndView(INPUT_VIEW_URL);
			}
		});
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView doPost(@Valid final EchoForm form, final BindingResult result) {
		return super.handleRequest(form, result, new AbstractViewProcess<EchoForm>() {
			@Override
			public ModelAndView onMainProcess() {
				return new ModelAndView(OUTPUT_VIEW_URL);
			}
			
			@Override
			public ModelAndView onValidationError() {
				return new ModelAndView(INPUT_VIEW_URL);
			}
		});
	}
}
