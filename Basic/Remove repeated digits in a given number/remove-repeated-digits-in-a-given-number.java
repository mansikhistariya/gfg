//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            long num = Long.parseLong(read.readLine()); 
            Solution ob = new Solution();
            System.out.println(ob.modify(num));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public long modify(long N) {
        StringBuffer sb = new StringBuffer(String.valueOf(N)); // Convert long to String before creating StringBuffer
        int i = 0; // Initialize index outside the loop

        while (i < sb.length() - 1) { // Loop through the StringBuffer
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                sb = sb.deleteCharAt(i); // Delete the character at index i
                // Don't increment i here, because the next character is shifted left
            } else {
                i++; // Move to the next character
            }
        }

        String ans = sb.toString().trim();
        long a = Long.parseLong(ans);
        return a;
    }
}
