package com.example.demo.spring.mvc.web.httphandle.controller;

import javax.validation.Valid;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import org.springframework.validation.BindingResult;

import com.example.demo.spring.mvc.web.httphandle.process.IProcess;

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
