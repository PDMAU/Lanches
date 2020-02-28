package com.lanches.apirest.models;

public class IngredienteLanche extends Ingrediente{
	
	private int quantidade;
	
	public IngredienteLanche(String nome, float preco) {
		super(nome, preco);
	}
		
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}    
	
	
}
