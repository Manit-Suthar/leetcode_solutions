package p77;

import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] ans = new int[2];
        int diff,sumA=0,sumB=0;
        for(int i=0 ; i<aliceSizes.length;i++){sumA += aliceSizes[i];}
        for(int i=0 ; i<bobSizes.length;i++){sumB += bobSizes[i];}
        diff = (sumA-sumB)/2 ;
        Set<Integer> setB = new HashSet<>();
        for (int x : bobSizes) {
            setB.add(x);
        }
        for(int i = 0 ; i < aliceSizes.length ; i++){
            if(setB.contains(aliceSizes[i]-diff)){
                ans[0] = aliceSizes[i];
                ans[1] = aliceSizes[i]-diff;
                break;
            }
        }
        return ans;
    }
}
public class Problem77_fairCandyswap {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] a = {2};
        int[] b = {1,3};
        int[] ans = obj.fairCandySwap(a, b);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
