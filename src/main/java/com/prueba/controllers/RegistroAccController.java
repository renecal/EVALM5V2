package com.prueba.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.prueba.entity.Persona;
import com.prueba.entity.Profesional;
import com.prueba.entity.RegistroAccidente;
import com.prueba.entity.TipoAccidente;
import com.prueba.interfaceService.IPersonaService;
import com.prueba.interfaceService.IProfesionalService;
import com.prueba.interfaceService.IRegistroAccidenteService;
import com.prueba.interfaceService.ITipoAccidenteService;

@Controller
@RequestMapping("/registros")
public class RegistroAccController {

	@Autowired
	private IRegistroAccidenteService rAccService; 
	@Autowired
	private ITipoAccidenteService tipoAccidenteService;
	@Autowired
	private IPersonaService personaService;
	@Autowired
	private IProfesionalService profesionalService;

	
	@GetMapping("/listar")
	public String listarRegistroAccidente(Model model) {
	    List<RegistroAccidente> regAccidente = rAccService.listarAccidente();
	    List<Profesional> listaprofesionales = profesionalService.listarProfesional();
	    List<TipoAccidente> tiposAccidentes = tipoAccidenteService.listarTipoAccidente();
	    model.addAttribute("key", regAccidente);
	    model.addAttribute("profesionales", listaprofesionales);
	    model.addAttribute("tiposAccidentes", tiposAccidentes);
		model.addAttribute("title", "Listado de Accidentes");
	    	return "registrosaccidente";
	} 
	
	@GetMapping("/nuevo")
	public String agregarRegistroAccidente(Model model) {
		List<TipoAccidente> tiposAccidentes = tipoAccidenteService.listarTipoAccidente();
		List<Persona> listapersonas = personaService.listarPersona();
		List<Profesional> listaprofesionales = profesionalService.listarProfesional();
		model.addAttribute("title", "Nuevo Registro de Accidente");
		model.addAttribute("tiposAccidentes", tiposAccidentes);
		model.addAttribute("personas", listapersonas);
		model.addAttribute("profesionales", listaprofesionales);
		 model.addAttribute("RegistroModelo", new RegistroAccidente());
		return "nuevoregistro";
	}
	
	@RequestMapping(value="/add", method = RequestMethod.POST )
	public String procesarRegistroAccidente(@ModelAttribute("registroModelo") RegistroAccidente regAccidente, Model model) {
		regAccidente = rAccService.save(regAccidente);
		//return agregarRegistroAccidente(model);
		return ("redirect:listar");
	}
	
//	@RequestMapping(value="/personasjson")
//	@ResponseBody
//	public List<String> personasJsonAutocomplete(){
//		Persona persona = null;
//		
//		List<String> personas = new ArrayList<String>();
//		System.out.println(persona.getRut().length());
//		personas.add("2");
//		return personas;
//	}
	
	@RequestMapping(value = "/registros/editar/{id}/{persona_id}")
	public String editar( @PathVariable(value = "id") Long id, @PathVariable(value = "persona_id") Long persona_id, RegistroAccidente registro, Persona persona,  Model model) {
		
		
		if(personaService.save(persona) >= 1) {
			rAccService.save(registro);
		}
		
		model.addAttribute("editado", "ok editado");
		return "registrosaccidente";
		
	}
	
	@RequestMapping(value = "/eliminar/{id}")
	public String eliminar(@PathVariable(value = "id") Long id, RedirectAttributes flash) {

		if (id > 0) {
			rAccService.delete(id);
			flash.addFlashAttribute("success", "Cliente eliminado con éxito!");
		}
		return "redirect:/registros/listar";
	}
	
}
