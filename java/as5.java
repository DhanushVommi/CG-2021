import java.util.Scanner;
import java.lang.Math;

public class as5
{
    public static void main(String args[])
    {
     int in,tax;
     Scanner s=new Scanner(System.in);
     System.out.println("income");
     in=s.nextInt();
     if(in>=0 && in<=18000)
     {System.out.println("Nil");}
    else
    if(in>=181001 && in<=300000)
    {tax=in*10/100;
     System.out.println(tax);
     }
    else
   if(in>=300001 && in<=500000)
    {tax=in*20/100;
     System.out.println(tax);
     }
    else
   if(in>=500001 && in<=1000000)
    {tax=in*30/100;
     System.out.println(tax);
     }

}
}