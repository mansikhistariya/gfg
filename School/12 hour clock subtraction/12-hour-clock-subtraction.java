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
            
            int num1 = Integer.parseInt(S[0]);
            int num2 = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.subClock(num1,num2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int subClock(int num1, int num2) {
       int ans = (num1 - num2 + 12) % 12;
       if(ans<0){
           ans+=12;
       }
       if(ans==12){
           ans=0;
       }
        return ans;
     
    }
};