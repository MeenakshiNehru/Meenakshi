import java.util.*;
class Room
{ 
   int choice1,days,amount,choice2;
   public int cost;
  Scanner kb=new Scanner(System.in);
   void display()
   {
     System.out.println("Room Facility");
     System.out.println("1.AC");
     System.out.println("2.Non AC");
    }
   void getdetails()
     {
        System.out.println("Enter your choice:");
        choice1=kb.nextInt();
        if(choice1==1)
            {
                 System.out.println("Do u need 1.single bed or 2.double bed");
                  choice2=kb.nextInt();
                  if(choice2==1)
                       cost = 2000;
                 else if(choice2==2)
                       cost =2500;
               }
        else if(choice1 ==2)
              {	 
                 System.out.println("Do u need 1.single bed or 2.double bed");
                  choice2=kb.nextInt();
                  if(choice2==1)
                       cost = 1500;
                  else if(choice2==2)
                       cost =2000;
                }
         else 
	{
	System.out.println("Invalid option please try again");
	getdetails();
	}
       
 }
}
 class RoomRent extends Room
   {
        int getdetails2()
        {
        System.out.println("Enter the number of days to stay");
        days=kb.nextInt();
        amount=cost*days;
        System.out.println(amount);
        return amount;  
}    
    } 
     
 