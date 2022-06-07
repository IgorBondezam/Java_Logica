package condicional;

import java.util.Scanner;

public class CalcImposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor do salário para calcular o imposto de renda:\n");
		valor = sc.nextDouble();
		
		if(valor <= 1903.98) {
			valor = valor;
		} else if (valor <= 2826.65) {
			valor = valor * (1- 0.075);
		} else if (valor <= 3751.06) {
			valor = valor * (1- 0.15);
		} else if (valor <= 4664.68) {
			valor = valor * (1- 0.225);
		} else {
			valor = valor * (1- 0.275);
		}
		
		System.out.printf("O valor do imposto do salário com o imposto de renda descontado será de R$%.2f", valor);
		
		sc.close();
		
	}
}
