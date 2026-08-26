# Leonardo's Prime Factors

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Leonardo loves primes and created $q$ queries where each query takes the form of an integer, $n$. For each $n$, count the maximum number of distinct prime factors of any number in the inclusive range $[1, n]$.

**Note:** Recall that a prime number is only divisible by $1$ and itself, and $1$ is *not* a prime number.  

**Example**  
$n = 100$  

The maximum number of distinct prime factors for values less than or equal to $100$ is $3$.  One value with $3$ distinct prime factors is $30$. Another is $42$.    

**Function Description**  

Complete the *primeCount* function in the editor below.  

*primeCount* has the following parameters:  

- *int n:* the inclusive limit of the range to check  

**Returns**  

- *int:* the maximum number of distinct prime factors of any number in the inclusive range $[0 - n]$.  

**Input Format**

The first line contains an integer, $q$, the number of queries. 	
Each of the next $q$ lines contains a single integer, $n$.

**Constraints**

+ $1 \le q \le 10^{5}$  
+ $1 \le n \le 10^{18}$  

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T16:16:42.233Z  

```java
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
 

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/leonardo-and-prime/problem)