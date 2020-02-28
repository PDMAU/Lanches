package com.lanches.apirest.dao;

import com.google.gson.Gson;
import com.lanches.apirest.models.Lanche;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public  class LanchesDao {
	
	private static final String PATH_FILE = "lanches.txt";
	private static LanchesBanco bancoLanches;
	 
	
	public LanchesDao() {
		init();
		
	}
	
	private void init() {
		InputStream is = getClass().getResourceAsStream(PATH_FILE);
        BufferedReader br = new BufferedReader(new InputStreamReader(Objects.requireNonNull(is)));
        bancoLanches = new Gson().fromJson(br, LanchesBanco.class);
        
	}
	
	public  List<Lanche> getAllLanches(){
		return bancoLanches.getLanches();
	}
	
	public  Lanche getLanche(int id) {
		return bancoLanches.getLanches().stream()
				.filter( x -> (id == x.getId()))
				.findAny()
				.orElse(null);
	}
	private class LanchesBanco{
		private List<Lanche> lanches;

		public List<Lanche> getLanches() {
			return lanches;
		}

		public void setLanches(List<Lanche> lanches) {
			this.lanches = lanches;
		}
		
	}
}
