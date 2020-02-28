package com.lanches.apirest.dao;
import com.lanches.apirest.models.Ingrediente;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class IngredientesDao {
	private static List<Ingrediente> ingredientes = new ArrayList<Ingrediente>(); 
		
	public IngredientesDao() {
		init();
	}
	
	private void init() {
		ingredientes.add(new Ingrediente(1,"pao",2));
		ingredientes.add(new Ingrediente(2,"queijo",2));
		ingredientes.add(new Ingrediente(3,"cebola",2));
		ingredientes.add(new Ingrediente(4,"pressunto",2));
		ingredientes.add(new Ingrediente(5,"tomate",2));
		ingredientes.add(new Ingrediente(6,"alface",2));
		ingredientes.add(new Ingrediente(7,"hamburguer de carne",2));
		ingredientes.add(new Ingrediente(8,"hamburger de frango",2));
	}
	
	public  List<Ingrediente> getAllIngredientes(){
		return ingredientes;
	}
	
	public  Ingrediente getIngrediente(int id) {
		return ingredientes.stream()
				.filter( x -> (id == x.getId()))
				.findAny()
				.orElse(null);
	}
	
	
}
