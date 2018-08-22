 package ch10;

public class Manager extends FullTimeEmployee {
	private double bonus; // 獎金; 額外津貼; 特別補助

	public void display() {//覆寫;改寫
		super.display();//呼叫上一層類別方法
		System.out.println("額外津貼 = " + bonus);
	}

	public Manager(int empno, String ename, double monthlySalary, double bonus) {//同理，對應父類別建構子
		super(empno, ename, monthlySalary);
		this.bonus = bonus;
	}
}
