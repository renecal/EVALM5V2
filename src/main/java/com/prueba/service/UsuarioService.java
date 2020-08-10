package com.prueba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.entity.Persona;
import com.prueba.interfaceService.IUsuarioService;
import com.prueba.security.User;
import com.prueba.security.UserRepository;

@Service
public class UsuarioService implements IUsuarioService{
	
	@Autowired UserRepository u;

	@Override
	public List<User> listarUsuario() {
		return (List<User>)u.findAll();
	}

	@Override
	public Optional<User> listarUsuarioId(Long id) {
		return u.findById(id);
	}

	@Override
	public int save(User p) {
		int res = 0;
		User usuario = u.save(p);
		if(!usuario.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(Long id) {
		u.deleteById(id);
		
	}

	@Override
	public User findOne(Long id) {

		// TODO Auto-generated method stub
		return u.findById(id).orElse(null);
	}

}
