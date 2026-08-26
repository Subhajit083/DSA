import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'primeCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static int primeCount(long n) {
    // Write your code here
    int[] primes={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53};
    int count=0;
    long product =1;
    for(int i:primes){
        if(n/i<product){
            break;
        }
        product*=i;
        count++;
    }
    
return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            long n = Long.parseLong(bufferedReader.readLine().trim());

            int result = Result.primeCount(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
 
