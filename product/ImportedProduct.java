package product;

public class ImportedProduct extends CommonProduct {

	private double customsFee;

	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag(String name, double price) {
		return super.priceTag(getName(), getPrice() + customsFee) + "(Customs fee:" + customsFee + " )";
	}

}
