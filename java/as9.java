import java.util.Scanner;
import java.lang.Math;

public class as9
{
    public static void main(String args[])
    {
     int a[];

    int i=0,j=0;
  int b[]=new int[3];
  for(i=0;i<3;i++)
{int sum=0,avg=0;
System.out.println(i+"student marks");
for(j=0;j<3;j++)
{Scanner s=new Scanner(System.in);
b[j]=s.nextInt();
sum=sum+b[j];
}
avg=sum/3;
System.out.println(sum);
System.out.println(avg);
}
     

}
}