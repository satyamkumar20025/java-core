package Function;

import java.util.Scanner;

public class product {

	private String product_name;
	private double price;
	private double quantity;
	private double payment;
	private double selling_price;
	private double market_price;
	private double discount;
	

	void input()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the product name:");
		product_name=sc. nextLine();
		System.out.print("Enter the price :");
		price=sc. nextDouble();
		System.out.print("Enter the product quantity:");
		quantity=sc. nextDouble();
	}
		
      void calculate()
      {
    	  payment=price*quantity;
      }
      void discount()
      {
    	  Scanner sc=new Scanner (System.in);
  		System.out.print("Enter the marked price:");
		market_price=sc. nextDouble();
		System.out.print("Enter the selling price:");
		selling_price=sc. nextDouble();
		discount=market_price-selling_price;

      }
      void stock()
      {
    	  if(quantity>0)
    	  {
    		  System.out.print("stock hai");
    	  }
    	  else {
    		  System.out.print("NOT STOCK");
    		  
    	  }
      }
     void display()
  	{
  		System.out.println("CUSTOMER PRODUCT NAME:"+product_name);
  		System.out.println("PRODUCT PRICE :"+price);
  		System.out.println("PRODUCT QUANTITY:"+quantity);
  		System.out.println("PAYMENT:"+payment);
  		System.out.println("DISCOUNT:"+discount);
  		System.out.println("SELLING PRICE:"+selling_price);
  		System.out.println("MARKET PRICE:"+market_price);
  		
  		}
  	
  		public static void main(String[] args) {
  			product s1=new  product();
  			s1.input();
  			s1.calculate();
  			s1.discount();
  			s1.stock(); 
  			s1.display();
  		}
  }
