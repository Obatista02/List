import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class aplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();

		list.add("Joao");
		list.add("Marisa");
		list.add("Angelica");
		list.add("Cassio");
		list.add("Francisco");
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
		System.out.println("Posiçao da Francisco: " + list.indexOf("Francisco"));
		System.out.println("Posiçao do Cassio: " + list.indexOf("Cassio"));
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
