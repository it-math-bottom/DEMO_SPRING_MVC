package com.example.demo.spring.mvc.web.reqhandler.controller;

import javax.validation.Valid;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.validation.BindingResult;

import com.example.demo.spring.mvc.web.reqhandler.process.IProcess;

public abstract class AbstractController {

	protected <TReq, TRes> TRes handleRequest(@Nullable @Valid final TReq requestForm,
										      @Nullable BindingResult bindingResult,
										      @Nonnull IProcess<TReq, TRes> process) {
		try {
			return requestForm != null && bindingResult != null && bindingResult.hasErrors()
			    ? process.onValidationError()
			    : process.onMainProcess();
		} catch (Exception e) {
			return process.onUnexpectedError();
		}
	}
}
