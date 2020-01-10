package com.ocajexam.chapter.tree;

/**
 * @since 10/01/2020
 * @author willian
 * 
 *         Os objetos string são usados para representar cadeias de caracteres
 *         Unicode de 16 bits. As strings são objetos imitáveis, ou seja, seus
 *         valores nunca mudam.
 */
public class Strings {

	public static void main(String[] args) {

		// Exemplo 1
		String quote = "Dead Men Tell No Tales";
		quote.replace("No Tales", "Tales"); // Retorno um novo valor
		System.out.printf("quote: %s%n", quote); // Exibe o valor original

		// Exemplo 2
		/* Pode-se criar uma string sem um objeto string ter sido atribuído */
		String quote1; // quote1 é uma variável de referência sem objeto sem objeto string atribuído
		quote1 = "Ahoy matey"; // atribui um objeto string a referência
		System.out.printf("quote1: %s%n", quote1);

		// Exemplo 3
		/* Pode-se usar duas abordagens para criação de um objeto string com representação de string vazia */
		String quote2a = new String();
		String quote2b = new String("");
		System.out.printf("quote2a: %s%n", quote2a);
		System.out.printf("quote2b: %s%n", quote2b);
		// Exemplo 4
		/* Pode-se criar um objeto string sem um construtor */
		String quote3 = "The existence of the sea means the existence of pirates! -- Malayan proverb";
		System.out.printf("quote3: %s%n", quote3);
		
		// Exemplo 5
		/* Pode-se criar um objeto string com um construtor */
		String quote4 = new String("Yo ho ho!");
		System.out.printf("quote4: %s%n", quote4);
		
		// Exemplo 5
		/* Pode-se criar uma variável de referência que aponte para outra variável de referência do objeto string */
		String quote5 = "You're welcome to my gold. -- Willian Kidd";
		String quote6 = quote5;
		System.out.printf("quote5: %s%n", quote5);
		System.out.printf("quote6: %s%n", quote6);
		
		// Exemplo 6
		/* Diferente do objeto String o objeto StringBuilder é mutável. */
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Olá!");
		stringBuilder.replace(2, 3, "é");
		System.out.println(stringBuilder.toString());

		/* Pode-se atribuir um novo objeto String a uma variável de referência String já existente */
		String quote7 = "The treasure is in the sand.";
		quote7 = "The treasure is between the rails.";
		System.out.printf("quote7: %s%n", quote7);
	}
}