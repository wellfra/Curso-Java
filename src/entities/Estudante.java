package entities;

public class Estudante {
	public String nome;
	public double t1;
	public double t2;
	public double t3;
	
	public double notaFinal() {
		return t1 + t2 + t3;
	}
}
