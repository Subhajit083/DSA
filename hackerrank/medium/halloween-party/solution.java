import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'halloweenParty' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER k as parameter.
     */

    public static long halloweenParty(int k) {
    // Write your code here
    long a = k / 2;
    long b = k - a;

    return a * b;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int k = Integer.parseInt(bufferedReader.readLine().trim());

            long result = Result.halloweenParty(k);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
