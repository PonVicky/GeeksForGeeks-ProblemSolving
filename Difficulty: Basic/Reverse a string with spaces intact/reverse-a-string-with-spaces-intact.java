//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            String s;
            s = br.readLine();
            
            Solution ob = new Solution();
            
            System.out.println(ob.reverseWithSpacesIntact(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    String reverseWithSpacesIntact(String S)
    {
        int i = 0 ;
        int j = S.length()-1;
        char[] arr =  S.toCharArray();
        while(i < j){
            if(arr[i] == ' '){
              i++;
              continue;
            } 
            if(arr[j] == ' ') {
                j--;continue;
            }
            
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
        String str = new String(arr);
        return str;
    }
}