package streams;

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Iterator;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("joao","ana","jose","pedro");
		
		System.out.println("usando FOR");
		for(String nome:aprovados){
			System.out.println(nome);
		}
		System.out.println("\nUsando interator");
		Iterator<String>it= aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Stream<String> stream =aprovados.stream();
		stream.forEach(System.out::println);
	}
}
