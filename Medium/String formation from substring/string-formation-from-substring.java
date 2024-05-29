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
            String input = read.readLine();
            
            Solution ob = new Solution();
            int result = ob.isRepeat(input);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isRepeat(String s) {
       int i=0;
        int n=s.length();

    for(int j=1;j<=s.length()/2;j++){
        if(n%j==0){
        String str=s.substring(i,j);
        StringBuilder sb=new StringBuilder();
        for(int k=0;k<n/j;k++){
            sb.append(str);   
        }
        if(sb.toString().equals(s)){
            return 1;
          }
        }
        
      }
    return 0;
   }
}