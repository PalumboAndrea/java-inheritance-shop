package org.inheritance.java.shop;

public class Shop {
	public static void main(String[] args) {
		
		Prodotto p = new Prodotto ("Iphone 13", "Apple", 1000, 20);
		System.out.println(p.toString());
		
		System.out.println("\n------------------------------------\n");
		
		Smartphone s = new Smartphone ("Iphone 13", "Apple", 1000, 20, 14230, "128 gb");
		System.out.println(s.toString());
		
		System.out.println("\n------------------------------------\n");
		
		Televisore t = new Televisore ("TV", "Samsung", 300, 20, "120 x 20", "smart");
		System.out.println(t.toString());
		
		System.out.println("\n------------------------------------\n");
		
		Cuffia c = new Cuffia ("XDR 90", "JBL", 100, 20, "bianco", "wireless");
		System.out.println(c.toString());
		
	}
}
