package com.prueba.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.prueba.interfaceService.IPersonaService;

@Controller
public class PersonaController {

	@Autowired
	IPersonaService iper;
	
	
}
