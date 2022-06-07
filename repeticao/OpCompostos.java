package repeticao;

import java.util.Scanner;

public class OpCompostos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 3, y = 5;
		Scanner sc = new Scanner(System.in);
		
		System.out.println(x += 7);
		System.out.println(x -= 4);
		System.out.println(y *= x);
		System.out.println(y /= 10 );
		System.out.println(y %= x);
		
		
		sc.close();
	}

}
