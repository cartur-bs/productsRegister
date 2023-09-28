package product;

public class UsedProduct extends CommonProduct {

	private String manufactureDate;

	public UsedProduct(String name, double price, String manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	@Override
	public String priceTag(String name, double price) {
		return super.priceTag(getName(), getPrice()) + "(Manufacture date: " + manufactureDate + " )";
	}
}
