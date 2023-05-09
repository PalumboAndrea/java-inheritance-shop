package org.inheritance.java.shop;

public class Smartphone extends Prodotto {
	
	private int codiceIMEI;
	private String memoria;
	
	public Smartphone(String nome, String marca, float prezzo, int iva,
			int codiceIMEI, String memoria) {

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
	public String getMemoria() {
		return memoria;
	}
	public void setMemoria(String memoria) {
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
