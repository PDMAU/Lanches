package com.lanches.apirest.models;

public class Ingrediente {

	private int id;
	private String nome;
	private float preco;
	
	public Ingrediente(String nome, float preco) {
		this.setNome(nome);
		this.setPreco(preco);
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
