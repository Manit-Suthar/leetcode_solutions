package p54;
class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int i = 0;
        int j = str.length-1;
        while(i<j){
            if(vowels.contains(str[i]+"") && vowels.contains(str[j]+"")){
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }
            else if(vowels.contains(str[i]+"")){
                j--;
            }
            else{
                i++;
            }
        }

        return String.valueOf(str);
    }
}
public class Problem54_reverseVowelOfAString {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "leetcode";
        String ans = obj.reverseVowels(s);
        System.out.println(ans);
    }
}
