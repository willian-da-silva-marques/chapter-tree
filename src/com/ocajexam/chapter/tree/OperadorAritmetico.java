package com.ocajexam.chapter.tree;

/**
 * @since 07.01.2020
 * @author willian 
 * 
 * Os cinco operadores aritim�ticos b�sicos s�o: 
 * adi��o(+), subtra��o(-), multiplica��o(*), divis�o(/) e m�dulo(%)
 */
public class OperadorAritmetico {

	public static void main(String[] args) {
		/* Exemplo do operador de adi��o(+) */
		int greyCannonBalls = 50;
		int blackCannonBalls = 50;
		int totalCannonBalls = greyCannonBalls + blackCannonBalls;
		System.out.printf("totalCannonBalls: %d%n", totalCannonBalls);

		/* Exemplo do operador de subtra��o(-) */
		int firedCannonBalls = 10;
		totalCannonBalls -= firedCannonBalls;// sempre ler de maneira invertida os operadores
		System.out.printf("totalCannonBalls: %d%n", totalCannonBalls);

		/* Exemplo do operador de multiplica��o(*) */
		int matches = 20;
		int matchesBoxes = 20;
		int totalMatches = matches * matchesBoxes;
		System.out.printf("totalMatches: %d%n", totalMatches);

		/* Exemplo do operador de divis�o (/) */
		int pirates = 104;
		int piratesShips = 3;
		int assignedPiratesPerChip = pirates / piratesShips;
		System.out.printf("assignedPiratesPerChip: %d%n", assignedPiratesPerChip);

		/* Exemplo de operador de resto(%) */
		int pirateRemainder = pirates % piratesShips;
		System.out.printf("pirateRemainder %d%n", pirateRemainder);
	}
}