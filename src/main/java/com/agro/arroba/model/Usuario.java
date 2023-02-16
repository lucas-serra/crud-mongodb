package com.agro.arroba.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Usuario {

	@Id
	private String codigo;

	private String nome;

	private Integer idade;

}
