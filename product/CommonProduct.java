package product;

public class CommonProduct {
	private String name;
	private double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public CommonProduct(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String priceTag(String name, double price) {
		return  name + " $ " + price;
	}
}
