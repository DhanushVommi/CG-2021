import java.util.Scanner;
import java.lang.Math;

public class intersts
{
    public static void main(String args[])
    {
	double si,ci,p,t,r,i;
        Scanner s=new Scanner(System.in);
        System.out.println("principle amount");
        p=s.nextDouble();
        
        System.out.println("time");
        t=s.nextDouble();
        
        System.out.println("rate");
        r=s.nextDouble();
        
        si=p*t*r/100;
        i=Math.pow(r,t);
        ci=p*i;
        System.out.println(si);
        System.out.println(ci);
}
}