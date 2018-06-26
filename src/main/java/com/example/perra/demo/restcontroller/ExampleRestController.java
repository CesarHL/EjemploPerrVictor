package com.example.perra.demo.restcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ExampleRestController {
	
	@RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }

}
