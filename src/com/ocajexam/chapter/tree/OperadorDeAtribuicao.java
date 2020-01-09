package com.ocajexam.chapter.tree;

import com.ocajexam.chapter.tree.model.PirateShip;

/**
 * @since 09/01/2020
 * @author willian
 *
 * Os operadores de atribui��o s�o usados para atribuir valores a vari�veis.
 * O operador de atribui��o � o sinal de igualdade(=)
 */
public class OperadorDeAtribuicao {

	public static void main(String[] args) {
		// atribui��es v�lidas
		boolean hasTreasureChestKey = true;
		byte shipmates = 20;
		PirateShip ship = new PirateShip();
		
		System.out.printf("hasTreasureChestKey: %b%n", hasTreasureChestKey);
		System.out.printf("shipmates: %d%n", shipmates);
		System.out.printf("ship: %s%n", ship);
		
		// atribui��es inv�lidas
		
		/*Literal inv�lido, TRUE deve estar em min�sculo*/
		// boolean hasTreasureChestKey = TRUE;
		
		/*Literal inv�lido, o valor em bytes n�o pode exceder 127 */
		// byte shipmates = 500;
		
		/*Construtor inv�lido*/
		// PirateShip ship = new PirateShip(UNEXPECTED_ARG);
		
		byte a;
		a = 10;
		// Faz parte do escopo do exame
		System.out.printf("1�: %d%n", a = (byte) (a + 3));// a = a + 3
		a = 15;
		System.out.printf("2�: %d%n", a = (byte) (a - 3));// a = a - 3;
		a = 20;
		System.out.printf("3�: %d%n", a = (byte) (a * 3));// a = a * 3;
		a = 25;
		System.out.printf("4�: %d%n", a = (byte) (a / 3));// a = a / 3;
		a = 30;
		System.out.printf("5�: %d%n", a = (byte) (a % 3));// a = a % 3;
		a = 35;
		// N�o faz parte do escopo do exame
		System.out.printf("6�: %d%n", a = (byte) (a & 3));
		a = 40;
		System.out.printf("7�: %d%n", a = (byte) (a ^ 3));
		a = 45;
		System.out.printf("8�: %d%n", a = (byte) (a | 3));
		a = 50;
		System.out.printf("9�: %d%n", a = (byte) (a << 3));
		a = 55;
		System.out.printf("10�: %d%n", a = (byte) (a >> 3));
		a = 60;
		System.out.printf("11�: %d%n", a >>>= 3);
	}
}