package it.polito.tdp.anagrammi.model;

import java.util.*;

public class TestRicerca {

	public static void main(String[] args) {
		
		Ricerca r = new Ricerca();
		
		Set<String> anagrammi = r.cerca("eat");
		
		System.out.println(anagrammi);

	}

}
