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
            System.out.println(ob.isDigitSumPalindrome(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int isDigitSumPalindrome(int N) {
        int sum=0;
        String s=String.valueOf(N);
        for(int i=0;i<s.length();i++){
             sum += Character.getNumericValue(s.charAt(i));
        }
        String sumStr = String.valueOf(sum);
        StringBuilder sb=new StringBuilder(sumStr);  
        sb.reverse();  
        String j= sb.toString(); 
       if(sumStr.equals(j)){
           return 1;
       }
        return 0;
    }
}