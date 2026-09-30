import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int B,H,C;
		B=sc.nextInt();
		H=sc.nextInt();
		C=sc.nextInt();
		int max=B/2;
		int totalFilling=H+C;
		int ans=0;
		if(max<totalFilling || totalFilling<=0){
		    ans=max;
		}
		else{
		    ans=totalFilling;
		}
		
System.out.println(ans);
	}
}
