package com.example.demo.spring.mvc.web.httphandle.process;

import org.springframework.web.servlet.ModelAndView;
import com.example.demo.spring.mvc.domain.form.IForm;

public abstract class AbstractViewProcess<TForm extends IForm> extends AbstractProcess<TForm, ModelAndView>{

	@Override
	public ModelAndView onValidationError() {
		// TODO : デフォルトエラーページを用意する
		return null;
	}

	@Override
	public ModelAndView onUnExpectedError() {
		// TODO : デフォルトエラーページを用意する
		return null;
	}
}
