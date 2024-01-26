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
            String s = read.readLine();
            
            Solution ob = new Solution();
            String result = ob.removeCharacters(s);
            
            System.out.println(result);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeCharacters(String S) {
       String k="";
       for(int i=0;i<S.length();i++){
           char ch=S.charAt(i);
           if(ch=='1'|| ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'|| ch=='7'|| ch=='8'|| ch=='0'|| ch=='9'){
               k=k+S.charAt(i);
           }
       }
       return k;
    }
}