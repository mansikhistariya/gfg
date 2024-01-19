//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.lang.*;
import java.io.*;




class Array
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	    {
	    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int key = sc.nextInt();
		    Solution ob=new Solution();
		    int ar[]=ob.findIndex(arr,n,key);
		    System.out.println(ar[0]+" "+ar[1]);
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{ 
    // Function to find starting and end index 
   
    // Function to find starting and end index 
    static int[] findIndex(int a[], int N, int key)
    { 
        int arr[]= {-1,-1};
        int start=0;
        int end = N-1;
        while(start<=end){
            if(a[start]==key && a[end]==key) {
                 arr[0]=start;
                 arr[1]=end;
                 return arr;
            }
            if(a[start]!=key) start++;
            if(a[end]!=key) end--;
        }
       return arr;
    }


}