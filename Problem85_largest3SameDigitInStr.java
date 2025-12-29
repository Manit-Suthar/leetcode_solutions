package p85;

class Solution {
    public String largestGoodInteger(String num) {
        int largestNum = -1 ; 
        for(int i = 1 ; i < num.length()-1;i++){
            if(num.charAt(i-1)==num.charAt(i) && num.charAt(i)==num.charAt(i+1)){
                int currentNum = Integer.parseInt(num.substring(i-1, i+2));
                if(currentNum>=largestNum) {
                    largestNum = currentNum ;
                }
            }
        } 
        if(largestNum == 0) return "000";
        else if(largestNum ==-1) return "";
        return String.valueOf(largestNum);

    }
}
public class Problem85_largest3SameDigitInStr{
    public static void main(String[] args) {
        Solution obj = new Solution();
        String str = "1233322666";
        String ans=obj.largestGoodInteger(str);
        System.out.println(ans);
    }
}
