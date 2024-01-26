//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t-- > 0){
            String S = sc.nextLine();
            Solution ob = new Solution();
            List<String> ans = ob.splitString(S);
            for (String val: ans) 
                if(val == "")
                    System.out.println(-1); 
                else    
                    System.out.println(val); 
        }
    } 
} 


// } Driver Code Ends




class Solution 
{ 
    static List<String> splitString(String S) 
    { 
      List<String> n1= new ArrayList<>();
      String s1="";
      String s2="";
      String s3="";
      for(int i=0;i<S.length();i++){
          char k=S.charAt(i);
        //   int ch=Character.getNumericValue(k);
          if(Character.isLowerCase(k) || Character.isUpperCase(k) ){
           s1=s1+k;
          }
         else if(Character.isDigit(k)){
              s2=s2+k;
          }else{
              s3=s3+k;
          }
          
      }
      n1.add(s1);
       n1.add(s2);
        n1.add(s3);
      
      return n1;
    }
} 
