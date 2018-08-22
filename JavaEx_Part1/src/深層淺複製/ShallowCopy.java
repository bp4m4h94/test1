
public class ShallowCopy {

	public static void main(String[] args) {
		// 使用object的clone方法, 對於基本型別陣列是做value copy, 所以沒有修改的風險
		
//		int[] iArray = {1, 2, 3};
//		int[] iArray2 = iArray.clone();
//		
//		iArray[0] = 0;
//		System.out.println(iArray[0]);
//		System.out.println(iArray2[0]);
		
		// 使用object的clone方法, 對於類別型別(或稱為參考型別)是做address copy, 所以兩個陣列都是使用同一個物件實體
		// 有修改的風險
		Animal[] as = new Animal[2];
		as[0] = new Animal(2, 5.0f);
		as[1] = new Animal(5, 100.0f);
		
		Animal[] as2 = as.clone();
		as[0].setAge(10);
		
		System.out.println(as[0].getAge());
		System.out.println(as2[0].getAge());
		
	}

}
