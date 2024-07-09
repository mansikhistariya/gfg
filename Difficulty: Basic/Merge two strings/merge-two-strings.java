//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            String S1 = input_line[0];
            String S2 = input_line[1];
            Solution ob = new Solution();
            System.out.println(ob.merge(S1,S2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    String merge(String S1, String S2) {
        int n = S1.length();
        int m = S2.length();
        StringBuilder ans = new StringBuilder(n + m);
        
        int k = 0, l = 0;
        for (int i = 0; i < n + m; i++) {
            if (i % 2 == 0) {
                if (k < n) {
                    ans.append(S1.charAt(k));
                    k++;
                } else {
                    ans.append(S2.charAt(l));
                    l++;
                }
            } else {
                if (l < m) {
                    ans.append(S2.charAt(l));
                    l++;
                } else {
                    ans.append(S1.charAt(k));
                    k++;
                }
            }
        }
        
        return ans.toString();
    }
}
