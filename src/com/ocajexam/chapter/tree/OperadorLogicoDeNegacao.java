package com.ocajexam.chapter.tree;

public class OperadorLogicoDeNegacao {

	public static void main(String[] args) {
		
		/**
		 * Usando o operador NOT l�gico (!)
		 */
		System.out.printf("!false: %b%n", !false); //Exibe true
		System.out.printf("!true: %b%n",!true); // Exibe false
		System.out.printf("!!false: %b%n",!!false);// Exibe false
		System.out.printf("!!true: %b%n",!!true);// Exibe true
		System.out.printf("!!!false: %b%n",!!!false);// Exibe true
		System.out.printf("!!!true: %b%n",!!!true);// Exibe false
		System.out.printf("!!!!false: %b%n",!!!!false);// Exibe false
		System.out.printf("!!!!true: %b%n",!!!!true);// Exibe true
		
		/* Exemplo de express�o relacional com operador l�gico de nega��o */
		int iVar1 = 0;
		int iVar2 = 1;
		
		if ((iVar1 <= iVar2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		/* Exemplo de express�o l�gica com operador l�gico de nega��o */
		boolean bVar1 = false;
		boolean bVar2 = true;
		if ((bVar1 && bVar2) || !(bVar1 && bVar2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		/* Exemplo com o metodo equals */
		if (!"NAME".equals("NAME"))
			System.out.println("S�o diferentes.");
		else
			System.out.println("S�o iguais.");
		
		/* Exemplo com o m�todo startWith da classe String */
		String s = "Captain Jack";
		System.out.println(!s.startsWith("Captain"));
		
		
		/* O operador l�gico de nega��o n�o pode ser usado em valores n�o boolean */
		
		// Erro de compila��o: The operator ! is undefined for the argument type(s) int
		// !10;
		
		// Erro de compila��o: The operator ! is undefined for the argument type(s) String
		// !"STRING";
	}
}