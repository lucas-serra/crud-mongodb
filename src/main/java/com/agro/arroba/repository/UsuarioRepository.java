package com.agro.arroba.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.agro.arroba.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

}
