package com.prueba.interfaceService;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;
import com.prueba.security.User;


public interface IUsuarioService {

	public List<User> listarUsuario();
	public Optional<User> listarUsuarioId(Long id);
	public User findOne(Long id);
	public int save (User p);
	public void delete (Long id);
}
