//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java

class Solution{
    static String isStringExist(String arr[],int N,String S){
        // code here
        int count = 0;
        int len = S.length();
        for(int i=0;i<N;i++){
            int inner = 0;
            if(len == arr[i].length()){
                for(int j=0;j<len;j++){
                    if(arr[i].charAt(j) != S.charAt(j)) inner++;
                }
            }
            if(inner == 1) count++;
        }
        if(count > 0) return "True";
        return "False";
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split(" ");
            String X =read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.isStringExist(input_line, N, X));
        }
    }
}
// } Driver Code Ends