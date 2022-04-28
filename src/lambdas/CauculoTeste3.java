package lambdas;

import java.util.function.BinaryOperator;

public class CauculoTeste3 {

	public static void main(String[] args) {

		// Não: int -> Double tipo primitivo para wraper
		
		BinaryOperator<Double> soma = (x, y) -> {
			return x + y;
		};
		
		System.out.println(soma.apply(2.0, 3.0));

		soma = (x, y) -> x * y;
		System.out.println(soma.apply(2.0, 3.0));
		
		soma = (x, y) -> x - y;
		System.out.println(soma.apply(2.0, 3.0));
		
		soma = (x, y) -> x / y;
		System.out.println(soma.apply(2.0, 3.0));
		
		BinaryOperator<Integer> soma2 = (x, y) -> {	return x + y; };
		
		System.out.println(soma2.apply(2, 3));

		soma2 = (x, y) -> x * y;
		System.out.println(soma2.apply(2, 3));
		
		soma2 = (x, y) -> x - y;
		System.out.println(soma2.apply(2, 3));
		
		soma2 = (x, y) -> x / y;
		System.out.println(soma2.apply(2, 3));
		
	}
}
