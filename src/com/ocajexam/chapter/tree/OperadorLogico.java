package com.ocajexam.chapter.tree;

/**
 * @since 09/01/2020
 * @author willian.marques
 *
 *         Os operadores lógicos retornam valores boolean. Operadores lógicos:
 *         && AND, || OR é o operador lógico de negação
 */
public class OperadorLogico {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		/**
		 * Usando o operador AND lógico
		 */
		/* Atribui true */
		boolean and1 = true && true;
		System.out.printf("true && true: %b%n", and1);
		
		/* Atribui false, o operando direito é avaliado */
		boolean and2 = true && false;
		System.out.printf("true && false: %b%n", and2);
		
		/* Atribui false, o operando direito não é avaliado */
		boolean and3 = false && true;
		System.out.printf("false && true: %b%n", and3);
		
		/* Atribui false, o operando direito não é avaliado */
		boolean and4 = false && false;
		System.out.printf("false && false: %b%n", and4);

		System.out.println();
		
		/**
		 * Usando o operador OR lógico
		 */
		/* Atribui true, o operando direito não é avaliado */
		boolean and5 = true || true;
		System.out.printf("true || true: %b%n", and5);
		/* Atribui true, o operando direito não é avaliado */
		boolean and6 = true || false;
		System.out.printf("true || false: %b%n", and6);
		/* Atribui true, o operando direito é avaliado */
		boolean and7 = false || true;
		System.out.printf("false || true: %b%n", and7);
		/* Atribui false */
		boolean and8 = false || false;
		System.out.printf("false || false: %b%n", and8);
	}
}