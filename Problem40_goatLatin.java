package p40;
import java.util.List;
import java.util.ArrayList;


class Solution {
    public String toGoatLatin(String sentence) {
        List<String> l = new ArrayList<>();
        String[] words = sentence.split(" ");
        for(int i = 0;i<words.length;i++){
            if(words[i].toLowerCase().charAt(0) == 'a' ||words[i].toLowerCase().charAt(0) == 'e' ||words[i].toLowerCase().charAt(0) == 'i' ||words[i].toLowerCase().charAt(0) == 'o' ||words[i].toLowerCase().charAt(0) == 'u'){
                words[i]+="ma";
                for(int a = 0;a<=i;a++){
                    words[i]+="a";
                }
                l.add(words[i]);
            }
            else{
                char temp = words[i].charAt(0);
                String subString = words[i].substring(1);
                String w = subString+temp;
                w +="ma";
                for(int a = 0;a<=i;a++){
                    w+="a";
                }
                l.add(w);
            }
        }
        String goatLatin = String.join(" ", l);
        
        return goatLatin;
    }
}
public class Problem40_goatLatin {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String str = "mbc abc cat";
        String ans = obj.toGoatLatin(str);
        System.out.println(ans);
        
    }
}
