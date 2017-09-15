import java.util.*;
class Food
{ 
   int choice1,quants,cost,amount=0;
   Scanner kb=new Scanner(System.in);
   void display_food()
   {
     System.out.println("Menu Card");
     System.out.println("1.Cool drinks");
     System.out.println("2.Soft juices");
     System.out.println("3.Snacks");
    }
   void getdetails()
     {
        System.out.println("Enter your choice:");
        choice1=kb.nextInt();
        if(choice1==1)
	cost = 20;
        else if(choice1 ==2)
	cost =30;
         else if(choice1 ==3)
	cost=50;
         else
	{
	System.out.println("Invalid option please try again");
	getdetails();
	}
       
 }
}
 class Foodchrg extends Food
   {
        int getdetails2()
        {
         System.out.println("Enter the number of quantities ");
        quants=kb.nextInt();
        amount=amount+cost*quants;
        System.out.println(amount);
        return amount;
     }    
    } 
      
     
     
 