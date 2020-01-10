package com.ocajexam.chapter.tree;

/**
 * @since 10/01/2020
 * @author willian
 *
 *         Os m�todos da classe String s�o: charAt,
 *         concat, endsWith, equalsIgnoreCase, indexOf, length, replace,
 *         startsWith, toLowerCase, toString, toUpperCase e trim
 */
public class MetodosDaClasseString {

	public static void main(String[] args) {

		String pirateMessage = "  Buried Treasure Chest! ";

		/**
		 * charAt Retorna um valor char primitivo a partir do valor de �ndice int
		 * espec�ficado.
		 */

		/* Retorna o caractere de 'espa�o em branco' da posi��o 0 */
		char c1 = pirateMessage.charAt(0);
		System.out.println("c1: " + c1);

		/* Retorna o caractere de 'B' da posi��o 2 */
		char c2 = pirateMessage.charAt(2);
		System.out.println("c2: " + c2);

		/* Retorna o caractere de '!' da posi��o 23 */
		char c3 = pirateMessage.charAt(23);
		System.out.println("c3: " + c3);

		/* Retorna o caractere de 'espa�o em branco' da posi��o 24 */
		char c4 = pirateMessage.charAt(24);
		System.out.println("c4: " + c4);

		/* Lan�a uma exce��o StringIndexOutOfBoundsException da posi��o 23 */
		try {
			char c5 = pirateMessage.charAt(25);
			System.out.println("c5: " + c5);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Message: " + e.getMessage());
		}

		/**
		 * indexOf
		 * 
		 * Retorna um valor int primitivo a partir do valor de �ndice de um caracter ou
		 * String.
		 */

		/* Retorna o inteiro 3 j� que ele representa o primeiro 'u' da string */
		int i1 = pirateMessage.indexOf('u');
		System.out.println("i1: " + i1);

		/*
		 * Retorna o inteiro 14 j� que ele representa o primeiro 'u' da string ap�s a
		 * posi��o 9
		 */
		int i2 = pirateMessage.indexOf('u', 9);
		System.out.println("i2: " + i2);

		/* Retorna o inteiro 13 j� que a string "sure" come�a na posi��o 13 da string */
		int i3 = pirateMessage.indexOf("sure");
		System.out.println("i3: " + i3);

		/*
		 * Retorna o inteiro -1 j� que n�o h� uma string "Treasure" na posi��o 10 ou
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

		/* Retorna o tamanho da string que � 25 */
		int i = pirateMessage.length();
		System.out.println("i: " + i);

		// Uso do m�todo length de string
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
		 * O m�todo concat adiciona a string especificada ao final da string original.
		 */

		/* Retorna a string concatenada Buried Treasure Chest! Weigh anchor! */
		String c = pirateMessage.concat("Weigh anchor!");
		System.out.println("c:" + c);

		/**
		 * replace
		 * 
		 * O m�todo replace da classe string retorna string, substituindo todos os
		 * caracteres ou strings do objeto string referenciado.
		 */
		
		/* Retorna uma string com todos os caracteres 'B' substiru�dos por 'J' */
		String s1 = pirateMessage.replace('B', 'J');
		System.out.println("s1: " + s1);
		
		/* Retorna uma string com todos os caracteres de espa�o em braco ' ' substiru�dos por 'X' */
		String s2 = pirateMessage.replace(' ', 'X');
		System.out.println("s2: " + s2);
		
		/* Retorna uma string com todos as strings "Chest" substiru�dos por "Coins" */
		String s3 = pirateMessage.replace("Chest", "Coins");
		System.out.println("s3: " + s3);
		
		// Exemplo 1
		
		String msg = "  Maroon the First Mate with a flagon of water and a pistol!  ";
		
		// Objetivo = Maroon the Quartermaster with a flagon of water.
		
		msg = msg.trim().replace("First Mate", "Quartermaster").substring(0, 47).concat(".");
		
		System.out.println(msg);
		
		
	}
}