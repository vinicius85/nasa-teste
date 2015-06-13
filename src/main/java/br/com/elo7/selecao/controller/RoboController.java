package br.com.elo7.selecao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoboController {
	

	    @RequestMapping("/")
	    public String index() {
	        return "nasa";
	    }


}
