package com.lanches.apirest.control;

import com.lanches.apirest.dao.IngredientesDao;
import com.lanches.apirest.models.Ingrediente;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

@Controller
public class IngredienteControl {
	@Autowired
	private IngredientesDao ingredientes;
	
	public List<Ingrediente> listarIngredientes(){		
		return ingredientes.getAllIngredientes();
	}
	
	public Ingrediente pegarIngrediente(int idIngrediente) {
		return ingredientes.getIngrediente(idIngrediente);
	}
	
	

}
