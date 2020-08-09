package com.prueba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.entity.Profesional;
import com.prueba.interfaceService.IProfesionalService;
import com.prueba.repository.ProfesionalRepository;

@Service
public class ProfesionalService implements IProfesionalService {

	@Autowired
	private ProfesionalRepository data;

	@Override
	public List<Profesional> listarProfesional() {
		return (List<Profesional>)data.findAll();
	}

	@Override
	public Optional<Profesional> listarProfesionalId(Long id) {
		return data.findById(id);
	}

	@Override
	public int save(Profesional p) {
		int res=0;
		Profesional profesional = data.save(p);
		if (!profesional.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(Long id) {
		data.deleteById(id);
		
	}
}
