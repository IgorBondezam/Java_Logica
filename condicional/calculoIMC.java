package condicional;

import java.util.Scanner;

public class calculoIMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double altura, peso, imc;
		String result = null;
		
		System.out.println("Digite seu peso:");
		peso = sc.nextDouble();
		System.out.println("Digite sua altura:");
		altura = sc.nextDouble();
		
		//imc = peso/ (altura*altura);
		
		imc = peso/Math.pow(altura, 2);
		
		System.out.printf("O seu imc deu %.2f. ", imc);
		
		if(imc < 18.5 ) {
			result = "Abaixo do peso";
		}
		else if(imc >= 18.5 && imc < 25 ) {
			result = "Peso normal";
		}
		else if(imc >= 25 && imc < 30 ) {
			result = "Sobrepeso";
		}
		else if(imc >= 30 && imc < 35 ) {
			result = "Obesidade grau I";
		}
		else if(imc >= 35 && imc < 40 ) {
			result = "Obesidade grau II";
		}
		else if(imc >= 40 ) {
			result = "Obesidade mórbida";
		}
		
		System.out.printf("%s", result);
		
		
		sc.close();
	}

}
