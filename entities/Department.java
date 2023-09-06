package entities;

//@class: Department
//@author: Joao Vitor Oliveira
//@functionality: Classe responsavel pelo departamento do worker.
//@levelSearch: O(1)
public class Department {

	private String name;
	
	public Department() {
	}

	public Department(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
