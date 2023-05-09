package org.main;
import org.products.*;

public class Shop {
	public static void main(String[] args) {
		Prodotto p1 = new Prodotto("asddsa" , "asd" , 2.22 , 20);
		System.out.println(p1);
		Smartphone s1 = new Smartphone("asd", "asd", 2.234, 21, 2);
		System.out.println(s1);
		Televisore t1 = new Televisore("asddsa" , "asd" , 2.22 , 20 , 22 , false);
		System.out.println(t1);
		Cuffie c1 = new Cuffie("asddsa" , "asd" , 2.22 , 20 , "nere" , false);
		System.out.println(c1);
	}
}
