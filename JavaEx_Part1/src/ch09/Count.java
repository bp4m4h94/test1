package ch09;

public class Count {
	// 產品序號
	private int serialNumber;//實體變數

	public int getSerialNumber() {//成員方法
//		getTotalCount();//non static 內可加入static方法
		
		return serialNumber;
	}

	// 產品數量
	private static int counter;//靜態變數

	public static int getTotalCount() {//靜態方法
//		Count c = new Count();
//		c.getSerialNumber();
		return counter;
	}

	// 建構式
	public Count() {
		counter++;
		serialNumber = 1000 + counter;
	}
	
	
}
