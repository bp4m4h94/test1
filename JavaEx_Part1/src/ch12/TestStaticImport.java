package ch12;

import static java.lang.System.out;
import static java.lang.Math.*;

public class TestStaticImport {

	public static void main(String[] args) {
		//可省略System.
		out.println("看起來有點不習慣...");
		out.println(random());
		out.println(PI);
		random();
		
	}
	public static int random() {
		return 10;//如果有另外宣告"同名"方法會以"宣告"那個為主，而從lang.Math非亂數
	}
}
