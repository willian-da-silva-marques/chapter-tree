package com.ocajexam.chapter.tree;

public class OperadorLogicoDeNegacao {

	public static void main(String[] args) {
		
		/**
		 * Usando o operador NOT lógico (!)
		 */
		System.out.printf("!false: %b%n", !false); //Exibe true
		System.out.printf("!true: %b%n",!true); // Exibe false
		System.out.printf("!!false: %b%n",!!false);// Exibe false
		System.out.printf("!!true: %b%n",!!true);// Exibe true
		System.out.printf("!!!false: %b%n",!!!false);// Exibe true
		System.out.printf("!!!true: %b%n",!!!true);// Exibe false
		System.out.printf("!!!!false: %b%n",!!!!false);// Exibe false
		System.out.printf("!!!!true: %b%n",!!!!true);// Exibe true
		
		/* Exemplo de expressão relacional com operador lógico de negação */
		int iVar1 = 0;
		int iVar2 = 1;
		
		if ((iVar1 <= iVar2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		/* Exemplo de expressão lógica com operador lógico de negação */
		boolean bVar1 = false;
		boolean bVar2 = true;
		if ((bVar1 && bVar2) || !(bVar1 && bVar2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		/* Exemplo com o metodo equals */
		if (!"NAME".equals("NAME"))
			System.out.println("São diferentes.");
		else
			System.out.println("São iguais.");
		
		/* Exemplo com o método startWith da classe String */
		String s = "Captain Jack";
		System.out.println(!s.startsWith("Captain"));
		
		
		/* O operador lógico de negação não pode ser usado em valores não boolean */
		
		// Erro de compilação: The operator ! is undefined for the argument type(s) int
		// !10;
		
		// Erro de compilação: The operator ! is undefined for the argument type(s) String
		// !"STRING";
	}
}