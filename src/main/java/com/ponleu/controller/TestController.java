package com.ponleu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ponleu.event.LogUserActionEventPublisher;

@RestController
@RequestMapping("/")
public class TestController {

	@Autowired
	private LogUserActionEventPublisher evtPublisher;

	@GetMapping
	public ResponseEntity<?> log(HttpServletRequest request) {
		
		String message = String.format("User requested from %s", request.getRemoteAddr());
		evtPublisher.publishEvent(message);
		return ResponseEntity.ok("Done...");
		
	}

}
