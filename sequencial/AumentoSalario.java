package sequencial;

import java.util.Scanner;

public class AumentoSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bruto;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o salário bruto:");
		bruto = sc.nextDouble();
		
		double valorAumento;
				
		System.out.println("Digite o percentual do aumento:");
		valorAumento = sc.nextDouble();
		
		
		double aumento = bruto * (1 + valorAumento/100);
		
		System.out.printf("O salário R$%.2f aumentará para R$%.2f.", bruto, aumento);
		
		
		sc.close();
	}

}
