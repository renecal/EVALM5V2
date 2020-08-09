package com.prueba.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prueba.entity.Persona;
import com.prueba.interfaceService.IPersonaService;
import com.prueba.interfaceService.IUsuarioService;
import com.prueba.security.Usuario;
import com.prueba.service.UsuarioService;

@Controller
public class UserController {
	
	@Autowired
	UsuarioService uservice;
	
	@Autowired
	IUsuarioService iu;
	
	@Autowired
	IPersonaService pe;
	
	@RequestMapping("/perfil")
	public String panel(Model model) {		
		Usuario datosUsuario = null;
		Long id = (long) 1;
		datosUsuario = iu.findOne(id);
		System.out.println(datosUsuario);
		model.addAttribute("title", "Perfil de Usuario");
		model.addAttribute("query", datosUsuario);
		return "profile";
		
	}
	@RequestMapping(value = "/perfil/guardar", method = RequestMethod.POST)
	public String guardar(Usuario usuario, Model model) {
		iu.save(usuario);		
		return panel(model);
	}
	
}
