//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            Solution ob = new Solution();
            int ans = ob.findElement(arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findElement(List<Integer> arr) {
        // Code here
        int left = arr.get(0);
        int n = arr.size();
        int right = arr.get(n-1);
        int ind  = 0;
        for(int i=0;i<n;i++){
            if(i == n-1) continue; 
            
            if(arr.get(i) > left){
                ind  = i;
                left = arr.get(i);
                break;
            }
        }
        for(int i=n-2;i>=ind;i--){
            if(right == left){
                break;
            }
            if(right > arr.get(i)){
                right=arr.get(i);
            }else if(right < arr.get(i)){
                break;
            }
        }
        if(right == left){
            return right;
        }
        
        
        return -1;
    }
}