# Army Game

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Luke is daydreaming in Math class. He has a sheet of graph paper with $n$ rows and $m$ columns, and he imagines that there is an army base in each cell for a total of $n \cdot m$ bases. He wants to drop supplies at strategic points on the sheet, marking each drop point with a red dot. If a base contains at least one package inside or on top of its border fence, then it's considered to be supplied. For example:

![image](https://s3.amazonaws.com/hr-challenge-images/0/1479944215-79f12638a7-example-army-game.png)

Given $n$ and $m$, what's the minimum number of packages that Luke must drop to supply all of his bases?  

**Example**  
$n = 2$  
$m = 3$  

Packages can be dropped at the corner between cells (0, 0), (0, 1), (1, 0) and (1, 1) to supply $4$ bases.  Another package can be dropped at a border between (0, 2) and (1, 2).  This supplies all bases using $2$ packages.  

**Function Description**  

Complete the *gameWithCells* function in the editor below.  

*gameWithCells* has the following parameters:  

- *int n:* the number of rows in the game  
- *int m:* the number of columns in the game  

**Returns**  

- *int:* the minimum number of packages required  

**Input Format**

Two space-separated integers describing the respective values of $n$ and $m$.

**Constraints**

$0 \lt n, m \le 1000$  

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T15:50:55.792Z  

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
     * Complete the 'gameWithCells' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     */

    public static int gameWithCells(int n, int m) {
    // Write your code here
    return ((n+1)/2)*((m+1)/2);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.gameWithCells(n, m);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/game-with-cells/problem)