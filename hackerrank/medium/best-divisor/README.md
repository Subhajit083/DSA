# Best Divisor

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Kristen loves playing with and comparing numbers. She thinks that if she takes two different positive numbers, the one whose digits sum to a larger number is *better* than the other. If the sum of digits is equal for both numbers, then she thinks the smaller number is *better*. For example, Kristen thinks that $13$ is better than $31$ and that $12$ is better than $11$.

Given an integer, $n$, can you find the divisor of $n$ that Kristin will consider to be the best?

**Input Format**

A single integer denoting $n$.

**Constraints**

* $0 \lt n \le 10^5$

**Output Format**

Print an integer denoting the best divisor of $n$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T15:12:11.239Z  

```java
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

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/best-divisor/problem)