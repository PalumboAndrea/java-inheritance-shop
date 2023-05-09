package org.inheritance.java.shop;

public class Televisore extends Prodotto{
	
	private String dimensioni;
	private String proprietà;
	
	public Televisore(String nome, String marca, float prezzo, int iva,
			String dimensioni, String proprietà) {

		super(nome, marca, prezzo, iva);
		setDimensioni(dimensioni);
		setProprietà(proprietà);
	}

	public String getDimensioni() {
		return dimensioni;
	}
	public void setDimensioni(String dimensioni) {
		this.dimensioni = dimensioni;
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
	
	protected String getTelevisoreString() {
		
		return getProductString()
			+ "\nDimensioni: " + getDimensioni() 
			+ "\nProprietà: " + getProprietà();
	}
	
	@Override
	public String toString() {
		
		return "(T) " + getTelevisoreString();
	}
	
	
}
