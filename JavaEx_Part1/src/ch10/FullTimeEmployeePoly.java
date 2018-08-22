package ch10;

public class FullTimeEmployeePoly extends EmployeePoly {
	private double monthlySalary; // 月薪

	public void display() {
		super.display();
		System.out.println("月薪=" + monthlySalary);
	}

	public FullTimeEmployeePoly(int empno, String ename, double monthlySalary) {
		super(empno, ename);
		this.monthlySalary = monthlySalary;
	}

	// add
	public double getSalary() {//已經繼承父類別EmployePoly的方法，並進行"改寫"
		return monthlySalary;
	}
}
