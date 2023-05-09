package org.java;

import java.util.Random;

public class Prodotto {
	private int code;
	private String name;
	private String brand;
	private double price;
	private int vat;
	
	
	
	public Prodotto(String name , String brand , double price , int vat) {
		setCode();
		setName(name);
		setBrand(brand);
		setPrice(price);
		setVat(vat);
	}
	
	
	
	public int getCode() {
		return this.code;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getPriceWithVat() {
		double priceWithVat = getPrice() *(1 + getVat() / 100d);
		return priceWithVat;
	}
	
	public int getVat() {
		return vat;
	}
	
	
	
	private void setCode() {
		Random rnd = new Random();
		this.code = rnd.nextInt();
	}
	
	public void setName(String name) {
		if(name.length()<= 2) return;
		else this.name = name.trim();
	}
	
	public void setBrand(String brand) {
		if(brand.length()<=2) return;
		else this.brand = brand;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setVat(Integer vat) {
		this.vat = vat;
	}

	public String toString() {
		
		return "[" + getCode() + "]\n" 
				+ getName()  
			+ "\n" + getBrand() 
			+ "\n" + String.format("%.2f", getPrice()) + "$ (" + getVat() + "%)"
				+ " --> " + String.format("%.2f", getPriceWithVat()) + "$";
	}
	
}
