package com.ocajexam.chapter.tree;

import com.ocajexam.chapter.tree.model.PirateShip;

/**
 * @since 09/01/2020
 * @author willian
 *
 * Os operadores de atribuição são usados para atribuir valores a variáveis.
 * O operador de atribuição é o sinal de igualdade(=)
 */
public class OperadorDeAtribuicao {

	public static void main(String[] args) {
		// atribuições válidas
		boolean hasTreasureChestKey = true;
		byte shipmates = 20;
		PirateShip ship = new PirateShip();
		
		System.out.printf("hasTreasureChestKey: %b%n", hasTreasureChestKey);
		System.out.printf("shipmates: %d%n", shipmates);
		System.out.printf("ship: %s%n", ship);
		
		// atribuições inválidas
		
		/*Literal inválido, TRUE deve estar em minúsculo*/
		// boolean hasTreasureChestKey = TRUE;
		
		/*Literal inválido, o valor em bytes não pode exceder 127 */
		// byte shipmates = 500;
		
		/*Construtor inválido*/
		// PirateShip ship = new PirateShip(UNEXPECTED_ARG);
		
		byte a;
		a = 10;
		// Faz parte do escopo do exame
		System.out.printf("1º: %d%n", a = (byte) (a + 3));// a = a + 3
		a = 15;
		System.out.printf("2º: %d%n", a = (byte) (a - 3));// a = a - 3;
		a = 20;
		System.out.printf("3º: %d%n", a = (byte) (a * 3));// a = a * 3;
		a = 25;
		System.out.printf("4º: %d%n", a = (byte) (a / 3));// a = a / 3;
		a = 30;
		System.out.printf("5º: %d%n", a = (byte) (a % 3));// a = a % 3;
		a = 35;
		// Não faz parte do escopo do exame
		System.out.printf("6º: %d%n", a = (byte) (a & 3));
		a = 40;
		System.out.printf("7º: %d%n", a = (byte) (a ^ 3));
		a = 45;
		System.out.printf("8º: %d%n", a = (byte) (a | 3));
		a = 50;
		System.out.printf("9º: %d%n", a = (byte) (a << 3));
		a = 55;
		System.out.printf("10º: %d%n", a = (byte) (a >> 3));
		a = 60;
		System.out.printf("11º: %d%n", a >>>= 3);
	}
}