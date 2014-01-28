package com.sample.app.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sample.app.domain.Greeting;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();


	@RequestMapping(value= "/greeting", method= RequestMethod.PUT)
	public @ResponseBody Greeting greeting(@RequestBody Greeting greeting) {
		return new Greeting(counter.incrementAndGet(), "Ola!");
	}

}
