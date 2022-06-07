package repeticao;

import java.util.Scanner;

public class NotaAlunosExer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double nota, total = 0, media;
		int contador, contReprova = 0, contAprova = 0;
		
		for(contador = 0; contador < 10; contador++) {
			System.out.printf("Digite a nota do %d aluno: \n", contador+1);
			nota = sc.nextDouble();
			
			while(nota > 10) {
				System.out.println("Digite um valor valido para nota!");
				System.out.printf("Digite a nota do %d aluno: \n", contador+1);
				nota = sc.nextDouble();
			}
			
			
			
			if(nota >= 6) {
				System.out.println("Aluno Aprovado.");
				contAprova++;
			}else {
				System.out.println("Aluno Reprovado.");
				contReprova++;
			}
			
			total += nota;
			
		}
		
		media = total/10;
		
		System.out.printf("O total de notas foi: %.1f.\nA media da sala foi: %.1f.\n"
				+ "O numero de alunos aprovados foi: %d.\n"
				+ "O numero de alunos reprovados foi: %d.", total, media, contAprova, contReprova);
		
		
		sc.close();
		
	}

}
