import java.io.*;
import java.util.Scanner;

public class arms

{
    public static void main(String args[])
    {
	int n,i=100, r,t;
	for(i=100; i<999; i++)
	{
	   t= i;
	   n= 0;
	   while(t>0)
	   {
		r=t%10;
		n=n+ r*r*r;
		t= t/10;
	   }
	   if(i == n)
	   {System.out.println(i);
		    }
	}}}