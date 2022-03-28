package teste;

import java.util.Scanner;

public class aplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Digite um numero: ");
		x = sc.nextInt();

		System.out.println("São pares: ");
		for (int i = 0; i <= x; i++) {
			if (i % 2 == 0) {
				System.out.println((x - i));
			}
		}
		
		System.out.println("São impares: ");
		for (int j = 0; j <= x; j++) {
			if (j % 2 == 1) {
				System.out.println((x - j));
			}
		}

		sc.close();
	}
}