package ch11;

//宣告介面 //***
interface Display {
	// 宣告變數(常數) , 修飾子如同 public static final
	int num1 = 100;
	int num2 = 10;//省略abstract

	// 宣告方法(抽象方法) , 修飾子如同 public abstract(介面會幫你預設)
	void disp();
}

// 實作介面
 class Plus implements Display {
	public void disp() {//public記得要寫
		System.out.print(num1 + " + " + num2 + " = ");//**類別變數宣告為public故可直接實作使用
		System.out.println(num1 + num2);
	}
}

// 實作介面
class Minus implements Display {
	public void disp() {
		System.out.print(num1 + " - " + num2 + " = ");
		System.out.println(num1 - num2);
	}
}

public class TestInterface {
	public static void main(String args[]) {
		Plus p1 = new Plus();
		p1.disp();
		Minus m1 = new Minus();
		m1.disp();
		
		//==================原來介面也可以多型操作~!!!==================
		
		Display[] a= new Display[2];//*****介面可以收集實作類別(抽象類別)來一致操作
		a[0] = new Plus();//注意!!!透過多型操作父類別(介面、抽象類別)才有意義
		a[1] = new Minus();//同上敘述
		
		for(int i = 0 ; i < a.length ; i++) {
			a[i].disp();
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}



