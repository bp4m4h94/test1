package ch11;
//****可以宣告多個類別在一個檔案，但只能有一個public且要跟檔名同名
// 筆類別(父類別)
// 抽象類別
abstract class Pen {
	protected String brand;//***protected表示可以與子類別共用資料
	protected double price;

	// 抽象方法
	public abstract void write();//***沒有定義區塊

	public void setdata(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
}

// 自訂的筆類別(子類別)
 class  MyPen extends Pen {
	// 定義抽象類別的動作   //**實作(與覆寫道理一樣)，如果沒實作，需在class前加abstract
	public void write() {
	System.out.print("牌子是： " + brand);
	System.out.println("價格為： " + price);
	}
}

public class TestAbstract {
	public static void main(String args[]) {
		MyPen myPen = new MyPen();
		myPen.setdata("SKB", 10);
		myPen.write();
	}
}
