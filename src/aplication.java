import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();

		list.add("Guilherme");
		list.add("Monique");
		list.add("Angela");
		list.add("Claudio");
		list.add("Fernanda");
		// Tamanho da lista
		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("--------------------");

		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("--------------------");
		System.out.println("Posiçao da Fernanda: " + list.indexOf("Fernanda"));
		System.out.println("Posiçao do Claudio: " + list.indexOf("Claudio"));
		System.out.println("--------------------");
		// filtar para aparecer com as ordens do filtro
		List<String> filtro = list.stream().filter(x -> x.charAt(0) == 'G').collect(Collectors.toList());
		for (String x : filtro) {
			System.out.println(x);
		}
		System.out.println("--------------------");
		//acha o primeiro que atende o predicado
		String name = list.stream().filter(x -> x.charAt(0) == 'F').findFirst().orElse(null);
		System.out.println(name);

	}

}
