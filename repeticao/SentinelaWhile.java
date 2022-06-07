package repeticao;

import java.util.Scanner;

public class SentinelaWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n1, total=0;
		
		String aluno;
		int contador = 0;
		
		System.out.printf("\nDigite a %d nota: ", contador+1);
		n1 = sc.nextDouble();
		
		while(n1 != -1) {
			
			total += n1;
			contador++;
			
			System.out.printf("\nDigite a %d nota: ", contador+1);
			n1 = sc.nextDouble();
		}
		if(contador != 0) {
			double media = total / contador;
			
			System.out.printf("O total de todas as notas é %.1f.\nO total de alunos são %d.\n A média "
					+ "entre todos os alunos é %.1f",total, contador, media);
			
		}else {
			System.out.println("Não há nenhuma nota cadastrada.");
		}
		
		
		
		
		sc.close();
		
	}

}
