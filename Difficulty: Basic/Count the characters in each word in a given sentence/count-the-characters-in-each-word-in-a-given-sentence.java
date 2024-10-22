//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG{
    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t > 0){
            String S = sc.nextLine();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.countChars(S);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
            t--;
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    ArrayList<Integer> countChars (String s)
    {
        // code here
        s+=' ';
        ArrayList<Integer> list = new ArrayList<>();
        String word  = "";
        for(char ch:s.toCharArray()){
            if(ch!=' '){
                word+=ch;
            }else{
                list.add(word.length());
                word = "";
            }
        }
        
        return list;
    }
}
