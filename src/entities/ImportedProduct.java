package entities;

public class ImportedProduct extends Product3{
	private Double customsfee;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsfree) {
		super(name, price);
		this.customsfee = customsfree;
	}

	public Double getCustomsfree() {
		return customsfee;
	}

	public void setCustomsfree(Double customsfree) {
		this.customsfee = customsfree;
	}
	
	public Double totalprice() {
		return super.getPrice() + customsfee;
	}
	@Override
	public String priceTag() {
		return 		super.getName()
			 	+	" $ " 
				+ 	String.format("%.2f", totalprice())
				+	" (Customs fee: $ "
				+ 	String.format("%.2f", customsfee)
				+	")";
	}
}
