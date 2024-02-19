//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        if(x.length()%2!=0){
            return false;
        }
        Stack<Character> sc=new Stack<>();
        boolean ans=false;
         for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                sc.push(ch);
            } else {
                if (sc.isEmpty() || !isMatchingPair(sc.pop(), ch)) {
                    return false; 
                }
            }
        }
        return sc.isEmpty(); 
    }

    
    static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') || (opening == '{' && closing == '}') || (opening == '[' && closing == ']');
    }
}
    

        