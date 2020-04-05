package it.polito.tdp.anagrammi.model;

import java.util.*;

public class Ricerca {
	
	private Set<String> soluzione;
	private int N;
	private String parola;
	
	
	public Set<String> cerca(String parola){
		this.parola = parola;
		
		this.N = parola.length();
		
		String parziale = "";
		int livello = 0;
		this.soluzione = new HashSet<>();
		
		ricorsiva(parziale,livello);
		
		return soluzione;
		
	}
	
	private void ricorsiva(String parziale, int livello) {
		
		if(livello == N) {
			if(verificaParola(this.parola,parziale)==true)
				this.soluzione.add(parziale);
		}else {
			String sottoProblema  = parola;
			
			for(int i = 0; i<sottoProblema.length(); i++) {
				parziale += sottoProblema.charAt(i);
				ricorsiva(parziale,livello+1);
				parziale= parziale.substring(0,parziale.length()-1);
			}
			
		}

	}
	
	private boolean verificaParola(String parola, String parziale) {
		
	 List<String> listaParola = new ArrayList<>();
	 
	 for(int i = 0; i<parola.length(); i++) {
		 listaParola.add(""+parola.charAt(i));
	 }
	 
	 
	 List<String> listaParziale = new ArrayList<>();
	 
	 for(int i = 0; i<parziale.length(); i++) {
		 listaParziale.add(""+parziale.charAt(i));
	 }
	 
	 listaParola.sort(null);
	 listaParziale.sort(null);
	 
	 if(listaParola.equals(listaParziale))
		 return true;
	 else
		 return false;
		
	}
	

}
