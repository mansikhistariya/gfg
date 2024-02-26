//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int H = Integer.parseInt(S[0]);
            int M = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.getAngle(H,M));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int getAngle(int H , int M) {
       float angle = (float)Math.abs(5.5*M - 30*H); 

        if(angle > 180) {

            return (int)(360-angle);

        }

        return (int)angle;
    }
};