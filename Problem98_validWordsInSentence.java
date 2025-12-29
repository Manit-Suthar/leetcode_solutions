package p98;
class Solution {
    public int countValidWords(String sentence) {
        int valid = 0;
        String[] trimmedArr = sentence.strip().split("\\s+");
        for (String string : trimmedArr) {
            if(string.charAt(0)>='a' && string.charAt(0)<='z' 
                && string.charAt(string.length()-1)>='a' && string.charAt(string.length()-1)<='z'){
                    int invalidChar = 0 ; 
                    for(char c : string.toCharArray()){
                        if(c>='0'&&c<='9') {
                            invalidChar++;
                            break;
                        }
                    }
                    if(invalidChar==0) valid++;
                }
        }
        return valid; 
    } 
}
public class Problem98_validWordsInSentence {
    public static void main(String[] args) {
        Solution obj = new Solution();  
        String sentence = "abc   b-r 6i -yu    m.k";
        int ans = obj.countValidWords(sentence);
        System.out.println(ans);
    }
}
