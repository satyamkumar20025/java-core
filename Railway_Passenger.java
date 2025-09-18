package Constructor_Question;

public class Passenger {

	String fieldsname;
	int age;
	String berthpreference;
	/**
	 * @param fieldsname
	 * @param age
	 * @param berthpreference
	 */
	public Passenger(String fieldsname, int age, String berthpreference) {
		this.fieldsname = fieldsname;
		this.age = age;
		this.berthpreference = berthpreference;
		
	}
	void check()
	{
		if(age>=60)
		{
			System.out.println("SENIOR CITIZEN");
		}
		 else if(age<60)
		{
			System.out.println("NOT SENIOR CITIZEN");

		}
	}
	void display()
	{
		System.out.println(fieldsname);
		System.out.println(age);
		System.out.println(berthpreference);

	}
	
	public static void main(String[] args) {
		
		Passenger p1 = new Passenger("sharnajibi",59,"20/11/2005");
		 p1.check();
		 p1.display();
		 
		
	}
	
}
