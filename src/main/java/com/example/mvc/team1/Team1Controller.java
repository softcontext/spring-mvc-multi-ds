package com.example.mvc.team1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/team1")
public class Team1Controller {

	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public String home() {
		return "/team1/";
	}

}
