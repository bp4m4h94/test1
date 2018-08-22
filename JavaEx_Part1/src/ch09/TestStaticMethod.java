package ch09;
/*
 * 此範例為示範static方法使用
 */
public class TestStaticMethod {

	public static void main(String[] args) {//main方法為static方法
		 System.out.println("請畫三角形!");
         int count = 9;
         TestStaticMethod test = new TestStaticMethod();//drawTriangle方法沒static時
         test.drawTriangle(count);
//         drawTriangle(count);

         System.out.println("畫的還不錯!");
     }
     
     public  void drawTriangle(int count){
    	  //drawTriangle(count);//static method 內可以用non static方法
         int i, j;
         for ( i = 1; i <= count; i++){
            for ( j = 1; j <= i; j++ )
               System.out.print("*");
            System.out.println();
         }
	}

}
