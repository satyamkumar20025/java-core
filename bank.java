package exception_handling;

import java.util.Scanner;

public class Bank {
	private int acc_no;
	private String name,bra,Enter;
	private float add;
	private float current,curr;
	private float  with,pre;
	

	 void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the accountnumber:");
		acc_no=sc.nextInt();
		 sc.nextLine();
        System.out.print("Enter the name:");
        name=sc.nextLine();
        
        
        System.out.print("Enter the branch:");
        bra=sc.nextLine();

        System.out.print("Enter the current balaance");
        current=sc.nextFloat();
        
	}
       void add_money() {
   		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the add money :");
		add=sc.nextFloat();
		System.out.print("add money successfull:");
		
		}
       void withdraw()
        {
    	   Scanner sc = new Scanner (System.in);
        	System.out.print("Enter the withdraw amount:");
   		 sc.nextLine();

        	if(current<=with)
        	{
            	curr-=with;
                pre=curr;
        		System.out.print("withdraw successfull"+pre);
        	}
        	else {
        		System.out.print("not withdraw"+curr);
        	}
        	
        }
        
	
	void display()
	{
		System.out.println(" name"+name);
		System.out.println("account number"+acc_no);
		System.out.println("present amount"+pre);
		System.out.println(" withdraw amount"+with);
		System.out.println(" branch name"+bra);
		
		

		}
	
		public static void main(String[] args) {
			Bank s1=new Bank();
			s1.input();
			s1.add_money();
			s1.withdraw();
			s1.display();
		}
}


