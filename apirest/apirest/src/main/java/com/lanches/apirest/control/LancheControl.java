package com.lanches.apirest.control;

import java.util.List;

import com.lanches.apirest.dao.LanchesDao;
import com.lanches.apirest.models.Lanche;
public class LancheControl {

	private LanchesDao lanches;
	
	public List<Lanche> listarLanches(){ 
		return lanches.getAllLanches();
	}
	
	public Lanche getLanche(int idLanche) {
		return lanches.getLanche(idLanche);
	} 
	
	
	
	
	
	
}
