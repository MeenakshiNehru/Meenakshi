import java.util.*;
class Details
{ 
  String Name,Number,n,n1;
  int Cost=0,room_cost=0,food_cost=0;
  Scanner kb = new Scanner(System.in);
  public void disp()
   {
     Cost =room_cost+food_cost;
     System.out.println("Your name is "+ Name);
     System.out.println("Your phone number is "+ Number);
     System.out.println("Your Room rent is"+room_cost);
     System.out.println("Your Food cost is"+food_cost);
     System.out.println("Your billing amount is "+ Cost);
  }
   public void getinfo()throws NameException,PhoneException
     {
        System.out.println("Enter your name:");
        Name=kb.nextLine();
        int len=Name.length();
        for(int j=0;j<len;j++)
          {
             char c=Name.charAt(j);
             if((c>='A'&&c<='Z')||(c>='a'&&c<='z'))
             {
                         }
             else
             {n=Name;
             throw new NameException(n);
             }}

        System.out.println("Enter your phone number:");
        Number=kb.nextLine();
        int len1=Number.length();
         if(len1>10 ||len1<10)
            {n1=Number;
            throw new PhoneException(n1);  
            }
        for(int k=0;k<len1;k++)
          {
             char c=Number.charAt(k);
             if((c>='0'&&c<='9'))
             {
                         }
             else
             {n1=Number;
             throw new PhoneException(n1);
             }}
     }

}   
     
     
 