package Constructor;

import java.util.Scanner;

public class Student {
	String name;
	private int roll_no;
	private float marks1,marks2,marks3;
	private float total,avg,per;

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
		}
	void calculate()
	{
		
		total=marks1+marks2+marks3;
		avg=total/3;
		per=total*100/300;
	}
	void display()
	{
		System.out.println("Student name"+name);
		System.out.println("Student rollno"+roll_no);
		System.out.println("Student marks1"+marks1);
		System.out.println("Student marks2"+marks2);
		System.out.println("Student marks3"+marks3);
		System.out.println("Student total marks"+total);
		System.out.println("Student averge marks"+avg);
		System.out.println("Student percenteg marks"+per);
		}
	
		public static void main(String[] args) {
			Student s1=new Student();
			s1.input();
			s1.calculate();
			s1.display();
		}
}


