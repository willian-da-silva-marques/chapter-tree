package com.ocajexam.chapter.tree;

public class OperadorDeAtribuicao {

	public static void main(String[] args) {
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