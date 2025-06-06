class Solution {
    public String toLowerCase(String s) {
        char[] characters = s.toCharArray();
        char[] up = new char[s.length()];
        for(int i = 0; i<s.length();i++){
            if((int) characters[i]>=65 && (int)characters[i]<=90){
                up[i] = (char)((int)characters[i]+32);
            }
            else{
                up[i] = characters[i];
            }
        }
        return new String(up);
    }
}
public class Problem14_toLowerCase{
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "CRLO";
        String answer = obj.toLowerCase(s);
        System.out.println(answer);
    }
}