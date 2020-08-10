package com.prueba.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prueba.security.User;


@Controller
public class IndexController {
	
	
	
	@RequestMapping(value={"/panel", "/panel/"}, method = RequestMethod.GET)
	public String panel(Model model) {		
		model.addAttribute("usuario");
		model.addAttribute("title", "Nuevo Registro de Accidente");
		return "index";
		
	}
	
	@GetMapping({"/login", "",  "/"})
	public String login(Model model) {		
		model.addAttribute("titulo", "Loguearse");
		return "loginBase";
		
	}
	
	@GetMapping({"/error"})
	public String error404(Model model) {		
		model.addAttribute("titulo", "Error");
		return "errorPage";
		
	}
}

