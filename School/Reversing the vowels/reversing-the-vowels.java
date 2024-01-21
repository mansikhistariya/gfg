//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
           
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
     String modify(String s)
    {
        char s1[] = s.toCharArray();
        int l = 0;
        int h = s1.length - 1;
        while (l < h)
        {
            if (!check_vowel(s1[l]))
                l++;
            else if (!check_vowel(s1[h]))
                h--;  // Fix: decrement h instead of incrementing
            else
            {
                char temp = s1[l];
                s1[l] = s1[h];
                s1[h] = temp;
                l++;
                h--;
            }
        }
        return new String(s1);
    }

    boolean check_vowel(char ch)
    {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}