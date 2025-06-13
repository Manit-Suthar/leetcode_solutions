package p42;
class Solution {
    public String reformat(String s) {
        StringBuilder num = new StringBuilder() ;
        StringBuilder letter = new StringBuilder();
        StringBuilder formatedStr = new StringBuilder();
        for(char c : s.toCharArray()){
            if((int) c >47 && (int) c<58){
                num.append(c);
            }
            else {
                letter.append(c);
            }
        }
        if(num.length() == letter.length() || Math.abs(num.length()-letter.length()) == 1){
            if(num.length()>=letter.length()){
                for(int i =0,j =0;i<num.length();i++,j++){
                    if(j == letter.length()){
                        formatedStr.append(num.charAt(i));
                    }
                    else{
                        formatedStr.append(num.charAt(i));
                        formatedStr.append(letter.charAt(j));
                    }
                }
                return formatedStr.toString();
            }
            else{
                for(int i =0,j =0;i<letter.length();i++,j++){
                    if(j == num.length()){
                        formatedStr.append(letter.charAt(j));
                    }
                    else{
                        formatedStr.append(letter.charAt(j));
                        formatedStr.append(num.charAt(i));
                    }
                }

                return formatedStr.toString();
            }
        }
        else{
            return "";
        }
    }
}
public class Problem42_reformateTheString {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "1111aaaaa";
        String ans = obj.reformat(s);
        System.out.println(ans);
    }
}
