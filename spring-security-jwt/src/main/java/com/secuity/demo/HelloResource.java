package com.secuity.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloResource {

	@RequestMapping("/welcome")
	public String welcome() {

		String text = "this is private page";
		text += "this page is not allowed to unauthenticated users";

		return text;
	}
}
