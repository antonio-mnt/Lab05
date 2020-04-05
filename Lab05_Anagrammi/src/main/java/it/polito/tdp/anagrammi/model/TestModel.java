package it.polito.tdp.anagrammi.model;

public class TestModel {

	public static void main(String[] args) {
		Model model = new Model();
		
		for(String s: model.getAnagrammiCorretti("eat")) {
			System.out.println(s);
		}
		
		System.out.println("/////////////////////////////");
		
		for(String s: model.getAnagrammiErrati("eat")) {
			System.out.println(s);
		}

	}

}
