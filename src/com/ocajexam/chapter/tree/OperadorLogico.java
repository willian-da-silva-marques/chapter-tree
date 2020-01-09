package com.ocajexam.chapter.tree;

/**
 * @since 09/01/2020
 * @author willian.marques
 *
 *         Os operadores l�gicos retornam valores boolean. Operadores l�gicos:
 *         && AND, || OR � o operador l�gico de nega��o
 */
public class OperadorLogico {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/**
		 * Usando o operador AND l�gico
		 */
		/* Atribui true */
		boolean and1 = true && true;
		System.out.printf("true && true: %b%n", and1);
		
		/* Atribui false, o operando direito � avaliado */
		boolean and2 = true && false;
		System.out.printf("true && false: %b%n", and2);
		
		/* Atribui false, o operando direito n�o � avaliado */
		boolean and3 = false && true;
		System.out.printf("false && true: %b%n", and3);
		
		/* Atribui false, o operando direito n�o � avaliado */
		boolean and4 = false && false;
		System.out.printf("false && false: %b%n", and4);

		System.out.println();
		
		/**
		 * Usando o operador OR l�gico
		 */
		/* Atribui true, o operando direito n�o � avaliado */
		boolean and5 = true || true;
		System.out.printf("true || true: %b%n", and5);
		/* Atribui true, o operando direito n�o � avaliado */
		boolean and6 = true || false;
		System.out.printf("true || false: %b%n", and6);
		/* Atribui true, o operando direito � avaliado */
		boolean and7 = false || true;
		System.out.printf("false || true: %b%n", and7);
		/* Atribui false */
		boolean and8 = false || false;
		System.out.printf("false || false: %b%n", and8);
	}
}