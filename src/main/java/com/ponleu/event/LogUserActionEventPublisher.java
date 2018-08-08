package com.ponleu.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


@Component
public class LogUserActionEventPublisher {
	
	@Autowired
	private ApplicationEventPublisher applicationEventPublisher;
	
	@Async
	public void publishEvent(final String message) {
		applicationEventPublisher.publishEvent(new LogUserActionEvent(this, message)); 
	}

}
