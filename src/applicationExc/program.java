package applicationExc;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesExc.salario;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<salario> list = new ArrayList<>();

		System.out.print("Quantos funcionairios são? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("funcionarios #" + i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id existente. tente denovo: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String Name = sc.nextLine();
			double salario = sc.nextDouble();
			list.add(new salario(id, Name, salario));
		}

		System.out.println();
		System.out.print("Entre com o Id do funcionario premiado: ");
		int id = sc.nextInt();
		salario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("id nao existe");
		} else {
			System.out.print("Entre com a porcetagem: ");
			double porcetagem = sc.nextDouble();
			emp.montante(porcetagem);
		}

		System.out.println();
		System.out.println("Lista de funcionarios: ");
		for (salario obj : list) {
			System.out.println(obj);
		}

		sc.close();
	}

	private static boolean hasId(List<salario> list, int id) {
		// TODO Auto-generated method stub
		salario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
