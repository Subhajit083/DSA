# Halloween party

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Alex is attending a Halloween party with his girlfriend, Silvia. At the party, Silvia spots the corner of an infinite chocolate bar (two dimensional, infinitely long in width and length).  

If the chocolate can be served only as 1 x 1 sized pieces and Alex can cut the chocolate bar exactly $K$ times, what is the maximum number of chocolate pieces Alex can cut and give Silvia?

**Input Format**  
The first line contains an integer $T$, the number of test cases. $T$ lines follow.<br>
Each line contains an integer $K$.  

**Output Format**<br>
$T$ lines; each line should contain an integer that denotes the maximum number of pieces that can be obtained for each test case.<br>

**Constraints**<br>
$1 \le T \le 10$<br>
$2 \le K \le 10^7$<br>

**Note**: Chocolate must be served in _1 x 1_ sized pieces. Alex can't relocate any of the pieces, nor can he place any piece on top of another.

**Sample Input #00**  

    4
    5
    6
    7
    8
    
**Sample Output #00**  

    6
    9
    12
    16
    
**Explanation**<br>
The explanation below is for the first two test cases. The rest of them follow a similar logic.<br>

For the first test-case where $K = 5$, you need $3$ horizontal and $2$ vertical cuts.<br> 
![halloweenboard](https://hr-challenge-images.s3.amazonaws.com/halloween-party.jpg)
For the second test case, where $K = 6$, you need $3$ horizontal and $3$ vertical cuts.

**Input Format**

 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T14:00:21.013Z  

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

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/halloween-party/problem)