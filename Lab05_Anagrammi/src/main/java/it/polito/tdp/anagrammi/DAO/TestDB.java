package it.polito.tdp.anagrammi.DAO;

public class TestDB {

	public static void main(String[] args) {
		
		
		ParolaDAO pdao = new ParolaDAO();
		
		if(pdao.esisteParola("ciao"))
			System.out.println("esiste");

	}

}
