package com.lanches.apirest.control;

import com.lanches.apirest.dao.IngredientesDao;
import com.lanches.apirest.models.Ingrediente;
import java.util.List;

public class IngredienteControl {
	private IngredientesDao ingredientes;
	
	public List<Ingrediente> listarIngredientes(){		
		return ingredientes.getAllIngredientes();
	}


	public Ingrediente pegarIngrediente(int idIngrediente) {
		return ingredientes.getIngrediente(idIngrediente);
	}
	
	

}
