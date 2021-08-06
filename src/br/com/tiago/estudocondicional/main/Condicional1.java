package br.com.tiago.estudocondicional.main;

import java.util.Scanner;

public class Condicional1 {
	
	public static void main(String[] args) {
		
		System.out.println("por favor, digite metade da sua idade");
		//Lê a partir da linha de comando
	    Scanner input = new Scanner(System.in);	  
		
		int idade = input.nextInt();
		
		idade = idade *2;
		
		if (idade<18) {
			
			System.out.println("nao e adulto");
			
		} else {
			
			System.out.println("e adulto!");
			
		}
		
		
	}

}
