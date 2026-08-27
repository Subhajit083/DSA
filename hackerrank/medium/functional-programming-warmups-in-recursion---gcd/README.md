# Computing the GCD

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

**Objective** <Br>
In this challenge, we learn how to compute GCD using the Euclidean algorithm.

**Resources** <br>
Here's a helpful video on the topic:   
[(iframe youtube JUzYl1TYMcU 600 350)] 
 

Given two integers, $x$ and $y$, a recursive technique to find their GCD is the [Euclidean Algorithm](http://people.cis.ksu.edu/~schmidt/301s12/Exercises/euclid_alg.html). 

The algorithm states that, for computing the GCD of two positive integers $x$ and $y$, if $x$ and $y$ are equal, $GCD(x,y) = x$. Otherwise $GCD(x,y) = GCD(x-y,y)$ if $x > y$. There are a few optimizations that can be made to the above logic to arrive at a more efficient implementation.

**Task** <br>
Given the starter code, you need to complete a function body that returns the GCD of two given integers $x$ and $y$. <br>
The task of reading in input and printing the output will be handled by us.  
 
**Programming Language Support**  
At this point of time, we have a template for Scala. This means that we provide the code required to accept the input and display the output.  


**Input Format**

One line of input containing $2$ space separated integers.  

**Constraints**

$1 \le a,b \le 10^6$   

**Output Format**

Output one integer, the GCD of the two given numbers.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T04:42:29.492Z  

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(b!=0){
            int rem=b;
            b=a%b;
            a=rem;
        }
        System.out.println(a);
        
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/functional-programming-warmups-in-recursion---gcd/problem)