import java.util.Scanner;
import java.lang.Math;

public class as4
{
    public static void main(String args[])
    {
     int a,b,c;
     Scanner s=new Scanner(System.in);
     System.out.println("1st subject:");
     a=s.nextInt();
    System.out.println("2nd subject:");
     b=s.nextInt();
     System.out.println("3rd subject:");
     c=s.nextInt();
     if(a>=60 && b>=60 && c>=60)
      {System.out.println("passed");}
     else
      if((a>=60 && (b>=60 || c>=60)) || (b>=60 && (a>=60 || c>=60)) || (c>=60 && (b>=60 || a>=60)))
      {System.out.println("promoted");}
     else

      {System.out.println("failed");}

}
}