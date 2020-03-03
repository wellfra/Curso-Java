package entities;

public class Empregado {
	public String nome;
	public double salario;
	public double taxa;
	
	public double salarioLiquido() {
		return salario - taxa;
	}
	public void incremento(double percentual) {
		salario += (salario * (percentual / 100));	
	}
	public String Tostring() {
		return nome
			+ ", $ "
			+ salarioLiquido();
	}
}
