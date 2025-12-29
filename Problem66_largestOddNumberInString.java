package p66;
class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if ((c - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}

class Problem66_largestOddNumberInString{
    public static void main(String[] args) {
        Solution obj = new Solution();
        String str = "7542351161";
        String ans = obj.largestOddNumber(str);
        System.out.println(ans); 
    }
 }