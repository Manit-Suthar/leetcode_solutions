package p83;
class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        for(int i = 0 ; i<str.length;i++){
            while (true) {
                int idx = str[i].charAt(str[i].length() - 1) - '0' - 1;
                if (idx == i) break; 
                String temp = str[i];
                str[i] = str[idx];
                str[idx] = temp;
            }           
        }
        for(int i = 0 ; i< str.length;i++){
            str[i]=(str[i].substring(0, str[i].length()-1));
        }
        return String.join(" ",str);
    }
}
public class Problem83_SortingTheSentence {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "KTFkUVVrmYMSo2 wXlQraUqblfhCfDLK3 IfTuftYVualQ6 NhpQ5 HlRjClVtQrTFcwbx4 fi1";
        String ans = obj.sortSentence(s);
        System.out.println(ans);
    }
}
