//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = Integer.parseInt(str[i]);
            String[] xy = br.readLine().trim().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            Solution g = new Solution();
            System.out.println(g.minDist(a, n, x, y));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minDist(int a[], int n, int x, int y) {
        int minDistance = Integer.MAX_VALUE;
        int prevIndex = -1; // To store the index of the last found x or y
        boolean found = false; // To check if we have found x or y at least once

        for (int i = 0; i < n; i++) {
            if (a[i] == x || a[i] == y) {
                if (prevIndex != -1 && a[prevIndex] != a[i]) {
                    minDistance = Math.min(minDistance, i - prevIndex);
                }
                prevIndex = i;
                found = true;
            }
        }

        if (!found || minDistance == Integer.MAX_VALUE) {
            return -1;
        }

        return minDistance;
    }
}
