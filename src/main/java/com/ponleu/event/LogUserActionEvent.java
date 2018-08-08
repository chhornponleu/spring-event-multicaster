package com.ponleu.event;

import org.springframework.context.ApplicationEvent;

public class LogUserActionEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;
	 
	private String message;

	public LogUserActionEvent(Object source) {
		super(source);
	}

	public LogUserActionEvent(Object source, String message) {
		super(source);
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}
}
