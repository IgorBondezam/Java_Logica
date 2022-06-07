package sequencial;

public class variaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quantidade = 1000; // numero inteiro
		float valorMercadoria = 140.53f;  // numero com virgula (poucas casas decimais)
		double peso = 140.5368801;
		char genero = 'f'; //somente uma caracter
		
		// int ---- %d
		// float ----%f
		// double ----%f
		// char ---- %c
		
		
		System.out.printf("A quantidade de itens em estiqye é %d \n", quantidade);
		System.out.printf("O valor da mercadoria é %.1f \n", valorMercadoria);
		System.out.printf("O erinaldo pesa %f quilos", peso);
		System.out.printf("Marina é do genero %c", genero);
		
	}

}
