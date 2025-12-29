package p51;
class Solution {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}

public class Problem51_atMostOneSegmentOfcontinuesOnes{
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "1000";
        boolean ans = obj.checkOnesSegment(s);
        System.out.println(ans);
    }
}