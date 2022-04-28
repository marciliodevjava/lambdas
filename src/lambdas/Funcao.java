package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		// Interface funcional Function
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
			
		Function<String, String> oResultadoE = valor -> "O resulto e: " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!!";
		
		String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
		System.out.println(resultadoFinal);
		System.out.println(parOuImpar.apply(32));
	}
}
