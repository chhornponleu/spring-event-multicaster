package com.ponleu.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class LogUserActionEventListener implements ApplicationListener<LogUserActionEvent> {

	@Override
	public void onApplicationEvent(LogUserActionEvent event) {
		try {
			Thread.sleep(3000);
			System.out.println("\n\n********** start user action events **************");
			System.out.println(event.getMessage());
			System.out.println("********** start user action events **************");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
