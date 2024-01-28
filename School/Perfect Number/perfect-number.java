//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPerfect(N));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int isPerfect(int N) {
        int x=N;
        int sum=0;
        while(x>0){
            int remainder=x%10;
             sum+=fact(remainder);
             x=x/10;
            
        }
        if(sum!=N){
            return 0;
        }
        return 1;
    }
    int fact(int remainder){
        if(remainder==1 || remainder==0){
            return 1;
        }else{
            return remainder*fact(remainder-1);
        }
    }
}