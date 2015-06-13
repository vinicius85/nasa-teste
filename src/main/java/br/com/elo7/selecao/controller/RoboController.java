package br.com.elo7.selecao.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoboController {
	

	    @RequestMapping("/")
	    public String index() {
	        return "Greetings from Spring Boot!";
	    }


}
