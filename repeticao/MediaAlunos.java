package repeticao;

import java.util.Scanner;

public class MediaAlunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n1, total=0;
		
		String aluno;
		int contador = 0;
		
		while(contador <= 9) {
			System.out.printf("\nDigite a %d nota: ", contador+1);
			n1 = sc.nextDouble();
			total += n1;
			contador++;
		}
		double media = total / contador;
		
		System.out.printf("O total de todas as notas é %.1f.\nO total de alunos são %d.\n A média "
				+ "entre todos os alunos é %.1f",total, contador, media);
		
		
		
		sc.close();
		
	}

}
