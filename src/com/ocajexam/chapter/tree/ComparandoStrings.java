package com.ocajexam.chapter.tree;

public class ComparandoStrings {

	public static void main(String[] args) {

		String msg1 = "WALK THE PLANK!";
		String msg2 = "WALK THE PLANK!";
		String msg3 = ("WALK THE PLANK!");
		String msg4 = new String("WALK THE PLANK!");

		System.out.println("msg1.equals(msg2): " + msg1.equals(msg2));
		System.out.println("msg1.equals(msg3): " + msg1.equals(msg3));
		System.out.println("msg1.equals(msg4): " + msg1.equals(msg4));
		System.out.println();
		System.out.println("msg2.equals(msg1): " + msg2.equals(msg1));
		System.out.println("msg2.equals(msg3): " + msg2.equals(msg3));
		System.out.println("msg2.equals(msg4): " + msg2.equals(msg4));
		System.out.println();
		System.out.println("msg3.equals(msg1): " + msg3.equals(msg1));
		System.out.println("msg3.equals(msg2): " + msg3.equals(msg2));
		System.out.println("msg3.equals(msg4): " + msg3.equals(msg4));
		System.out.println();
		System.out.println("msg4.equals(msg1): " + msg4.equals(msg1));
		System.out.println("msg4.equals(msg2): " + msg4.equals(msg2));
		System.out.println("msg4.equals(msg3): " + msg4.equals(msg3));

		// comparando referências de objetos
		String cmd = "Set Sail!";
		String command = cmd;
		System.out.println("\ncmd == command: " + (cmd == command));

		// Exemplo de comparação indevida
		String interjectionOne = "Arrgh!";
		String interjectionTwo = "Arrgh!";
		System.out.println("interjectionOne == interjectionTwo: " + (interjectionOne == interjectionTwo));

		String eggs1 = "Clackle fruit";
		String eggs2 = "Clackle fruit.";
		System.out.println("eggs1.compareTo(eggs2): " + (eggs1.compareTo(eggs2)));

		int i = 0;
		int j = 0;
		if (i++ == ++j) {
			System.out.println("True: i=" + i + ", j=" + j);
		} else {
			System.out.println("False: i=" + i + ", j=" + j);
		}

		int i1 = 100;
		int j1 = 200;
		if ((i1 == 99) & (--j1 == 199)) {
			System.out.println("Value 1: " + (i1 + j1) + " ");
		} else {
			System.out.println("Value 2: " + (i1 + j1) + " ");
		}
		int i2 = 100;
		int j2 = 200;
		if ((i2 == 99) && (--j2 == 199)) {
			System.out.println("Value 1: " + (i2 + j2) + " ");
		} else {
			System.out.println("Value 2: " + (i2 + j2) + " ");
		}
		int i3 = 100;
		int j3 = 200;
		if ((i3 == 100) | (--j3 == 200)) {
			System.out.println("Value 1: " + (i3 + j3) + " ");
		} else {
			System.out.println("Value 2: " + (i3 + j3) + " ");
		}
		int i4 = 100;
		int j4 = 200;
		if ((i4 == 100) || (--j4 == 200)) {
			System.out.println("Value 1: " + (i4 + j4) + " ");
		} else {
			System.out.println("Value 2: " + (i4 + j4) + " ");
		}

		validatePrime();

		int score = 10;
		System.out.println("score: " + ++score);

		/* String e StringBuilder são de tipos incomparáveis */
		String name1 = new String("Benjamin");
		StringBuilder name2 = new StringBuilder("Benjamin");
		System.out.println(name2.equals(name1));
	}

	private static void validatePrime() {
		long p = 17496;
		Double primeSquareRoot = Math.sqrt(p);
		boolean isPrime = true;
		for (long j = 2; j <= primeSquareRoot.longValue(); j++) {
			if (p % j == 0) {
				System.out.println(j + " x " + p / j);
				isPrime = false;
			}
		}
		System.out.println("Prime number: " + isPrime);
	}
}