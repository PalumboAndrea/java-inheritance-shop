package org.inheritance.java.shop.catalogo;

import java.util.Scanner;

import org.inheritance.java.shop.Cuffia;
import org.inheritance.java.shop.Prodotto;
import org.inheritance.java.shop.Smartphone;
import org.inheritance.java.shop.Televisore;

public class Catalogo {
	public static void main(String[] args) {
		Prodotto[] pArr = new Prodotto[100];
		int index = -1;
		
		while(true) {
			index++;
			Scanner sc = new Scanner(System.in);
			System.out.println("Inserisci il nome del prodotto:");
			String nome = sc.nextLine();
			System.out.println("Inserisci la marca del prodotto:");
			String marca = sc.nextLine();
			System.out.println("Inserisci il prezzo del prodotto:");
			float prezzo = sc.nextInt();
			System.out.println("Inserisci l'iva del prodotto:");
			int iva = sc.nextInt();
			System.out.println("Il prodotto è un: 1. smartphone, 2. televisore, 3. cuffia");
			int choice = sc.nextInt();
			
			if (choice < 1 || choice > 3) {
				System.err.println("Scelta non trovata");
				continue;
			}
			
			switch (choice) {
				case 1: {
					System.out.println("Scrivi il codice IMEI:");
					int IMEI = sc.nextInt();
					sc.nextLine();
					System.out.println("Scrivi la memoria del telefono (Gb):");
					int memoria = sc.nextInt();
					Smartphone s = new Smartphone (nome, marca, prezzo, iva, IMEI, memoria);
					System.out.println(s.toString());
					pArr[index] = s;
					System.out.println("Vuoi: 1. Inserire un nuovo prodotto, 2. Stampa catalogo ed esci");
					int exit = sc.nextInt();
					if (exit < 1 || exit > 2) {
						System.err.println("Scelta non trovata");
					} else if (exit == 2) {
						System.out.println("Ecco i prodotti che hai aggiunto:");
						for (int x=0;x<pArr.length;x++) {
							if (pArr[x] != null) {
								Prodotto p = pArr[x];
								
								System.out.println("\n------------------------------------\n");
								if (p instanceof Smartphone) {
									
									s = (Smartphone) p;
									System.out.println(s.toString());
								} else if (p instanceof Televisore) {
									
									Televisore t = (Televisore) p;
									System.out.println(t.toString());
								} else if (p instanceof Cuffia) {
									
									Cuffia c = (Cuffia) p;
									System.out.println(c.toString());
								}
							} else {
								return;
							}
						}
						sc.close();
						return;
					} else {
						break;
					}
				}
				
				case 2: {
					sc.nextLine();
					System.out.println("Scrivi le dimensioni (h x l x p):");
					String dimensioni = sc.nextLine();
					System.out.println("Scrivi la proprietà:");
					String proprietà = sc.nextLine();
					Televisore t = new Televisore (nome, marca, prezzo, iva, dimensioni, proprietà);
					System.out.println(t.toString());
					pArr[index] = t;
					System.out.println("Vuoi: 1. Inserire un nuovo prodotto, 2. Stampa catalogo ed esci");
					int exit = sc.nextInt();
					if (exit < 1 || exit > 2) {
						System.err.println("Scelta non trovata");
					} else if (exit == 2) {
						System.out.println("Ecco i prodotti che hai aggiunto:");
						for (int x=0;x<pArr.length;x++) {
							if (pArr[x] != null) {
								Prodotto p = pArr[x];
								
								System.out.println("\n------------------------------------\n");
								if (p instanceof Smartphone) {
									
									Smartphone s = (Smartphone) p;
									System.out.println(s.toString());
								} else if (p instanceof Televisore) {
									
									t = (Televisore) p;
									System.out.println(t.toString());
								} else if (p instanceof Cuffia) {
									
									Cuffia c = (Cuffia) p;
									System.out.println(c.toString());
								}
							} else {
								return;
							}
						}
						sc.close();
						return;
					} else {
						break;
					}
				}
				
				case 3:{
					sc.nextLine();
					System.out.println("Scrivi il colore:");
					String colore = sc.nextLine();
					System.out.println("Scrivi la proprietà:");
					String proprietà = sc.nextLine();
					Cuffia c = new Cuffia (nome, marca, prezzo, iva, colore, proprietà);
					System.out.println(c.toString());
					pArr[index] = c;
					System.out.println("Vuoi: 1. Inserire un nuovo prodotto, 2. Stampa catalogo ed esci");
					int exit = sc.nextInt();
					if (exit < 1 || exit > 2) {
						System.err.println("Scelta non trovata");
					} else if (exit == 2) {
						System.out.println("Ecco i prodotti che hai aggiunto:");
						for (int x=0;x<pArr.length;x++) {
							if (pArr[x] != null) {
								Prodotto p = pArr[x];
								
								System.out.println("\n------------------------------------\n");
								if (p instanceof Smartphone) {
									
									Smartphone s = (Smartphone) p;
									System.out.println(s.toString());
								} else if (p instanceof Televisore) {
									
									Televisore t = (Televisore) p;
									System.out.println(t.toString());
								} else if (p instanceof Cuffia) {
									
									c = (Cuffia) p;
									System.out.println(c.toString());
								}
							} else {
								return;
							}
						}
						sc.close();
						return;
					} else {
						break;
					}
				}
				sc.close();
			}
		}
	}
	
	// this was a try it is not used for anything
	public static void showArray(Prodotto [] array, Smartphone s, Televisore t, Cuffia c) {
		for (int x=0;x<array.length;x++) {
			
			if (array[x] != null) {
				Prodotto p = array[x];
				
				System.out.println("\n------------------------------------\n");
				if (p instanceof Smartphone) {
					
					s = (Smartphone) p;
					System.out.println(s.toString());
				} else if (p instanceof Televisore) {
					
					t = (Televisore) p;
					System.out.println(t.toString());
				} else if (p instanceof Cuffia) {
					
					c = (Cuffia) p;
					System.out.println(c.toString());
				}
			} else {
				return;
			}
		}
	}
}
