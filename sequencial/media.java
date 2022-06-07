package sequencial;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor de n1:");
		n1 = sc.nextDouble();
		System.out.println("Informe o valor de n2:");
		n2 = sc.nextDouble();
		System.out.println("Informe o valor de n3:");
		n3 = sc.nextDouble();
		
		double media = (n1+n2+n3) / 3;
		
		System.out.printf("A média de %f, %f e %f é %f", n1, n2, n3, media);
		 
		
		
		sc.close();
	}

}
