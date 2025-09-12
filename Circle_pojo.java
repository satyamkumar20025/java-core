package exception_handling;

import java.util.Scanner;

public class Circle {
	private float  r;
	private float area;
	private float  perim;
	
	 void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the any circle radius:");
		r=sc.nextFloat();
	}
	 void calculate_circle()
	 { 
		 area=(float)Math.PI*r*r;
	 }
	 void calculate_perimeter()
	 {
       perim=2*(float)Math.PI*r;		 
	 }
	 void display()
	 {
			System.out.print("circle radius:"+r);
			System.out.print("circle Area :"+area);
			System.out.print(" circle Perimeter:"+perim);
	 }
		public static void main(String[] args) {
			Circle s1=new Circle();
			s1.input();
			s1.calculate_circle();
			s1.calculate_perimeter();
            s1.display();
            
          }

}















