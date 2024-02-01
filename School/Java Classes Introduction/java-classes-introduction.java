//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.Scanner;


class GFG {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
         int l,w,h;
         l=sc.nextInt();
         w=sc.nextInt();
         h=sc.nextInt();
         task obj=new task();
         obj.set_length(l);
         obj.set_width(w);
         obj.set_height(h);
         obj.volume();
        }
    }
}


// } Driver Code Ends
//User function Template for Java

class task
{
    
     private int len;
     private int we;
     private int hi;
    public void set_length(int l)
    {
         this.len=l;
    }
    public void set_width(int w)
    {
        this.we=w;
    }
    public void set_height(int h)
    {
       this.hi=h;
    }
    public void volume()
    {
        System.out.println(len*we*hi);
       
        
    }
}

//{ Driver Code Starts.

// } Driver Code Ends