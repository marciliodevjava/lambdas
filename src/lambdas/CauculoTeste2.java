package lambdas;

public class CauculoTeste2 {

	public static void main(String[] args) {

		Calculo soma = (x, y) -> {
			return x + y;
		};
		
		System.out.println(soma.executar(2, 3));

		soma = (x, y) -> x * y;
		System.out.println(soma.executar(2, 3));
		
		soma = (x, y) -> x - y;
		System.out.println(soma.executar(3, 2));
		
		soma = (x, y) -> x / y;
		System.out.println(soma.executar(3, 2));
	}
}
