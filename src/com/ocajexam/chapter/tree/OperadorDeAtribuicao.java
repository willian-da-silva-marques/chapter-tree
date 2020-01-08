package com.ocajexam.chapter.tree;

public class OperadorDeAtribuicao {

	public static void main(String[] args) {
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