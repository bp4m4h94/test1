
public class DeepCopy {

	public static void main(String[] args) {
		// 若是要對類別型別的陣列進行物件內容的複製, 需要自己動手處理!
		// 因為Java預設是不知道你要複製物件的哪些屬性
		
		Animal[] as = new Animal[2];
		as[0] = new Animal(2, 5.0f);
		as[1] = new Animal(5, 100.0f);
		
		Animal[] as2 = new Animal[as.length];
		for (int i = 0; i < as2.length; i++) {
			Animal a = as[i];
			int age = a.getAge();
			float weight = a.getWeight();
			// 重點!! 每次都用一個新的(new 代表新的位置)Animal物件來存放要複製的屬性
			Animal animal = new Animal(age, weight);
			as2[i] = animal;
		}
		
		as[0].setAge(10);
		
		System.out.println(as[0].getAge());
		System.out.println(as2[0].getAge());
		
		
	}

}
