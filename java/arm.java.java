import java.io.*;

public class as1{  
  public static void main(String[] args)  {  
    int n=153,r=0,a,t;  
    
    t=n;  
    while(n>0)  
    {  
    a=n%10;  
    n=n/10;  
    r=r+(a*a*a);  
    }  
    if(t==r)  
    System.out.println("arms number");   
    else  
        System.out.println("Not arms number");   
   }  
}