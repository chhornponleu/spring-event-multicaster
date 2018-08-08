package com.ponleu;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@EnableAsync
public class ApplicationEventConfiguration {

	public ApplicationEventMulticaster applicationEventMulticaster() {

		SimpleApplicationEventMulticaster evt = new SimpleApplicationEventMulticaster();
		evt.setTaskExecutor(new SimpleAsyncTaskExecutor());
		return evt;

	}

}
