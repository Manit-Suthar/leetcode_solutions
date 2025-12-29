package p80;
class Solution {
    public int divisorSubstrings(int num, int k) {
        int div = 0 ;
        String strNum = String.valueOf(num);
        for(int i = 0 ; i<=strNum.length()-k;i++){
            int subNum = Integer.valueOf(strNum.substring(i,i+k));
            if(subNum == 0 ) continue;
            if(num%subNum==0) div++;
        }
        return div;
    }
}
public class Problem80_kBeautyOfNumber {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int num = 100010;
        int k = 2;
        int ans = obj.divisorSubstrings(num, k);
        System.out.println(ans);
    }
}
