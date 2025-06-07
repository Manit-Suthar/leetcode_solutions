package p30;

class Solution {
    public int getLucky(String s, int k) {
        String intStr = "";
        char[] c = s.toCharArray();
        int sum = 0;
        int m = 0;
        for(int i = 0; i < s.length(); i++){
            intStr = intStr + String.valueOf(((int)c[i])-96); 
        }
        c = intStr.toCharArray();
        while(m<k){
            sum = 0;
            for(int i = 0;i<c.length;i++){
                sum += (int)c[i]-48;
            }
            c = String.valueOf(sum).toCharArray();
            m++;
        }
        return sum;
    }
}

public class Problem30_sumOfDigitsOfStringAfterConvert {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "zbax";
        int k = 2;
        int ans = obj.getLucky(s, k);
        System.out.println(ans);
    }
}
