package org.main;

import org.products.*;

import java.util.Arrays;
import java.util.Scanner;

public class Catalogo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Prodotto[] productsList = new Prodotto[100];
		
		int userChoise = 0;
		int numOfProducts = 0;
		
		do {
			System.out.println("--------------------------");
			System.out.println("Cosa vuoi inserire \n"
					+ "1)uno smarthphone\n"
					+ "2)un televisore\n"
					+ "3)delle cuffie\n"
					+ "4)esci");
			
			userChoise = in.nextInt();
			
			if(userChoise <= 3 && userChoise>=1) {
				System.out.print("Inserisci il nome del prodotto ");
				String productName = in.next();
				System.out.print("Inserisci il nome del brand del prodotto ");
				String productBrand = in.next();
				System.out.print("Inserisci il prezzo del prodotto ");
				double productPrice = in.nextDouble();
				System.out.print("Inserisci l'IVA");
				int productIva = in.nextInt();
				
				switch(userChoise) {
				case 1:
					System.out.print("Inserisci la quantità di memoria del telefono ");
					float smartphoneStorage = in.nextFloat();
					Prodotto phone = new Smartphone(productName, productBrand, productPrice, productIva, smartphoneStorage);
					productsList[numOfProducts] = phone;
					break;
				case 2:
					System.out.print("Inserisci i pollici del televisore ");
					float tvDimensions = in.nextFloat();
					System.out.print("E\' smart? ");
					boolean tvSmart = in.nextBoolean();
					Prodotto tv = new Televisore(productName, productBrand, productPrice, productIva, tvDimensions , tvSmart );
					productsList[numOfProducts] = tv;
					break;
				case 3:
					System.out.print("Inserisci il colore delle cuffie ");
					String headphonesColor = in.next();
					System.out.print("Sono wireless? ");
					boolean headphonesWireless = in.nextBoolean();
					Prodotto headphones = new Cuffie(productName, productBrand, productPrice, productIva, headphonesColor , headphonesWireless );
					productsList[numOfProducts] = headphones;
					break;
				case 4:
					break;
				default:
					System.out.println("Valore non valido");
					break;
			}
				numOfProducts++;
			}
			
			
		}while(userChoise!=4);
		Prodotto[] convertedProductsList = new Prodotto[numOfProducts];
		
		for(int i=0 ; i<numOfProducts ; i++) {
			convertedProductsList[i] = productsList[i];
		}
		
		System.out.println(Arrays.toString(convertedProductsList));
		in.close();
	}
}
