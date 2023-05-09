package org.products;

public class Cuffie extends Prodotto {
	
	private String color;
	private boolean wireless;

	public Cuffie(String name, String brand, double price, int vat , String color , boolean wireless) {
		super(name, brand, price, vat);
		setColor(color);
		setWireless(wireless);
	}
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}



	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	@Override
	public String toString() {
		return super.ProductToString() + "\nColore: " + getColor() + "\nWireless: " + isWireless();
	}
	

}
