package lambdas;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		// Operador binario
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;

		System.out.println(media.apply(9.8, 5.7));

		BiFunction<Double, Double, String> resultado = (n1, n2) -> (n1 + n2) / 2 >= 7.0 ? "Aprovado" : "Reprovado";

		Scanner entrada = new Scanner(System.in);
		System.out.println("Veriique se você está aprovado");
		System.out.println("Digite a primeira nota: ");
		String nota1 = entrada.next().replace(",", ".");
		double notaA = Double.parseDouble(nota1);
		System.out.println("Digite a segunda nota: ");
		String nota2 = entrada.next().replace(",", ".");
		double notaB = Double.parseDouble(nota2);

		System.out.println(resultado.apply(notaA, notaB));
		
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado": "REprovado";
		
		System.out.println("Resultado: "+ media.andThen(conceito).apply(notaA, notaB));
		
		entrada.close();
		
	}
}
