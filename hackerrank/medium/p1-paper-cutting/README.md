# Cutting Paper Squares

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Mary has an $n \times m$ piece of paper that she wants to cut into $1 \times 1$ pieces according to the following rules:

- She can only cut *one piece of paper at a time*, meaning she *cannot* fold the paper or layer already-cut pieces on top of one another. 
- Each cut is a straight line from one side of the paper to the other side of the paper. For example, the diagram below depicts the three possible ways to cut a $3 \times 2$ piece of paper:		
	![example-cutting-squares.png](https://s3.amazonaws.com/hr-challenge-images/26273/1476740077-bd1ab26d74-example-cutting-squares.png)

Given $n$ and $m$, find and print the minimum number of cuts Mary must make to cut the paper into $n \cdot m$ squares that are $1 \times 1$ unit in size. 

**Input Format**

A single line of two space-separated integers denoting the respective values of $n$ and $m$.

**Constraints**

- $1 \le n, m \le 10^{9}$

**Output Format**

Print a long integer denoting the minimum number of cuts needed to cut the entire paper into $1 \times 1$ squares.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T15:09:06.346Z  

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
     * Complete the 'solve' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     */

    public static long solve(int n, int m) {
    // Write your code here
    
    return (long)n*m-1;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        long result = Result.solve(n, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/p1-paper-cutting/problem)