package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana", "Bia","Lia","Gui");
		
		System.out.println("Forma tradicional");
		// Utilizando Foreach
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #01...");
		// Function Lambdas
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		
		// Function Lambdas Method reference
		System.out.println("\nMethod Reference #1");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #02...");
		// Function Lambdas function personalizada
		aprovados.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference #2");
		// Function Lambdas function personalizada utilizando o Foreach
		aprovados.forEach(Foreach:: meuImprimir);
		
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi meu nome é " + nome);
	}
}
