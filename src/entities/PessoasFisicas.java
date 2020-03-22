package entities;

public class PessoasFisicas extends Pessoas{

	private Double gastosSaude;
	
	public PessoasFisicas() {
		
	}

	public PessoasFisicas(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	@Override
	public Double imposto() {
		if (getRendaAnual() < 20000.00)
			return getRendaAnual() * 0.15 - this.gastosSaude * 0.50;
		else {
			return getRendaAnual() * 0.25 - this.gastosSaude * 0.50;
		}
	}
}
