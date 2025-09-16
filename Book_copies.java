package Constructor_Question;

import java.util.Scanner;

public class book_copies {
	private int book_id;
	private String title;
	private String author;
	private int copies;


	//parameterzed constructor
	book_copies(String title,String author,int copies)
	{
		this.title=title;
		this.author=author;
		this.copies=copies;
	}
	//method to issue book
	void issuebook()
	{
		if(copies>0)
		{
			copies--;
			System.out.print("BOOK ISSUED SUCCESSFULLY.REMAINING COPIES:"+copies);
		}
		else {
			System.out.print("no copies available to issue.");
			
		}
	}
	void returnbook()
	{
		copies++;
		System.out.println("book returned successfully.available copies:"+copies);
	}
	void display()
	{
		System.out.print("Title:"+title);
		System.out.print("Author:"+author);
		System.out.print("Copies:"+copies);

	}
	public static void main(String[] args)
	{
		book_copies s1 =new book_copies("ct","Satyam kumar",5);
		s1.issuebook();
		s1.returnbook();
		s1.display();
		
	}
}











