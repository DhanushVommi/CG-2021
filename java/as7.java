import java.util.Scanner;
public class as7{
 public static void main(String[] args){
	int x,flag=0;
	Scanner s=new Scanner(System.in);
	int[] arr={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	System.out.println("enter the value to find:");
	x=s.nextInt();
	
	for(int i=0; i<=arr.length; i++)
	{
	if(arr[i]==x){
	flag=1;
	break;
	}
	else{
	flag=0;
	}
}
	if(flag==1){
	System.out.println("Found");
	}	
	else
	{
	System.out.println("Not Found");
	}
}
}