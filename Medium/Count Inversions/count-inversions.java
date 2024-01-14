//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
  // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        long l = 0;
        long r = N-1;
        return inv(arr,l,r);
    }
    public static long inv(long arr[],long l, long r)
    {
        long res = 0;
        if(l<r)
        {
            long m = l+(r-l)/2;
            res +=  inv(arr,l,m);
            res +=  inv(arr,m+1,r);
            res += countinv(arr,l,m,r);
        }
        return res;
        
    }
    static long countinv(long arr[],long l ,long m,long r)
    {
        long n1 = m-l+1,n2 = r-m;
        long[] left = new long[(int)n1];
        long[] right = new long[(int)n2];
        
        for(int i = 0; i< n1;i++)
        {
            left[i] = arr[(int)l+i];
        }
        for(int i = 0; i<n2; i++)
        {
            right[i] = arr[(int)m+1+i];
        }
        long res = 0;
        int i = 0 , j = 0, k = (int)l;
        while(i<n1 && j<n2)
        {
            if(left[i] <= right[j])
            {
                arr[k] = left[i]; 
                i++; 
            }
            else
            {
                arr[k] = right[j];
                j++;
                //main step below
                res = res + (n1-i);
            }
            k++;
        }
        while(i<n1)
        {
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<n2)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
        return res;
    }
   
    
 
}