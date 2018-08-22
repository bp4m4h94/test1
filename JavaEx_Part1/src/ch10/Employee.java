package ch10;

public class Employee {
	private int empno;
	private String ename;

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEname() {
		return ename;
	}

	public Employee(int empno, String ename) {
		//**super(); 此處為呼叫root of the class hierarchy "Object()"
		this.empno = empno;
		this.ename = ename;
	}

	public Employee(int empno) {
		//**此處不能呼叫父類別Object，因為同一個建構子只能呼叫一次
		this(empno, "-");
	}

	public Employee(String ename) {
		this(0, ename);
	}

	public Employee() {
	}

	public void display() {
		System.out.println("empno = " + empno);
		System.out.println("ename = " + ename);
	}
}
