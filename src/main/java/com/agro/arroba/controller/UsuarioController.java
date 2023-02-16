package com.agro.arroba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agro.arroba.model.Usuario;
import com.agro.arroba.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public List<Usuario> obterTodos() {
		return this.usuarioService.obterTodos();
	}
	
	@GetMapping("/{codigo}")
	public Usuario obterPorCodigo(@PathVariable String codigo) {
		return this.usuarioService.obterPorCodigo(codigo);
	}
	
	@PostMapping
	public Usuario criar (@RequestBody Usuario usuario) {
		return this.usuarioService.criar(usuario);
	}
	
	@DeleteMapping
	public String excluir (@RequestBody Usuario usuario) {
		return this.usuarioService.excluir(usuario);
	}
}
