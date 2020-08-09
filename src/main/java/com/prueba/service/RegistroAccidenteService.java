package com.prueba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.entity.RegistroAccidente;

import com.prueba.interfaceService.IRegistroAccidenteService;

import com.prueba.repository.RegistroAccidenteRepository;

@Service
public class RegistroAccidenteService implements IRegistroAccidenteService {

	@Autowired
	private RegistroAccidenteRepository data;
	
	public List<RegistroAccidente> listarAccidente() {
		return (List<RegistroAccidente>)data.findAll();
	}


	public Optional<RegistroAccidente> listarAccidenteId(Long id) {
		return data.findById(id);
	}


//	public int save(RegistroAccidente rAccidente) {
//		int res = 0;
//		RegistroAccidente reAccidente = data.save(rAccidente);
//		if(!reAccidente.equals(null)) {
//			res=1;
//		}
//		return res;
//	}
	
	public RegistroAccidente save(RegistroAccidente raAccidente) {
		
		return data.save(raAccidente);
	}
	


	public void delete(Long id) {
		data.deleteById(id);	
	}

	
}