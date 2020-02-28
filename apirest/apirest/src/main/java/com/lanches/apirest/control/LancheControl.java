package com.lanches.apirest.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lanches.apirest.dao.LanchesDao;
import com.lanches.apirest.models.Lanche;

@Controller
public class LancheControl {

	@Autowired
	private LanchesDao lanches;
	
	public List<Lanche> listarLanches(){ 
		return lanches.getAllLanches();
	}
	
	public Lanche getLanche(int idLanche) {
		return lanches.getLanche(idLanche);
	} 
	
	
	
	
	
	
}
