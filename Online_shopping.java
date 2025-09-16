package ENCAPSULATION_QUESTIONS;

import java.util.Scanner;

public class online_shopping {

	private String cust_name;
	private String[] cart=new String[10];//////cart size is ==10
	private String product;
	private int count=0;
	private double discount;
	private int  remove;
	private int  itemprice;
	private int  itemquantity;
	private String name;
	private int  totalbill;

	void input()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the cust name:");                                                           
		cust_name=sc. nextLine();
	}
		
      void addltem()
      {
    	  Scanner sc = new Scanner(System.in);
    	  System.out.print("Enter product to add: ");
    	  product = sc.nextLine();
    	  if(count < cart.length)
    	  {
    		  cart[count]=product;
    	  count++;
    	  System.out.print("added to card."+product);
    	  }
    	  else {
        	  System.out.println("card is failed");

    	  }
      }
    //  void removeitems()
     // {
      //if(remove >= 0 && remove < count) {
    //	    System.out.println("Removed item: " + cart[remove]);
    	//    cart[remove] = null;
    	//} else {
    	//    System.out.println("Invalid index");
    	//}
     // }
      void removeitems() {
    	    Scanner sc = new Scanner(System.in);
    	    System.out.println("Enter index of item to remove: ");
    	    remove = sc.nextInt();

    	    if(remove >= 0 && remove < count) {
    	        System.out.println("Removed item: " + cart[remove]);
    	        cart[remove] = null;
    	    } else {
    	        System.out.println("Invalid index");
    	    }
    	}

      void price()
      {
  		Scanner sc = new Scanner (System.in);
    	System.out.println("item name");
  	  name=sc.nextLine();
      	System.out.println("item quantity");
  	 itemquantity =sc.nextInt();
      	System.out.println("item price:");
  	  itemprice=sc.nextInt();
  	  totalbill=itemprice*itemquantity;

      }
      void applycoupon()
      {
    		Scanner sc = new Scanner (System.in);
            System.out.print("Enter the discountpercent");
    	  int discountpercent=sc.nextInt();
    	  
    	  if(totalbill>1000)
    	  {
    		  discount=totalbill*(discountpercent /100.0);
    		  totalbill-=discount;
    	  }
 
    	  
      }
     void display()
  	{
  		System.out.println("CUSTOMER PRODUCT NAME:"+cust_name);
  		System.out.println("item PRICE :"+itemprice);
  		System.out.println("item QUANTITY:"+itemquantity);
  		System.out.println("PAYMENTorTOTAL BILL:"+totalbill);
  		System.out.println("DISCOUNT:"+discount);
  		System.out.println("remove item :"+remove);
  		System.out.println("your item order name:"+name);
  		
  		}
  	
  		public static void main(String[] args) {
  			online_shopping s1=new  online_shopping();
  			s1.input();
  			s1.addltem();
  			s1.removeitems();
  			s1.price();
  			s1.applycoupon();
  			s1.display();
  		}
  }
