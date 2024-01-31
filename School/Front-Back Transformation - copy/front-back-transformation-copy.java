//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.convert(S));
            
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String convert(String s) {
    
     StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            int ch = (int) s.charAt(i);

            if (ch >= 65 && ch <= 90) {
                char a = (char) (90 - ch + 65);
                sb.append(a);
            } else if (ch >= 97 && ch <= 122) {
                char b = (char) (122 - ch + 97);
                sb.append(b);
            } else {
                // If it's not an uppercase or lowercase letter, keep the original character.
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }   
} 