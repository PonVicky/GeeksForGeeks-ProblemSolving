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
            
            String input[] = read.readLine().split(" ");
            String x = input[0];
            String y = input[1];
            Solution ob = new Solution();
            System.out.println(ob.search(x, y));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int search(String X, String Y) {
        // code here
       if(!X.contains(Y)){
           return -1;
       }
        int n = Y.length();
        int l=n-1;
        for(int i=X.length()-1;i>=0;i--){
            if(X.charAt(i) == Y.charAt(l)){
                int count  = 0;
                int k = i;
                for(int j=n-1;j>=0;j--){
                    if(X.charAt(k--) == Y.charAt(j)){
                        count++;
                    }
                }
                if(count == n){
                    return k+=2;
                }
            }
        }
        
        return -1;
    }
}