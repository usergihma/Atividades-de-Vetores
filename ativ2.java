package lpavetores;

import java.util.Scanner;

public class ativ2 {

	public static void main(String[] args) {
		int a[] = new int[5];
		int soma=0;

		Scanner ler = new Scanner(System.in);

		for (int i =0; i<5; i++) {
			System.out.println("Informe o valor " + i+ "...:");
			a[i]= ler.nextInt();
			soma = soma+a[i];
			System.out.println("A soma dos números é :" + soma);
		}
		
		if (soma > 15) {
			System.out.println("A soma dos números é :" + soma);
			    }
		
			
		
		ler.close();
	}

}
