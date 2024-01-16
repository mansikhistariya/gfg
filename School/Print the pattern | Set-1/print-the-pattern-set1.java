//{ Driver Code Starts
import java.util.Scanner;



class PrintPattern
{
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			GfG g = new GfG();
			g.printPat(n);
			System.out.println();
		
		t--;
		}
	}
}
// } Driver Code Ends


class GfG
{
    void printPat(int n)
    {
         for(int i=n;i>=1;i--)
         {
             int x = n;
             int count =0;
             for(int j=1;j<=n*i;j++)
             {
                 count++;
                 if(count>i)
                 {
                     x--;
                     count=1;
                 }
                 System.out.print(x+" ");
             }
             System.out.print("$");
         }
    }
}