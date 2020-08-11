package com.prueba.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prueba.entity.Persona;
import com.prueba.interfaceService.IPersonaService;
import com.prueba.interfaceService.IUsuarioService;
import com.prueba.security.User;

@Controller
public class ProfileController {

	
	@Autowired
	IPersonaService pService;
	
	@Autowired
	IUsuarioService uService; 
	
	@RequestMapping("/editarPerfil")
	public String editarPerfil(@Validated Persona p, Model model) {
		pService.save(p);
		return "redirect:/perfil";
	}
	
	/*@RequestMapping("/editarPerfilId{id}")
	public String editarPerfilId(@PathVariable Long id, Model model) {
		Optional<Persona> persona = pService.listarPersonaId(id);
		model.addAttribute("item", persona);
		return "redirect:/perfil";
	}
	
	@RequestMapping("/editarU")
	public String editarUsuario(@Validated User u, Model model) {
		uService.save(u);
		return "redirect:/perfil";
	}
	*/
}
