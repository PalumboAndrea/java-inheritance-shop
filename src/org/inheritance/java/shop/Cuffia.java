package org.inheritance.java.shop;


public class Cuffia extends Prodotto{
	
	private String colore;
	private String proprietà;
	
	public Cuffia(String nome, String marca, float prezzo, int iva,
			String colore, String proprietà) {

		super(nome, marca, prezzo, iva);
		setColore(colore);
		setProprietà(proprietà);
	}

	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public String getProprietà() {
		return proprietà;
	}
	public void setProprietà(String proprietà) {
		this.proprietà = proprietà;
	}
	
	public int getCode() {
		return super.codice;
	}
	
	protected String getCuffiaString() {
		
		return getProductString()
			+ "\nDimensioni: " + getColore() 
			+ "\nProprietà: " + getProprietà();
	}
	
	@Override
	public String toString() {
		
		return "(C) " + getCuffiaString();
	}
	
}
