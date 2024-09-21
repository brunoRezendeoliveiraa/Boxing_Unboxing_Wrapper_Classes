import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Bruno");
		list.add("Lorran");
		list.add("Iago");
		list.add("Cristian");
		list.add("Walter");
		list.add(3, "Walter");

		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("---------------------------------------");

		list.removeIf(x -> x.charAt(0) == 'I');

		// list.remove("Cristian");
		// list.remove(2);

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("----------------------------");
		// O list indexOf informa em qual posição se encontra a informação que queremos.
		System.out.println("Index of Lorran:" + list.indexOf("Lorran"));
		// Como o indexOf não encontrou a informação que passamos, ele nos retorna -1.
		System.out.println("Index of Jorge:" + list.indexOf("Jorge"));
		System.out.println("----------------------------");

		// O convert é realizado com o .collect(Collectors.toList());
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(">> " + x);
		}
		System.out.println("----------------------------");
		// Essa função findFirst().orElse(null); irá retornar "null" se não existir
		// resultados que buscamos com a letra M.
		String nome = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		System.out.println(">> " + nome);

		System.out.println("-------------------------------");
		System.out.println("");
		Boolean a = true;
		Character c = '@';
		Integer d = 3509;
		Double i = 3.14;
		String p = "Olá mundo";

		if (a == true) {
			System.out.println("Isso é verdadeiro.");
		}
		if (c == '@') {
			System.out.println("Isso é verdadeiro");
		}
		System.out.println("O resultado de Integer é: " + d);
		System.out.println("O resultado de Double é: " + i);
		System.out.println(p);
	}

}
