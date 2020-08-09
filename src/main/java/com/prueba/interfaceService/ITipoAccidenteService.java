package com.prueba.interfaceService;

import java.util.List;
import java.util.Optional;

import com.prueba.entity.TipoAccidente;

public interface ITipoAccidenteService {

	public List<TipoAccidente> listarTipoAccidente();
	public Optional<TipoAccidente> listarTipoAccidenteId(Long id);
	public int save (TipoAccidente tAccidente);
	public void delete (Long id);
}
