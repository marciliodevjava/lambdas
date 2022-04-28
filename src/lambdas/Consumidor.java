package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {

		Consumer<Produto> imprimirNome = p -> System.out.println("Produto: " + p.nome + "\nPreço: "+ p.preco);

		Produto p1 = new Produto("Notebook", 2987.99, 0.25);
		Produto p2 = new Produto("Caderno", 19.90, 0.03);
		Produto p3 = new Produto("Boracha", 7.80, 0.18);
		Produto p4 = new Produto("Lapis", 4.39, 0.19);
		Produto p5 = new Produto("Caneta", 12.34, 0.09);
		// Imprimir um unico paramentro.
		imprimirNome.accept(p1);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		//Chamando o Foreach na Lambda
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
