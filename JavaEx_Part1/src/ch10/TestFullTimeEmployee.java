package ch10;//在Test測試中，先從物件的建構子處理初始，再處理方法的呼叫

public class TestFullTimeEmployee {

	public static void main(String[] args) {
		 FullTimeEmployee f1 = new FullTimeEmployee(7002 ,"David", 50000.0 );   //f1 等於"this.empno = empno;
																				//this.ename = ename;"中的this       
         f1.display();
	}

}
