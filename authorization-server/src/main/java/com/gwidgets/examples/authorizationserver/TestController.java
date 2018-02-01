package com.gwidgets.examples.authorizationserver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/test")
public class TestController {
	
	@GetMapping()
	public String test() {
		return "test";
	}

}
