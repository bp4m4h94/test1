package ch10;

public class ManagerPoly extends FullTimeEmployeePoly {
	private double bonus; // 獎金; 額外津貼; 特別補助

	public void display() {
		super.display();
		System.out.println("額外津貼=" + bonus);
	}

	public ManagerPoly(int empno, String ename, double monthlySalary, double bonus) {
		super(empno, ename, monthlySalary);
		this.bonus = bonus;
	}

	// add
	public double getSalary() {                         //如果此處註解掉 會繼承正值員工的月薪 test2中經理會沒有獎金>>50,000
		double monthlySalary = super.getSalary();
		return monthlySalary + bonus;
	}
}
