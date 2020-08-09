package com.prueba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.entity.TipoAccidente;
import com.prueba.interfaceService.ITipoAccidenteService;
import com.prueba.repository.TipoAccidenteRepository;

@Service
public class TipoAccidenteService implements ITipoAccidenteService{

	@Autowired
	private TipoAccidenteRepository data;
	
	@Override
	public List<TipoAccidente> listarTipoAccidente() {
		return (List<TipoAccidente>)data.findAll();
	}

	@Override
	public Optional<TipoAccidente> listarTipoAccidenteId(Long id) {
		return data.findById(id);
	}

	@Override
	public int save(TipoAccidente tAccidente) {
	 int res = 0;
	 TipoAccidente tiAcc = data.save(tAccidente);
	 if(!tiAcc.equals(null)) {
		 res=1;
	 }
	 return res;
	}

	@Override
	public void delete(Long id) {
		data.deleteById(id);
	}

}
