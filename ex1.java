package lpavetores;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		int a[] = new int[5];

		Scanner ler = new Scanner(System.in);

		for (int i =0; i<5; i++) {
			System.out.println("Informe o valor " + i+ "...:");
			a[i]= ler.nextInt();

		}
		for (int i=0; i<5; i++) {
			System.out.println(a[i]);

		}
		ler.close();
	}

}
