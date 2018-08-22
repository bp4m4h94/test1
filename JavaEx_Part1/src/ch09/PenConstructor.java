package ch09;

public class PenConstructor {
	private String brand;//instance variables 
	private double price;
	
	public PenConstructor(String brandXXX, double priceXXX) {//宣告建構子
		brand = brandXXX;//initialize the instance variables with "SKB" and 10
		price = priceXXX;
	}
	
	public static void main(String[] args) {
		PenConstructor pc = new PenConstructor("SKB", 10);//建立建構子，一定要帶入參數
		System.out.println(pc.brand);
		System.out.println(pc.price);
	}
	
}
