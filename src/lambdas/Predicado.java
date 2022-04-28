package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = prod -> (prod.peco *( 1 - prod.desconto)) >= 750;
		
		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		// fun��o para testar
		System.out.println(isCaro.test(produto));		
	}
}
