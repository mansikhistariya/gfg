//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        while(t--!=0){
            String s1=in.next(),
                   s2=in.next();
            
            Solution obj = new Solution();
            
            System.out.println(obj.concatenatedString(s1,s2));
        }
    }
}

// } Driver Code Ends


class Solution{
  public static String concatenatedString(String s1,String s2)
    {
        int i=0;
        StringBuilder s = new StringBuilder(s1+s2);
           while(i<s.length()){
            if(s1.indexOf(s.charAt(i))!=-1 && s2.indexOf(s.charAt(i))!=-1){
                s.deleteCharAt(i);
            }else
             i++;
            }
            return (s.length()>=1)?String.valueOf(s):"-1";
        }
        
    }

