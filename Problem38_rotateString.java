package p38;

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String concatedStr = s + s;
        if(concatedStr.contains(goal)){
            return true;
        } 
        else{
            return false;
        }
    }
}

public class Problem38_rotateString {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "acb";
        String goal = "abc";
        boolean ans = obj.rotateString(s, goal);
        System.out.println(ans);
    }
}
