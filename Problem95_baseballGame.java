package p95;

import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        int score = 0;
        List<Integer> scard = new ArrayList<>();
        for (int i = 0, j = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                scard.remove(j - 1);
                j--;
            } else if (operations[i].equals("D")) {
                scard.add(2 * scard.get(j - 1));
                j++;
            } else if (operations[i].equals("+")) {
                scard.add(scard.get(j - 1) + scard.get(j - 2));
                j++;
            } else {
                scard.add(Integer.parseInt(operations[i]));
                j++;
            }
        }
        for (int s : scard) {
            score += s;
        }
        return score;
    }
    
}

public class Problem95_baseballGame {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String[] ops = { "5", "2", "C", "D", "+" };
        int ans = obj.calPoints(ops);
        System.out.println(ans);
    }
}
