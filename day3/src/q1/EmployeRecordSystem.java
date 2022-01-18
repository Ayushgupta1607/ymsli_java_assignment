package q1;

import java.util.*;
public class EmployeRecordSystem {
	public static void main(String[]args) {
		ArrayList<Employee> emp=new ArrayList<Employee>();
		
		Employee emp1=new SalaryEmployee("Ayush",1,10222,1500);
		Employee emp2=new CommisionEmployee("naman",2,12334,1400,15,200000);
		Employee emp3=new HourlyEmployee("prashant",3,88850,1300,45,10);
		
		Invoice inv=new Invoice("1234","Zyx",10,20000);
		
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		
		System.out.println("Total employees: "+emp.size());
		System.out.println("Salary Of "+emp1.getName()+" is "+emp1.getPayment());
		System.out.println("Salary Of "+emp2.getName()+" is "+emp2.getPayment());
		System.out.println("Salary Of "+emp3.getName()+" is "+emp3.getPayment());
		System.out.println(inv);
		System.out.println("Total Cost: "+inv.getPayment());
	}
}
