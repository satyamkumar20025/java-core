package Function;

import java.util.Scanner;

public class rectangle {
	private double  length;
	private double  breadth;
	private double area;
	private double  perim;
	
	 void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the any Rectangle length:");
		length=sc.nextDouble();
		System.out.print("Enter the any Rectangle breadth:");
		breadth=sc.nextDouble();


	}
	 void calculate()
	 { 
		 area=length*breadth;
	 }
	 void calculate_perimeter()
	 {
       perim=2*(length+breadth);		 
	 }
	 void square()
	 {
		 if(length==breadth)
		 {
				System.out.print("it square:");

		 }
		 else {
				System.out.print("it Rectangle :");

		 }
	 }
	 void display()
	 {
			System.out.println("Rectangle length:"+length);
			System.out.println("Rectangle breadth:"+breadth);
			System.out.println("Rectangle Area :"+area);
			System.out.println(" Rectangle Perimeter:"+perim);
	 }
		public static void main(String[] args) {
			rectangle s1=new rectangle();
			s1.input();
			s1.calculate();
			s1.calculate_perimeter();
			s1.square();
            s1.display();
            
          }

}
