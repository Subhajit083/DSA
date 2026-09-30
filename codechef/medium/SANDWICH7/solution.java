/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
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
		int totalFilling=(H+C);
		int ans=0;
		if(max<totalFilling ||totalFilling<=0){
		    ans=max;
		}
		else{
		    ans=totalFilling;
		}
		
System.out.println(ans);
	}
}
