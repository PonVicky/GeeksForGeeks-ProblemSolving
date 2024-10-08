//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String s = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.penaltyScore(s));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int penaltyScore(String S)
    {
        // Your code goes here
        int count  = 0;
        for(int i=0;i<S.length()-1;i++){
            char ch = S.charAt(i);
            if(ch == '2'){
                if(S.charAt(i+1) == '1') count++;
            }
        }
        
        return count;
    }
}