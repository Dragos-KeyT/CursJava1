package curs10;

public class Produse {
	
	private String nume;
	private double pretVanzare;
	public final double TVA = 19.0; 

	public Produse(String nume) {
		this.nume = nume;
	}
	
		
	public double getPretVanzare() {
		return pretVanzare;
	}

	public void setPretVanzare(double pretVanzare) {
		this.pretVanzare = pretVanzare;
	}

	public double pret() {
		return pretVanzare+(pretVanzare*TVA);
	}
	
}
