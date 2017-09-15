class PhoneException extends Exception
{
    String num1;
     PhoneException(String n1)
       {
            num1=n1;
        }
public String  toString ()
        {
             return "Enter a valid phone number,this " +num1+" could not be a name";
          }
}