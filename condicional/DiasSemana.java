package condicional;

import java.util.Scanner;

public class DiasSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
	double n1, n2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número de 1 - 7:");
		opcao = sc.nextInt();
		
	    System.out.println("\n\nDias Da Semana\n");
	    
	    
	    switch(opcao) {
	    case 1:
	    	System.out.printf("Domingo");
	    	break;
	    case 2:
	    	System.out.printf("Segunda");
	    	break;
		case 3:
			System.out.printf("Terça");
	    	break;
		case 4:
			System.out.printf("Quarta");
			break;
		case 5:
			System.out.printf("Quinta");
			break;
		case 6:
			System.out.printf("Sexta");
			break;
		case 7:
			System.out.printf("Sábado");
			break;
		default:
			System.out.println("Digite um valor válido.");
			
		}
	    sc.close();
	}

}
