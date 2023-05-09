package org.inheritance.java.shop;

import java.util.Random;

public class Prodotto {
	Random rnd = new Random();
	
	protected int codice;
	private String nome;
	private String marca;
	private float prezzo;
	private int iva;
	
	public Prodotto (String nome, String marca, float prezzo, int iva) {
		this.codice = rnd.nextInt(1000);
		setNome(nome);
		setMarca(marca);
		setPrezzo(prezzo);
		setIva(iva);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	public int getCodice() {
		return codice;
	}
	
	public String getPricePlusIva() {
		String pricePlusIva = this.prezzo + (this.prezzo / 100 * this.iva) + " euro";    
		return pricePlusIva;
	}
	
	protected String getProductString() {
		
		return "Codice prodotto: " + this.codice
			+ "\nNome: " + getNome()
			+ "\nMarca: " + getMarca() 
			+ "\nPrezzo: " + getPrezzo() + " euro"
			+ "\nPrezzo + iva : " + getPricePlusIva();
	}
	
	@Override
	public String toString() {
		
		return "(P) " + getProductString();
	}

	
	
	
	
}
