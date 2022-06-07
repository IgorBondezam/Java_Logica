package condicional;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		double n1, n2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o 1° valor");
		n1 = sc.nextDouble();
		System.out.println("Informe o 2° valor");
		n2 = sc.nextDouble();
		
	    System.out.println("\n\nCalculadora\n");
	    System.out.println("\n1. Soma \n2. Subtração \n3. Multiplicação \n4. Divisão");
	    System.out.println("\nEscolha uma opção: ");
	    
	    opcao = sc.nextInt();
	    
	    switch(opcao) {
	    case 1:
	    	System.out.printf("%.2f + %.2f = %.2f", n1, n2, n1+n2);
	    	break;
	    case 2:
	    	System.out.printf("%.2f - %.2f = %.2f", n1, n2, n1-n2);
	    	break;
		case 3:
	    	System.out.printf("%.2f * %.2f = %.2f", n1, n2, n1*n2);
	    	break;
		case 4:
			System.out.printf("%.2f / %.2f = %.2f", n1, n2, n1/n2);
			break;
		default:
			System.out.println("Digite um valor válido.");
			
		}

	    
		
		
		sc.close();
	}

}
