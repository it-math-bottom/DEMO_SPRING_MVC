package com.example.demo.spring.mvc.web.view.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.spring.mvc.constant.ViewUri.Sample;
import com.example.demo.spring.mvc.web.reqhandler.controller.AbstractController;
import com.example.demo.spring.mvc.web.reqhandler.process.AbstractNoFormProcess;

@Controller
@RequestMapping(Sample.INDEX)
public class SampleController extends AbstractController {

	private static final String VIEW_URL = Sample.INDEX + "/index";
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView doGetIndex() {
		return super.handleRequest(null, null, new AbstractNoFormProcess() {
			@Override
			public ModelAndView onMainProcess() {
				return new ModelAndView(VIEW_URL);
			}
		});
	}
}
