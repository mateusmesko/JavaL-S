package lambdas;

public class CalculoTest3 {
	public static void main(String[] args) {
		Calculo som = (x,y)->{
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
		System.out.println(som.executar(2, 5));
		System.out.println(sub.executar(2, 5));
		System.out.println(div.executar(2, 5));
		System.out.println(mul.executar(2, 5));
	}
}
