package entitiesExc;

public class salario {
	private int id;
	private String name;
	private double salario;

	public salario(int id, String name, double salario) {

		this.id = id;
		this.name = name;
		this.salario = salario;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void montante(double aumento) {
		salario += salario * aumento / 100;
	}
}
