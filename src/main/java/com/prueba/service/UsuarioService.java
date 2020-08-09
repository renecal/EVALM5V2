package com.prueba.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.entity.Persona;
import com.prueba.interfaceService.IUsuarioService;
import com.prueba.security.Usuario;
import com.prueba.security.UserRepository;

@Service
public class UsuarioService implements IUsuarioService{
	
	@Autowired UserRepository u;

	@Override
	public List<Usuario> listarUsuario() {
		return (List<Usuario>)u.findAll();
	}

	@Override
	public Optional<Usuario> listarUsuarioId(Long id) {
		return u.findById(id);
	}

	@Override
	public int save(Usuario p) {
		int res = 0;
		Usuario usuario = u.save(p);
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
	public Usuario findOne(Long id) {

		// TODO Auto-generated method stub
		return u.findById(id).orElse(null);
	}

}
