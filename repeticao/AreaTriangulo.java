package repeticao;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double base = 0, altura = 0, area;
		
		System.out.println("Digite um valor de base:");
		base = sc.nextDouble();
		
		System.out.println("Digite um valor de altura:");
		altura = sc.nextDouble();
		
		
		while(base <= 0 || altura <= 0 ) {
			System.out.println("Digite um valor valido para a base e altura.");
			
			System.out.println("Digite um valor de base:");
			base = sc.nextDouble();
			
			System.out.println("Digite um valor de altura:");
			altura = sc.nextDouble();
		}
		
		area = (base*altura)/2;
		
		System.out.printf("A area do triangulo é: %.2f.", area);
		
	}

}
