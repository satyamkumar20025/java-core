package Constructor_Question;

import java.util.Scanner;

public class flight {

 int flightno;
 String source;
 String destination;
 String seatsavailable;
 public flight(int flightno, String source, String destination, String seatsavailable) {
	this.flightno = flightno;
	this.source = source;
	this.destination = destination;
	this.seatsavailable = seatsavailable;
 }
 void bookticket()
 {
	 String name;
	 int tickets;
	 int totalseat;
	 
        Scanner sc=new Scanner (System.in);
		System.out.println("WELCOME TO TICKET BOOKING SYSTEM ");
		System.out.print("ENTER THE AVAILABLE SEATS :");
		totalseat = sc.nextInt ();
	System.out.print("TOTAL SEAT AVAILABLE :"+totalseat);
	System.out.println("ENTER THE YOUR NAME :");
	name=sc.nextLine();
	System.out.print("HOW MANY TICKETS DO YOU WANT TO BOOKING :");
	sc.nextLine();
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
// public class main {
	 public static void main(String[] args) {
		 flight f1=new flight(455,"delhi","londan","yes");
		 f1.bookticket();
		 
	 }
		  
 }
 
 
//}
