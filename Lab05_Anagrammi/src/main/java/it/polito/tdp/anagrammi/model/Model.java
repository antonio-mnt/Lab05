package it.polito.tdp.anagrammi.model;

import java.util.*;

import it.polito.tdp.anagrammi.DAO.ParolaDAO;

public class Model {
	
	private ParolaDAO pdao;
	private Ricerca r;
	
	public Model() {
		pdao = new ParolaDAO();
		r = new Ricerca();
	}
	
	
	public List<String> getAnagrammiCorretti(String parola){
		
		List<String> corretti = new ArrayList<>();
		
		for(String a: r.cerca(parola)) {
			if(pdao.esisteParola(a)) {
				corretti.add(a);
			}	
		}
		
		return corretti;
		
	}
	
	
	public List<String> getAnagrammiErrati(String parola){
		
		List<String> errati = new ArrayList<>();
		
		for(String a: r.cerca(parola)) {
			if(pdao.esisteParola(a)==false) {
				errati.add(a);
			}	
		}
		
		return errati;
		
	}
	

}
