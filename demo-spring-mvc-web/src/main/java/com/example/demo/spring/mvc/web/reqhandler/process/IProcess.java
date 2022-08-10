package com.example.demo.spring.mvc.web.reqhandler.process;

public interface IProcess<TReq, TRes> {
	
	TRes onMainProcess();
	
	TRes onValidationError();
	
	TRes onUnexpectedError();
}
