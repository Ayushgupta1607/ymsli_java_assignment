package q1;

public class SalaryEmployee extends Employee {
	public SalaryEmployee(String name,int id,double salary,double rate) {
		super(name,id,salary,rate);
	}
	
	public double getPayment() {
		setSalary(getSalary()*5);
		return getSalary();
	}
}
