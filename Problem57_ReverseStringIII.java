package p57;

class Solution {
    public String reverseWord(String word){
        StringBuilder sb = new StringBuilder(word);
        sb = sb.reverse();
        return String.valueOf(sb);
    }
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        for(int i=0;i<words.length;i++){
            words[i] = reverseWord(words[i]);
        }
        return String.join(" ", words);
    }
}
public class Problem57_ReverseStringIII {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "hello coders tata";
        String ans = obj.reverseWords(s);
        System.out.println(ans);

    }
}
