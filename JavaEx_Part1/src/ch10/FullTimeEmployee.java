package ch10;

public class FullTimeEmployee extends Employee {
	private double monthlySalary; // 月薪

	public void display() {//Override
		super.display();//呼叫上一層父類別Employee
		System.out.println("月薪 = " + monthlySalary);//覆寫內容
	}

	public FullTimeEmployee(int empno, String ename, double monthlySalary) {//此處為建構子
		super(empno, ename);//建構子呼叫與上一層類別(父類別)共同、一樣的參數，對應父類別一樣有兩個參數(empno ename)的建構子
		this.monthlySalary = monthlySalary;
	}
}
