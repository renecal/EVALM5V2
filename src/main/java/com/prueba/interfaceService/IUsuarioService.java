package com.prueba.interfaceService;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;
import com.prueba.security.Usuario;


public interface IUsuarioService {

	public List<Usuario> listarUsuario();
	public Optional<Usuario> listarUsuarioId(Long id);
	public Usuario findOne(Long id);
	public int save (Usuario p);
	public void delete (Long id);
}
