package com.test.lawquiz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/contents")
    public String default01() {
		System.out.println("테스트");
        return "index2";
    }
	
	@GetMapping("/test")
    public String default02() {
		System.out.println("테스트2");
        return "test";
    }
}
