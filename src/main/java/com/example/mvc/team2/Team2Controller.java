package com.example.mvc.team2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/team2")
public class Team2Controller {

	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public String home() {
		return "/team2/";
	}

}
