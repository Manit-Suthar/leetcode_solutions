package p96;
class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < word.length() ; i++){
                if(word.charAt(i) == ch){
                    sb.append(word.substring(0, i+1));
                    sb.reverse();
                    sb.append(word.substring(i+1, word.length()));
                    return sb.toString();
                }
            }
        return word;
    }
}
public class Problem96_ReversePrefixOfAWord {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String word ="abcdefghd";
        char ch = 'd';
        String ans = obj.reversePrefix(word, ch);
        System.out.println(ans); 
    }
}
