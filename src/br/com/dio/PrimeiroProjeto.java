package br.com.dio;

import br.com.dio.model.Dog;

public class PrimeiroProjeto {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Livros livros = new Livros();
		
		System.out.println(dog);
		System.out.println(livros);
		
		/*int a = 3;
		int b = 9;
		
		System.out.println("Hello World!!! " + (a+b));*/
		
	}

}

class Livros {
	private String nome;
	private String npag;
}