# Minimum Height Triangle

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given integers $b$ and $a$, find the smallest integer $h$, such that there exists a triangle of height $h$, base $b$, having an area of at least $a$.


![image](https://s3.amazonaws.com/hr-assets/0/1496306792-f2c37eea44-triangle.jpg)  

**Example**  
$b = 4$  
$a = 6$  

The minimum height $h$ is $3$.  One example is a triangle formed at points (0, 0), (4, 0), (2, 3).  

**Function Description**  

Complete the *lowestTriangle* function in the editor below.  

*lowestTriangle* has the following parameters:  

- *int b:* the base of the triangle  
- *int a:* the minimum area of the triangle  

**Returns**  

- *int:*  the minimum integer height to form a triangle with an area of at least $a$ 

**Input Format**

There are two space-separated integers $b$ and $a$, on a single line.

**Constraints**

+ $1 \le b \leq 10^6$
+ $1 \le a \le 10^6$

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T15:07:46.159Z  

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
     * Complete the 'lowestTriangle' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER trianglebase
     *  2. INTEGER area
     */

    public static int lowestTriangle(int trianglebase, int area) {
    // Write your code here
    int a = area;
    int  b = trianglebase;
return (2*a+b-1)/b;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int trianglebase = Integer.parseInt(firstMultipleInput[0]);

        int area = Integer.parseInt(firstMultipleInput[1]);

        int height = Result.lowestTriangle(trianglebase, area);

        bufferedWriter.write(String.valueOf(height));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/lowest-triangle/problem)