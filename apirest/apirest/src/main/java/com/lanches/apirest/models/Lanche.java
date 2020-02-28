package com.lanches.apirest.models;

import java.util.List;

public class Lanche {
	private int id;
	private String nome;
	private List<IngredienteLanche> ingredientes;
	
	public Lanche(String nome,  List<IngredienteLanche> ingredientes) {
		this.nome = nome;
		this.ingredientes = ingredientes;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<IngredienteLanche> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<IngredienteLanche> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	public void addIngrediente(IngredienteLanche ingrediente) {
		this.ingredientes.add(ingrediente);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
