package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioAula186 {

	public static void main(String[] args) {

		Function<Produto, Double> precoFinal = pp -> pp.preco * (1 - pp.desconto);
		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> freteProduto = preco -> preco >= 3000 ? preco + 100.0 : preco + 50.0;
		UnaryOperator<Double> arredonda = preco -> preco;
		Function<Double, String> formatar = preco -> ("R$ " + preco).replace(".",",");

		Produto p = new Produto("Ipad", 3235.89, 0.13);
		String preco = precoFinal.andThen(impostoMunicipal).andThen(freteProduto).andThen(arredonda).andThen(formatar).apply(p);

		String resultado = String.format(preco);
		System.out.println("O preco final é " + resultado);
	}
}
