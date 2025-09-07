package exception_handling;

import java.util.Scanner;

public class Employee {
 private String name;
 private int id;
 private float hra,ta,da,pf,esi,gross,net,basic_salary;
	

	 void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the any student name:");
		name=sc.nextLine();
        System.out.print("Enter the employee id :");
        id=sc.nextInt();
        System.out.print("Enter the employee basic_salary:");
		basic_salary=sc.nextFloat();
        
		}
	void calculate()
	{
		
		hra=basic_salary*40/100;
		ta=basic_salary*30/100;
		da=basic_salary*40/100;
		pf=basic_salary*12/100;
		esi=basic_salary*2/100;
		gross=basic_salary+hra+ta+da;
        net=gross-pf-esi;
	}
	void display()
	{
		System.out.println("Student name"+name);
		System.out.println("Student id"+id);
		System.out.println("Student hra"+hra);
		System.out.println("Student ta"+ta);
		System.out.println("Student da"+da);
		System.out.println("Student pf"+pf);
		System.out.println("Student esi"+esi);
		System.out.println("Student gross salary"+gross);
		System.out.println("Student net salary"+net);

		}
	
		public static void main(String[] args) {
			Employee s1=new Employee();
			s1.input();
			s1.calculate();
			s1.display();
		}
}


