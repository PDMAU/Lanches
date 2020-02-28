package com.lanches.apirest.dao;
import com.lanches.apirest.models.Ingrediente;
import java.util.List;


public final class IngredientesDao {
	private static List<Ingrediente> ingredientes; 
	
	private IngredientesDao() {
		super();
		ingredientes.add(new Ingrediente("pao",2));
		ingredientes.add(new Ingrediente("queijo",2));
		ingredientes.add(new Ingrediente("cebola",2));
		ingredientes.add(new Ingrediente("pressunto",2));
		ingredientes.add(new Ingrediente("tomate",2));
		ingredientes.add(new Ingrediente("alface",2));
		ingredientes.add(new Ingrediente("hamburguer de carne",2));
		ingredientes.add(new Ingrediente("hamburger de frango",2));
		
	}
	
	public static List<Ingrediente> getAllIngredientes(){
		return ingredientes;
	}
	
	public static Ingrediente getIngrediente(int id) {
		return ingredientes.stream()
				.filter( x -> (id == x.getId()))
				.findAny()
				.orElse(null);
	}
	
	
}
