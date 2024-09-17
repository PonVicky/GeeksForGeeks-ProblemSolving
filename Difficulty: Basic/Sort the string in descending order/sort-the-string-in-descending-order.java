//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String str = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.ReverseSort(str));
        }
    }
}
// } Driver Code Ends

//User function Template for Java
class Solution 
{ 
    String ReverseSort(String str) 
    { 
        // code here
        if(str.length() == 1){
            return str;
        }
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        str = String.valueOf(arr);
        StringBuilder out = new StringBuilder(str);
        return out.reverse().toString();
        
    }
} 