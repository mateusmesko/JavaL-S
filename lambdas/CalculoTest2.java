package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTest2 {
	public static void main(String[] args) {
		BinaryOperator<Double> som = (x,y)->{
			return x + y;
		};
		Calculo sub = (x,y)->{
			return x - y;
		};
		Calculo div = (x,y)->{
			return x / y;
		};
		Calculo mul = (x,y)->{
			return x * y;
		};
		System.out.println(som.apply(2.0, 5.0));
		System.out.println(sub.executar(2, 5));
		System.out.println(div.executar(2, 5));
		System.out.println(mul.executar(2, 5));
	}
}
