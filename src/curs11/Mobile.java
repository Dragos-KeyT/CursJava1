package curs11;

public class Mobile extends Product{

	private int buyingPrice;
	private int vat;
	
	@Override
	public int calculatePrice() {
		return buyingPrice + vat;
	}
	
	public Mobile(int buyingPrice, int vat) {
		this.buyingPrice = buyingPrice;
		this.vat = vat;
	}
	

}
