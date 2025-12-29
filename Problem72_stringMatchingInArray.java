package p72;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> str = new ArrayList<>();
        for(int i = 0 ; i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i==j) continue;
                else{
                    if(words[j].contains(words[i])){
                        if(str.contains(words[i])==false){str.add(words[i]);}
                    }
                }
            }
        }
        return str;
    }
}
public class Problem72_stringMatchingInArray {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String[] words = {"ac","a","bc","acp"};
        List<String> ans = obj.stringMatching(words);
        System.out.println(ans);
    }
}
