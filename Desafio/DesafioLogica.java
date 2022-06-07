package Desafio;

import java.util.Scanner;

public class DesafioLogica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int cont1 = 0, cont2 = 0, quantidade;
		
		String nome;
		
		double preco, aliquota = 0, lucro = 0, mediaC = 0, mediaE = 0, mediaV = 0 ;
		
		char categoria;
		
		
		for(cont1 = 0; cont1 <15; cont1++) {
			System.out.println("----------------------------------------------------------\n");
			
			System.out.printf("Produto %d\n\n", cont1+1);
			
			System.out.println("Nome do item catalogado: ");
			nome = sc.next();
			
			System.out.println("Digite o preco unitario desse item: ");
			preco = sc.nextDouble();
					
			System.out.println("Digite a quantidade em estoque desse item: ");
			quantidade = sc.nextInt();
			
			System.out.println("Digite a categoria desse item: "
					+ "C (cama, mesa e banho), E (eletrodomesticos), V (vestuario):");
			categoria = sc.next().charAt(0);
	
			if(categoria != 'C' || categoria != 'E' || categoria != 'V') {
				cont2 = 0;
				while(cont2 == 0) {
					System.out.println("\n\nDigite um valor valido.");
					
					System.out.println("Digite a categoria desse item: "
							+ "C (cama, mesa e banho), E (eletrodomesticos), V (vestuario):");
					categoria = sc.next().charAt(0);
					if(categoria == 'C' || categoria == 'E' || categoria == 'V') {
						cont2++;
					}
				}
			}
			
			
			System.out.println("\n==============================================================");
			if(categoria == 'C') {
				aliquota = preco * 1.3741;
				lucro = aliquota * 1.30;
				mediaC += lucro * quantidade;
				System.out.printf("\nNome produto.....................................: %s\n", nome);
				System.out.printf("Adicional da Aliquota............................: R$%.2f\n", aliquota);
				System.out.printf("Para ter uma margem de lucro de 30 por cento.....: R$%.2f\n\n", lucro);
			}
			if(categoria == 'E') {
				aliquota = preco * 1.4314;
				lucro = aliquota * 1.35;
				mediaE += lucro * quantidade;
				System.out.printf("\nNome produto.....................................: %s\n", nome);
				System.out.printf("Adicional da Aliquota............................: R$%.2f\n", aliquota);
				System.out.printf("Para ter uma margem de lucro de 35 por cento.....: R$%.2f\n\\n", lucro);
			}
			if (categoria == 'V') {
				aliquota = preco * 1.3842;
				lucro = aliquota * 1.50;
				mediaV += lucro * quantidade;
				System.out.printf("\nNome produto.....................................: %s\n", nome);
				System.out.printf("Adicional da Aliquota............................: R$%.2f\n", aliquota);
				System.out.printf("Para ter uma margem de lucro de 50 por cento.....: R$%.2f\n\n", lucro);
			}
			System.out.println("==============================================================\n\n");
		}
		
		System.out.println("----------------------------------------------------------\n");
		
		System.out.printf("\nO valor total de cada categoria esta em:\n"
				+ "Cama, mesa e banho: R$%.2f\n"
				+ "Eletrodomestico...: R$%.2f\n"
				+ "Vestuario.........: R$%.2f\n", mediaC, mediaE, mediaV);
		
		System.out.println("----------------------------------------------------------\n");
		
		System.out.println("\nEncerrando programa.");
		
		
		
		
		
		
		sc.close();
	}

}
