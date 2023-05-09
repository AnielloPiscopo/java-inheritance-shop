package org.products;

public class Televisore extends Prodotto{
	private float dimensions;
	private boolean smart;

	public Televisore(String name, String brand, double price, int vat , float dimensions , boolean smart) {
		super(name, brand, price, vat);
		setDimensions(dimensions);
		setSmart(smart);
	}
	
	
	public float getDimensions() {
		return dimensions;
	}

	public void setDimensions(float dimensions) {
		this.dimensions = dimensions;
	}



	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	@Override
	public String toString() {
		return super.ProductToString() + "\nDimensioni: " + getDimensions() + "pollici\nSmart: " + isSmart();
	}
	
}
