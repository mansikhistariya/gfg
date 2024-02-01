//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String type = br.readLine().trim();
            float R = Float.parseFloat(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.findFocalLength(R, type);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int findFocalLength(float R, String type)
    {
        double f=0;
        if(type.equals("concave")){
             f=Math.floor(R/2);
        }else{
             f=Math.floor(-R/2);
        }
        return (int) f;
    }
}