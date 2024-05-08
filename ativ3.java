package lpavetores;

import java.util.Scanner;

public class ativ3 {

	public static void main(String[] args) {
		int a[] = new int[5];
		int b[] = new int[5];
		int c[] = new int[10];

		Scanner ler = new Scanner(System.in);

		System.out.println("SETOR A");

		for (int i =0; i<5; i++) {
			System.out.println("Informe o valor " + i+ " do setor A:");
			a[i]= ler.nextInt();

		}
		System.out.println("SETOR b");

		for (int i =0; i<5; i++) {
			System.out.println("Informe o valor " + i+ " do setor B:");
			b[i]= ler.nextInt();

		}
		for (int i=0; i<5; i++) {
			System.out.print("Os valores do vetor A são:" + a[i] + ",");

				System.out.println("Os valores do vetor B são:" + b[i]);
			}
		
		for (int i=0; i<5; i++) {
			c[i]= a[i];
			System.out.println("Os valores do vetor C são:" + c[i]);
		}
		for (int i=0; i<5; i++) {
			c[i]= b[i];
			System.out.println("Os valores do vetor C são:" + c[i]);
		}
		ler.close();

	}

}
