//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            
            System.out.println(ob.stringFilter(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String stringFilter(String str) 
    {
        // Your code goes here
        String out  = "";
        int len = str.length();
        for(int i=0;i<len-1;i++){
            char ch = str.charAt(i);
            if(ch=='a' && str.charAt(i+1) == 'c'){
                i++;
            }else if(ch=='b'){
                continue;
            }else{
                out+=ch;
            }
        }
        int n = len-1;
        if(str.charAt(n) =='c' && str.charAt(n-1)!='a'){
            out+=str.charAt(n);
        }else if(str.charAt(n)!='b' && str.charAt(n)!='c'){
            out+=str.charAt(n);
        }
        
        return out;
    }
}