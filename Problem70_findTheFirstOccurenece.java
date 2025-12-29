package p70;

class Solution {
    public int strStr(String haystack, String needle) {
        int i=0, j,p=0;
        if(haystack.contains(needle) == false){return -1;};
        for (j = 0; j < haystack.length(); j++) {
            if (haystack.charAt(j) == needle.charAt(i)) {
                i++;
                if (i == needle.length())   {
                    return j - (needle.length() - 1);
                }
            }
            else{
                i=0;
                j=p++;
            }
        }
        return -1;
    }
}

public class Problem70_findTheFirstOccurenece {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String haystack = "mississippi";
        String needle = "issip";
        int ans = obj.strStr(haystack, needle);
        System.out.println(ans);
    }
}
