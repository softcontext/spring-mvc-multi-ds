package com.example.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping(value = "/")
	@ResponseBody
	public String home() {
		return "/ = 루트로 접근. web.xml 파일의 설정을 확인하세요.";
	}

}
