package Function;


import java.util.Scanner;

public class library_book {

	private int book_id;
	private String title;
	private String author;
	private double price;
	private int quantity;  ///////total book 
	private int return1;
	private int issuecount;
	

	void input()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the book id:");
		book_id=sc. nextInt();
		System.out.print("Enter the title(BOOK):");
		 sc.nextLine();
		title=sc.nextLine();
		System.out.print("Enter the author name:");
		author=sc.nextLine();
		System.out.print("Enter the price :");
		price=sc. nextDouble();
		System.out.print("Enter the product quantity:");
		quantity=sc. nextInt();
	}
	void display()
	{
		System.out.println("BOOK ID :"+book_id);
		System.out.println("BOOK TITAL:"+title);
		System.out.println("AUTHOR NAME (BOOK):"+author);
		System.out.println("PRICE(BOOK):"+price);
		System.out.println("QUANTITY(BOOK):"+quantity);

	}
	void available()
	{
		if(quantity>0)
		{
			System.out.println("BOOK AVAILABLE :");

		}
		else {
			System.out.println("BOOK NOT AVAILABLE :");

		}
	}
	void issue()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("you are issue book (input 1) :");
		   issuecount = sc.nextInt();
		  if(issuecount<=quantity)
		  {
	           quantity=quantity-issuecount;
	           System.out.print(issuecount+"book(s) ISSUED SUCCESSFULL !");
	           System.out.print("REMAINING BOOK"+quantity);

     		  }
		  else {
	           System.out.print("REMAINING BOOK"+quantity);

		  }
        
           
	}
	void returnbook()
	{
		Scanner sc = new Scanner (System.in);
        System.out.print("you are return book (press1)not return(press0):");
        return1=sc.nextInt();
        return1=issuecount+return1;

	}
	public static void main(String[] args) {
        
		library_book s1=new library_book();
		     s1.input();
             s1.display();
             s1.available();
             s1.issue();
             s1.returnbook();
	
}


}
