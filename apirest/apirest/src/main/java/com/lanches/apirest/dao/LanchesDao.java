package com.lanches.apirest.dao;


import com.lanches.apirest.models.Lanche;

import java.util.ArrayList;
import java.util.List;

public final class LanchesDao {

private static List<Lanche> lanches; 
	
	private LanchesDao() {
		super();
		
	}
	
	public static List<Lanche> getAllLanches(){
		return lanches;
	}
	
	public static Lanche getLanche(int id) {
		return lanches.stream()
				.filter( x -> (id == x.getId()))
				.findAny()
				.orElse(null);
	}
	
	
	
}
