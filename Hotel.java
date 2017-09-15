import java.io.*;
import java.util.*;
class  Hotel
{
   public static void main(String args[]) throws IOException,Exception
     {
      Details u[] = new Details[10];
       int choice,amount;
       System.out.println("Hotel name");
       System.out.println("Address");
       Scanner br=new Scanner (System.in);
      for(int i=0;i<10;i++)
     { 
      u[i] =new Details();
      u[i].getinfo();
       System.out.println("1.Booking");
       System.out.println("2.Food Land");
       System.out.println("3.Billing");
       System.out.println("Enter your choice");
       choice=br.nextInt();
      switch(choice)
       {
	case 1:
	Room r1= new Room();
                   RoomRent r2=new RoomRent();
	r2.display();
                   r2.getdetails();
	amount=r2.getdetails2();
     	u[i].room_cost=amount;
	break;
	case 2:
	Food f=new Food();
                  Foodchrg  f1=new Foodchrg();
	f1.display_food();
	f1.getdetails();
                   amount=f1.getdetails2();
	u[i].food_cost=amount;
	break;
	default:
	System.out.println("Invalid Input");
	break;
       }
       u[i].disp();
}}
}	     






          