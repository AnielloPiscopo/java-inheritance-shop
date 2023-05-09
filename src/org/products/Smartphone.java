package org.products;

import java.util.Random;

public class Smartphone extends Prodotto {
	private int imei;
	private float storage;
	
	public Smartphone(String name, String brand, double price, int vat , float storage) {
		super(name, brand, price, vat);
		setImei();
		setStorage(storage);
	}

	public int getImei() {
		return imei;
	}

	public void setImei() {
		Random rnd = new Random();
		Integer rndNumber;
		do {
			rndNumber = rnd.nextInt();
			this.imei = rndNumber;
		}while(rndNumber<=0);
	}

	public float getStorage() {
		return storage;
	}

	public void setStorage(float storage) {
		this.storage = storage;
	}
	
	@Override
	public String toString() {
		return super.ProductToString() + "\nCodice IMEI: " + getImei() + "\nSpazio di archiviazione: " + getStorage() + "GB";
	}

}
