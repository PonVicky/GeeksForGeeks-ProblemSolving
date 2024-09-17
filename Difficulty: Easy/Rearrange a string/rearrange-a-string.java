//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.arrangeString(s));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String arrangeString(String s)
        {
            //code here.
            int sum = 0;
            String out = "";
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            for(char ch : arr){
                if(ch-'0' >= 0 && ch-'0'<=9){
                    sum+=ch-'0';
                }else{
                    out+=ch;
                }
            }
            if(sum == 0){
                return out;
            }
            return out+sum;
            
        }
}
