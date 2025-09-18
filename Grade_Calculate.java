
package Constructor_Question;

public class Student {

	int rollno;
	String name;
	int total;
	int avg;
	int per;
	int Gpa;
	int[] marks;
	public Student(int rollno, String name, int[] marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		
		total=marks[0]+marks[1]+marks[2];
		avg=total/3;
		per=total*100/300;
		Gpa=(int)(per/9.5);

	}
	void Grade()
	{
		if(Gpa<=10&&Gpa>9)
		{
	      System.out.print("outstanding  A :"+Gpa);		
		}
		if(Gpa<=9&&Gpa>8)
		{
		      System.out.print("Excellent  B :"+Gpa);		
		}
		if(Gpa<=8&&Gpa>7)
		{
		      System.out.print("Good     C :"+Gpa);		
		}
		if(Gpa<=7&&Gpa>6)
		{
		      System.out.print("Average    D:"+Gpa);		

		}
		if(Gpa<=6&&Gpa>5) 
		{
		      System.out.print("pass   E  :"+Gpa);		

		}
	}
		public static void main(String[] args) {
			
		   int[] marks= {96, 96, 96};
			Student s1 =new Student(27,"satyam",marks);
			s1.Grade();
			
		}
			
	}
		
	
