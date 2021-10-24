package lambdas;

public class CalculoTest1 {
	
	public static void main(String[] args) {
		Calculo soma= new Soma();
		System.out.println(soma.executar(5, 4));
		soma = new Multiplica();
		System.out.println(soma.executar(5, 4));
		soma = new Dividir();
		System.out.println(soma.executar(5, 4));
	}
	
}
