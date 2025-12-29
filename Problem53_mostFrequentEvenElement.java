package p53;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            if (num % 2 == 0) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }
        }

        if (freqMap.isEmpty()) {
            return -1;
        }

        int maxFreq = 0;
        int ans = Integer.MAX_VALUE;

        for (int key : freqMap.keySet()) {
            int freq = freqMap.get(key);

            if (freq > maxFreq || (freq == maxFreq && key < ans)) {
                maxFreq = freq;
                ans = key;
            }
        }

        return ans;
    }
}

public class Problem53_mostFrequentEvenElement {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = { 8, 8, 8, 8, 2, 4, 4, 6 };
        int ans = obj.mostFrequentEven(nums);
        System.out.println(ans);
    }
}
