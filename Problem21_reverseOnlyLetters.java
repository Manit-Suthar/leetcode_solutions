package p21;

class Solution {
    public String reverseOnlyLetters(String s) {
        char[] c = s.toCharArray();
        int st = 0,e = s.length()-1;
        char t;
        while(st < e){
            if((c[st]>64 && c[st]<91) || (c[st]>96 && c[st]<133)) {
                if((c[e]>64 && c[e]<91) || (c[e]>96 && c[e]<133)){
                    t = c[st];
                    c[st] = c[e];
                    c[e] = t;
                    st++;
                    e--;
                }
                else{
                    e--;
                }
            }
            else{
                st++;
            }
        }
        return new String(c);
    }
}
public class Problem21_reverseOnlyLetters {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String str = "a-bC-dEf-ghIj";
        String ans = obj.reverseOnlyLetters(str);
        for(int i=0;i<ans.length();i++){
            System.out.print(ans.charAt(i));
        }
    }
}
