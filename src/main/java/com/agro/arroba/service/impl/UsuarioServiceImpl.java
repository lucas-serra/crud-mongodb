package com.agro.arroba.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agro.arroba.model.Usuario;
import com.agro.arroba.repository.UsuarioRepository;
import com.agro.arroba.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> obterTodos() {
		return this.usuarioRepository.findAll();
	}

	@Override
	public Usuario obterPorCodigo(String codigo) {
		return this.usuarioRepository.findById(codigo)
				.orElseThrow(() -> new IllegalArgumentException("Usuário não existe."));
	}

	@Override
	public Usuario criar(Usuario usuario) {
		return this.usuarioRepository.save(usuario);
	}

	@Override
	public String excluir(Usuario usuario) {
		try {
			this.usuarioRepository.delete(usuario);
			return "OK";
		} catch (Exception e) {
			return "Usuário não encontrado.";
		}
	}

}
