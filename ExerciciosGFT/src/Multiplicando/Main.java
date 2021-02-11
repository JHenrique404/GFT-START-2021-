package Multiplicando;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int resultado = 0;

		System.out.print("Multiplicando: ");
		n1 = ler.nextInt();

		if (n1 < 0 || n2 < 0 || n3 > 3000) {

			System.out.println("Por favor digite um numero maior que -1");
			System.exit(0);

		} else {

			System.out.print("Inicio do intervalo: ");
			n2 = ler.nextInt();

			if (n2 < 0) {
				System.out.println("Por favor digite um numero maior que -1");
				System.exit(0);
			} else {
				System.out.print("Fim do intervalo: ");
				n3 = ler.nextInt();

				if (n3 > 3000) {
					System.out.println("Por favor digite um numero menor que 3000");
					System.exit(0);
				} else {

					for (int i = n2; i <= n3; i++) {
						resultado = n1 * n2;
						System.out.println(n1 + " * " + n2 + " = " + resultado);
						n2++;
					}

				}
			}

		}

	}

}
