package com.ocajexam.chapter.tree;

/**
 * @since 07.01.2020
 * @author willian 
 * 
 * Os cinco operadores aritiméticos básicos são: 
 * adição(+), subtração(-), multiplicação(*), divisão(/) e módulo(%)
 */
public class OperadorAritmetico {

	public static void main(String[] args) {
		/* Exemplo do operador de adição(+) */
		int greyCannonBalls = 50;
		int blackCannonBalls = 50;
		int totalCannonBalls = greyCannonBalls + blackCannonBalls;
		System.out.printf("totalCannonBalls: %d%n", totalCannonBalls);

		/* Exemplo do operador de subtração(-) */
		int firedCannonBalls = 10;
		totalCannonBalls -= firedCannonBalls;// sempre ler de maneira invertida os operadores
		System.out.printf("totalCannonBalls: %d%n", totalCannonBalls);

		/* Exemplo do operador de multiplicação(*) */
		int matches = 20;
		int matchesBoxes = 20;
		int totalMatches = matches * matchesBoxes;
		System.out.printf("totalMatches: %d%n", totalMatches);

		/* Exemplo do operador de divisão (/) */
		int pirates = 104;
		int piratesShips = 3;
		int assignedPiratesPerChip = pirates / piratesShips;
		System.out.printf("assignedPiratesPerChip: %d%n", assignedPiratesPerChip);

		/* Exemplo de operador de resto(%) */
		int pirateRemainder = pirates % piratesShips;
		System.out.printf("pirateRemainder %d%n", pirateRemainder);
	}
}