package streams;

import java.util.List;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

import javax.swing.Action;

public class CriandoStreams {
	public static void main(String[] args) {
		//-------------------------------------stream-------------------------------------//
		//--------------------------------------objt--------------------------------------//
		Consumer<String> print = System.out::print;
		Stream<String> lang= Stream.of("Java, ","Lua, ","js \n");
		lang.forEach(print);
		
			//-exemplo
			//-teste
		Consumer<String> imprimir = System.out::print;
		Stream<String> valores= Stream.of("valor1,","valor2","valor 3 \n");
		valores.stream().map(m -> m.toUpperCase()).forEach(print);
		valores.forEach(imprimir);
		//-------------------------------------stream-------------------------------------//
		//-------------------------------------arrays-------------------------------------//
		String[] maisLangs= {"Python, ","lisp, ","perl, ","go\n"};
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
			//-exemplo
			//-teste
		String[] maisValores= {"Valor 4, ","Valor 5, ","Valor 6\n"};
		Stream.of(maisValores).forEach(imprimir);
		Stream.of(maisValores).forEach(imprimir);
		//-------------------------------------stream-------------------------------------//
		//-------------------------------------elemen-------------------------------------//
		Arrays.stream(maisLangs, 1, 2).forEach(print);
		Arrays.stream(maisValores, 1, 2).forEach(imprimir);
		//-------------------------------------stream-------------------------------------//
		//--------------------------------------list--------------------------------------//
		List<String>outrasLangs=Arrays.asList("\n c, ","PHP,","Kotlin" );
		outrasLangs.stream().forEach(imprimir);
		outrasLangs.parallelStream().forEach(imprimir);
		
		List<String>outrosValores=Arrays.asList("\n valor 7, ","valor 8,","valor 9" );
		outrosValores.stream().forEach(imprimir);
		outrosValores.parallelStream().forEach(imprimir);
		//-------------------------------------stream-------------------------------------//
		//--------------------------------------map--------------------------------------//
		
	}
}
