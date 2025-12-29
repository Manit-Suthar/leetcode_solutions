package p87;
import java.util.*;
class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();
        for (String ele : words) {
            sb.append(ele.charAt(0));
        }
        return sb.toString().equals(s);
    }
}

public class Problem87_accronymOfWord {
    public static void main(String[] args) {
        Solution obj = new Solution();
        List<String> l = new ArrayList<>();
        l.add("abs");
        l.add("bbs");
        l.add("cbs");
        String s = "abc";
        boolean ans = obj.isAcronym(l, s);
        System.out.println(ans);

    }
}
