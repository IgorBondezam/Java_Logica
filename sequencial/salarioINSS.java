package sequencial;

import java.util.Scanner;

public class salarioINSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double bruto, desconto;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário atual:");
		bruto = sc.nextDouble();
		desconto = bruto * (1- 0.11);
		
		System.out.printf("O salário recebido será de R$%.2f", desconto);
		
		sc.close();
		
		
	}

}
