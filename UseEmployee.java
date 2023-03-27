package Collect1;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[] args) {
		
		Employee e1 = new Employee("mani",26,"Male",26000);
		Employee e2 = new Employee("mathan",25,"Male",25000);
		Employee e3 = new Employee("ram",37,"Male",37000);
		Employee e4 = new Employee("sheela",36,"Female",35000);
		Employee e5 = new Employee("rithu",28,"Female",28000);
		Employee e6 = new Employee("sowmiya",38,"Female",38000);
		Employee e7 = new Employee("shankar",22,"Male",22000);
		
		ArrayList<Employee> Employees = new ArrayList<>();
		Employees.add(e1);
		Employees.add(e2);
		Employees.add(e3);
		Employees.add(e4);
		Employees.add(e5);
		Employees.add(e6);
		Employees.add(e7);
		
		for(Employee x:Employees){
			
	  	if(x.getAge()>=35) {
	  		
			if(x.getGender()=="Female") {
				x.setSalary(x.getSalary()+x.getSalary()*4/100);
			//	System.out.println(x.getName()+","+x.getSalary());
			}
			
			else if(x.getGender()=="Male") {
				x.setSalary(x.getSalary()+x.getSalary()*5/100);
			//	System.out.println(x.getName()+","+x.getSalary());
			}
	  	}	
	  		
		}
		for(Employee Details:Employees) {
			if(Details.getGender()=="Female") {
				System.out.println(Details.getName()+","+Details.getSalary()+","+Details.getAge()+","+Details.getGender());
				
			}
			else if(Details.getGender()=="Male") {
				System.out.println(Details.getName()+","+Details.getSalary()+","+Details.getAge()+","+Details.getGender());
				
			}
			
		}
		for(Employee name:Employees) {
			if(name.getName().startsWith("s")) {
				System.out.println(name.getName());
			}
		}
		
	}

}
