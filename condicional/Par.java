package condicional;

import java.util.Scanner;

public class Par {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num;
		System.out.println("Informe um número");
		num = sc.nextInt();
		
		if( num % 2 == 0) {
			System.out.printf("%d é par. \n", num);
		} else {
			System.out.printf("%d é impar \n", num);
		}
		
		sc.close();
	}

}
