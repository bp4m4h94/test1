package ch09;
/*
 * 此範例為多載建構子示範
 * 可以透過this關鍵字呼叫當前物件與其它建構子
 */
public class PenConstOverload {
	private String brand;
	private double price;
	
	public PenConstOverload(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public PenConstOverload(double price) {//this 就像另一個方法(方法中的方法)，功能為呼叫建構子
		this("SKB", price);//此處SKB為預設值(尚未知曉)，price待使用者輸入
	}
	
	public PenConstOverload(String brand) {
		this(brand, 10);//此處10為預設值(尚未知道)，brand待使用者輸入
	}
	
	public PenConstOverload() {
		this("SKB", 10);
	}
	
	public void showInfo() {
		System.out.println("牌子為： " + brand);
		System.out.println("價格為： " + price);
		System.out.println("=============");
	}
	
	public static void main(String[] args) {
		
		PenConstOverload p1 = new PenConstOverload("A", 20);
		PenConstOverload p2 = new PenConstOverload(40);
		PenConstOverload p3 = new PenConstOverload("B");
		PenConstOverload p4 = new PenConstOverload();
		
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
		p4.showInfo();
	}
}
