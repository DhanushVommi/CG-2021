import java.util.Scanner;
import java.lang.Math;

public class as6
{
    public static void main(String args[])
    {
     String name1="Dhanush";
     String pass1="6789";
     
int c=0,i=0;
  for(i=0;c<3;i++)
{
    Scanner s=new Scanner(System.in);
   System.out.println("name");
   String name=s.nextLine();
   System.out.println("password");
   String password=s.nextLine();
if(name1.equals(name) && pass1.equals(password))
 {System.out.println("login succesful");
  break;}
 
 else
 
 c++;}
 
 if(c==3)
{System.out.println("Contact Admin");
System.exit(0);}

}
}