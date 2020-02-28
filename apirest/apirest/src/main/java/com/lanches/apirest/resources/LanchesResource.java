package com.lanches.apirest.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lanches.apirest.control.IngredienteControl;
import com.lanches.apirest.control.LancheControl;
import com.lanches.apirest.models.Ingrediente;
import com.lanches.apirest.models.IngredienteLanche;
import com.lanches.apirest.models.Lanche;

@RestController
@RequestMapping(value="/api")
public class LanchesResource {
	@Autowired
	private IngredienteControl ingredienteControler;
	@Autowired
	private LancheControl lancheControl;
	
	@GetMapping("/ingredientes")
	public List<Ingrediente> getAllIngredientes() {
		return ingredienteControler.listarIngredientes();
	}
	
	@GetMapping("/ingrediente/{id}")
	public Ingrediente getIngrediente( @PathVariable(value="id") int id) {
		return ingredienteControler.pegarIngrediente(id);
	}
	

	@GetMapping("/lanche")
	public List<Lanche> getLanche() {		
		return lancheControl.listarLanches();
	}
	

}
