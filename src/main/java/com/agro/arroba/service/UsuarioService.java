package com.agro.arroba.service;

import java.util.List;

import com.agro.arroba.model.Usuario;

public interface UsuarioService {

	public List<Usuario> obterTodos();
	
	public Usuario obterPorCodigo(String codigo);
	
	public Usuario criar(Usuario usuario);
	
	public String excluir(Usuario usuario);
}
