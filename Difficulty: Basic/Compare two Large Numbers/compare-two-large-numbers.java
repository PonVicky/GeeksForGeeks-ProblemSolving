//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String a = sc.next ();
            String b = sc.next();
            Solution obj = new Solution();
    		System.out.println (obj.check (a, b));
        
System.out.println("~");
}
        
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    int check (String a, String b)
    {
        // your code here
        double aa = Double.parseDouble(a);
        double bb = Double.parseDouble(b);
        if(aa < bb){
            return 1;
        }else if(aa > bb){
            return 2;
        }
        
        
        return 3;
        
    }
}