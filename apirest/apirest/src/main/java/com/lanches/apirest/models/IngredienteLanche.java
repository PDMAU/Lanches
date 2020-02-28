package com.lanches.apirest.models;

public class IngredienteLanche extends Ingrediente{
	
	private int quantidade;
	
	public IngredienteLanche(int id, String nome, float preco, int quantidade) {
		super(id, nome, preco);
		this.quantidade = quantidade;
	}
		
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}    
	
	
}
