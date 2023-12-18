package exercicios;

//atributos
public class Funcionario {
public String nome;
public float salario;
public int id;

//construtor
public Funcionario(String nome, float salario, int id) {
	super();
	this.nome = nome;
	this.salario = salario;
	this.id = id;
}

//metodo
public float calcularReajusteSalario() {
	if (this.salario > 500) {
		if (this.salario <= 1000) {
			this.salario = (float) (this.salario * 1.10);
		} else {
			this.salario = (float) (this.salario * 1.05);
		}
	} else {
		this.salario = (float) (this.salario * 1.15);
	}
	return this.salario;
}

public String mostrarDados() {
	return "Funcionário: " + this.nome + "\nNúmero ID: " + this.id + "\nNovo Salário: " + this.salario;
}
}
