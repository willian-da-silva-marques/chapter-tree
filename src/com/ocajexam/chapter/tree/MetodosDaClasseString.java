package com.ocajexam.chapter.tree;

/**
 * @since 10/01/2020
 * @author willian
 *
 *         Os métodos da classe String são: charAt,
 *         concat, endsWith, equalsIgnoreCase, indexOf, length, replace,
 *         startsWith, toLowerCase, toString, toUpperCase e trim
 */
public class MetodosDaClasseString {

	public static void main(String[] args) {

		String pirateMessage = "  Buried Treasure Chest! ";

		/**
		 * charAt Retorna um valor char primitivo a partir do valor de índice int
		 * específicado.
		 */

		/* Retorna o caractere de 'espaço em branco' da posição 0 */
		char c1 = pirateMessage.charAt(0);
		System.out.println("c1: " + c1);

		/* Retorna o caractere de 'B' da posição 2 */
		char c2 = pirateMessage.charAt(2);
		System.out.println("c2: " + c2);

		/* Retorna o caractere de '!' da posição 23 */
		char c3 = pirateMessage.charAt(23);
		System.out.println("c3: " + c3);

		/* Retorna o caractere de 'espaço em branco' da posição 24 */
		char c4 = pirateMessage.charAt(24);
		System.out.println("c4: " + c4);

		/* Lança uma exceção StringIndexOutOfBoundsException da posição 23 */
		try {
			char c5 = pirateMessage.charAt(25);
			System.out.println("c5: " + c5);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Message: " + e.getMessage());
		}

		/**
		 * indexOf
		 * 
		 * Retorna um valor int primitivo a partir do valor de índice de um caracter ou
		 * String.
		 */

		/* Retorna o inteiro 3 já que ele representa o primeiro 'u' da string */
		int i1 = pirateMessage.indexOf('u');
		System.out.println("i1: " + i1);

		/*
		 * Retorna o inteiro 14 já que ele representa o primeiro 'u' da string após a
		 * posição 9
		 */
		int i2 = pirateMessage.indexOf('u', 9);
		System.out.println("i2: " + i2);

		/* Retorna o inteiro 13 já que a string "sure" começa na posição 13 da string */
		int i3 = pirateMessage.indexOf("sure");
		System.out.println("i3: " + i3);

		/*
		 * Retorna o inteiro -1 já que não há uma string "Treasure" na posição 10 ou
		 * depois dela na string
		 */
		int i4 = pirateMessage.indexOf("Treasure", 10);
		System.out.println("i4: " + i4);

		/**
		 * length
		 * 
		 * Retorna um valor int primitivo que representa o tamanho do objeto string
		 * referenciado
		 */

		/* Retorna o tamanho da string que é 25 */
		int i = pirateMessage.length();
		System.out.println("i: " + i);

		// Uso do método length de string
		String string = "box";
		int value = string.length();
		System.out.println("value: " + value);

		// Uso do atributo length dos arrays
		String[] stringArray = new String[3];
		int value2 = stringArray.length;
		System.out.println("value2: " + value2);

		/**
		 * concat
		 * 
		 * O método concat adiciona a string especificada ao final da string original.
		 */

		/* Retorna a string concatenada Buried Treasure Chest! Weigh anchor! */
		String c = pirateMessage.concat("Weigh anchor!");
		System.out.println("c:" + c);

		/**
		 * replace
		 * 
		 * O método replace da classe string retorna string, substituindo todos os
		 * caracteres ou strings do objeto string referenciado.
		 */
		
		/* Retorna uma string com todos os caracteres 'B' substiruídos por 'J' */
		String s1 = pirateMessage.replace('B', 'J');
		System.out.println("s1: " + s1);
		
		/* Retorna uma string com todos os caracteres de espaço em braco ' ' substiruídos por 'X' */
		String s2 = pirateMessage.replace(' ', 'X');
		System.out.println("s2: " + s2);
		
		/* Retorna uma string com todos as strings "Chest" substiruídos por "Coins" */
		String s3 = pirateMessage.replace("Chest", "Coins");
		System.out.println("s3: " + s3);
		
		// Exemplo 1
		
		String msg = "  Maroon the First Mate with a flagon of water and a pistol!  ";
		
		// Objetivo = Maroon the Quartermaster with a flagon of water.
		
		msg = msg.trim().replace("First Mate", "Quartermaster").substring(0, 47).concat(".");
		
		System.out.println(msg);
		
		
	}
}