import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int cost=0;
		    cost+=(n/2)*30;
		    cost+=(n%2)*20;
		    System.out.println(cost);
		}
		sc.close();

	}
}
