class NameException extends Exception
{
    String name1;
     NameException(String n)
       {
            name1=n;
        }
public String  toString ()
        {
             return "Enter a valid name,this " +name1+" could not be a name";
          }
}