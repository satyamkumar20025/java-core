package exception_handling;

import java.util.Scanner;

public class University_Student {
	String name;
	private int roll_no;
	private float marks1,marks2,marks3,marks4,marks5;
	private float total,avg,per,Gpa;

	 void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the any student name:");
		name=sc.nextLine();
        System.out.print("Enter the roll no name:");
        roll_no=sc.nextInt();
        System.out.print("Enter the any 3 subject marks:");
		marks1=sc.nextFloat();
		marks2=sc.nextFloat();
		marks3=sc.nextFloat();
		marks4=sc.nextFloat();
		marks5=sc.nextFloat();

		}
	void calculate()
	{
		
		total=marks1+marks2+marks3+marks4+marks5;
		avg=total/5;
		per=total*100/500;
	}
	void calculate_GPA()
	{
		Gpa=per/9.5;
	}
	void ispass()
	{
		if(Gpa>=5.0)
		{
			System.out.print("pass");
		}
		else {
			System.out.print("fall");
		}
	}
	void Grade()
	{
		if(Gpa=<10&&Gpa>9)
		{
	      System.out.print("outstanding"+Gpa);		
		}
	}
	void display()
	{
		System.out.println("Student name"+name);
		System.out.println("Student rollno"+roll_no);
		System.out.println("Student marks1"+marks1);
		System.out.println("Student marks2"+marks2);
		System.out.println("Student marks3"+marks3);
		System.out.println("Student marks4"+marks4);
		System.out.println("Student marks5"+marks5);
		System.out.println("Student total marks"+total);
		System.out.println("Student averge marks"+avg);
		System.out.println("Student percenteg marks"+per);
		}
	
		public static void main(String[] args) {
			University_Student s1=new  University_Student();
			s1.input();
			s1.calculate();
			s1.calculate_GPA();
			s1.Grade(); 
			s1.display();
		}
}






