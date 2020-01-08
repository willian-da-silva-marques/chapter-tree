package com.ocajexam.chapter.tree;

/**
 * @since 07.01.2020
 * @author willian
 * 
 * Os operadores pré-fixados executam seus operadores antes da avaliação da expressão inteira 
 * Os operadores pós-fixados executam seus operadores após a expressão ter sido avaliada
 */
public class OperadorDeIncrementoEDecrementoPreFixadoEPosFixado {

	public static void main(String[] args) {
		// O operador de incremento pré-fixado incrementa um valor de 1 unidade antes da expressão ser avaliada
		int x1 = 10;
		int y1 = ++x1;
		System.out.printf("x = %d y = %d%n", x1, y1);

		// O operador de incremento pós-fixado incrementa um valor de 1 unidade após a expressão ser avaliada
		int x2 = 10;
		int y2 = x2++;
		System.out.printf("x = %d y = %d%n", x2, y2);

		// O operador de decremento pré-fixado decrementa um valor de 1 unidade antes da expressão ser avaliada
		int x3 = 10;
		int y3 = --x3;
		System.out.printf("x = %d y = %d%n", x3, y3);

		// O operador de decremento pós-fixado decrementa um valor de 1 unidade após a expressão ser avaliada
		int x4 = 10;
		int y4 = x4--;
		System.out.printf("x = %d y = %d%n", x4, y4);
	}
}