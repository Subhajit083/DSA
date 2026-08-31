import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        int bestSum =1;
        int best =1;
        for(int i=1; i<=n;i++){
            if(n%i==0){
                int sum=0;
                int x=i;
                while(x!=0){
                    sum+=x%10;
                    x/=10;
                }
                if(sum>bestSum){
                    bestSum=sum;
                    best=i;
                }
            }
        }
        System.out.println(best);


        bufferedReader.close();
    }
}
