package com.prueba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.entity.Persona;
import com.prueba.interfaceService.IPersonaService;
import com.prueba.repository.PersonaRepository;

@Service
public class PersonaService implements IPersonaService{

	@Autowired
	private PersonaRepository data;

	@Override
	public List<Persona> listarPersona() {
		return (List<Persona>)data.findAll();
		
	}

	@Override
	public Optional<Persona> listarPersonaId(Long id) {
		return data.findById(id);
	}

	@Override
	public int save(Persona p) {
		int res = 0;
		Persona persona = data.save(p);
		if(!persona.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(Long id) {
		data.deleteById(id);
		
	}
}
