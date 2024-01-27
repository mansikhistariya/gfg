//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            Solution ob = new Solution();
            System.out.println(ob.javaIntType(sc));
            System.out.println(ob.javaStringType(sc));
            System.out.println(ob.javaFloatType(sc));
        }
    }
}
// } Driver Code Ends


class Solution {

    int javaIntType(Scanner sc) {
        int x=sc.nextInt();;
       return x;
    }
    
    String javaStringType(Scanner sc) {
       String x=sc.next();
        return x;
    }
    
    float javaFloatType(Scanner sc) {
        float f=sc.nextFloat();
        return f;
    }
};