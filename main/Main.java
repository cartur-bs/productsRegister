package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import product.CommonProduct;
import product.ImportedProduct;
import product.UsedProduct;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		double price;
		List<CommonProduct> products = new ArrayList<>();
		System.out.print("Enter the number of products ");
		int productAmount = sc.nextInt();
		for (int i = 0; i < productAmount; i++) {
			System.out.println("Enter product #" + (i +1) + " data:");
			System.out.println("Common, used or imported (c/u/i)?");
			char prodClass = sc.next().charAt(0);
			System.out.print("Name: ");
			name = sc.next();
			System.out.print("Price: ");
			price = sc.nextDouble();
			if (prodClass == 'c') {
				products.add(new CommonProduct(name, price));
			} else if (prodClass == 'i') {
				System.out.print("Custom fee: ");
				double customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
			} else {
				System.out.print("Manufacture date(dd/mm/yyyy)");
				String manufactureDate = sc.next();
				products.add(new UsedProduct(name, price, manufactureDate));
			}
		}
		for(CommonProduct obj : products) {
			System.out.println(obj.priceTag(obj.getName(), obj.getPrice()));
		}

		sc.close();
	}

}
