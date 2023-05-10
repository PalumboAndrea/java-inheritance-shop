package org.inheritance.java.shop;

public class Smartphone extends Prodotto {
	
	private int codiceIMEI;
	private int memoria;
	
	public Smartphone(String nome, String marca, float prezzo, int iva,
			int codiceIMEI, int memoria) {

		super(nome, marca, prezzo, iva);
		setCodiceIMEI(codiceIMEI);
		setMemoria(memoria);
	}

	public int getCode() {
		return super.codice;
	}
	public int getCodiceIMEI() {
		return codiceIMEI;
	}
	public void setCodiceIMEI(int codiceIMEI) {
		this.codiceIMEI = codiceIMEI;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	protected String getSmartphoneString() {
		
		return getProductString()
			+ "\nCodice IMEI: " + getCodiceIMEI() 
			+ "\nMemoria: " + getMemoria();
	}
	
	@Override
	public String toString() {
		
		return "(S) " + getSmartphoneString();
	}
	
	
	
}
