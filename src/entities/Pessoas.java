package entities;

public abstract class Pessoas {
	private String nome;
	private Double rendaAnual;
	
	public Pessoas() {
		
	}

	public Pessoas(String nome, Double rendaAnual) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	public Double imposto() {
		if (rendaAnual < 20000.00)
			return rendaAnual * 0.15;
		else {
			return rendaAnual * 0.25;
		}
	}
}
