package Function;

import java.util.Scanner;

public class airline_reservation {

	private String passenger_name,name;
	private int flightno;
	private int seatno;
	private int person;
	private int cancel;
	private int totalseat=50;
	private int tickets;

	private double ticket_price;

	void input()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the passenger name:");
		passenger_name=sc. nextLine();
		System.out.print("Enter the flightno :");
		flightno=sc. nextInt();
		System.out.print("Enter the seatno :");
		seatno=sc. nextInt();
	}
		
      void calculate()
      {
    	  Scanner sc=new Scanner (System.in);
    		System.out.print("Enter the ticket price :");
    		ticket_price=sc.nextDouble();
    		System.out.print("Enter the number of person :");
    		person=sc.nextInt();
    		
                if(ticket_price==2000)
                {
                	ticket_price=ticket_price*person;
            		System.out.print("ECONOMY CLASS :"+ticket_price);

                }
                else if(ticket_price>5000)
                {
                	ticket_price=ticket_price*person;
            		System.out.print("BUSINESS CLASS :"+ticket_price);

                }
                else if(ticket_price>10000)
                {
                	ticket_price=ticket_price*person;
            		System.out.print("FIRST CLASS :"+ticket_price);
                }
      		
      }
      void bookticket()
      {
        Scanner sc=new Scanner (System.in);
  		System.out.print("WELCOME TO TICKET BOOKING SYSTEM:");
		System.out.print("TOTAL SEAT AVAILABLE :"+totalseat);
		System.out.print("ENTER THE YOUR NAME :");
		sc.nextLine();
		name=sc.nextLine();
		System.out.print("HOW MANY TICKETS DO YOU WANT TO BOOKING :");
		 tickets=sc.nextInt();
           if(tickets<=totalseat&&tickets>0)
           {
        	   totalseat-=tickets;
       		System.out.print("booking successful for :"+name);
    		System.out.print("Tickets booked :"+tickets);
    		System.out.print("Remainig seat :"+totalseat);
           }
           else {
       		System.out.print("soory booking failed not avilable :"+totalseat);

           }

      }
      void cancel()
      {
        Scanner sc=new Scanner (System.in);
  		System.out.print("HOW MANY TICKETS DO YOU WANT TO CANCEL :");
         cancel =sc.nextInt();
         
         cancel=cancel-tickets;
   		System.out.print("TICKET CANCEL SUCCESSFUL :"+cancel);

      }
      
     void display()
  	{
  		System.out.println("CUSTOMER PRODUCT NAME:"+passenger_name);
  		System.out.println("PRODUCT PRICE :"+seatno);
  		System.out.println("PRODUCT QUANTITY:"+flightno);
  		System.out.println("PAYMENT:"+totalseat);
  		
  		}
  	
  		public static void main(String[] args) {
  			airline_reservation s1=new  airline_reservation();
  			s1.input();
  			s1.calculate(); 
  			s1.bookticket();
  			s1.cancel();
  			s1.display();
  		}
  }
