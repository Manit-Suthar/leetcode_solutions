package p45;
class Solution {
    public int maxNumberOfBalloons(String text) {
        int cntb = 0;
        int cnta = 0;
        int cntl = 0;
        int cnto = 0;
        int cntn = 0;
        for(char c : text.toCharArray()){
            if(c == 'b'){
                cntb++;
            }
            else if(c == 'a'){
                cnta++;
            }
            else if(c == 'l'){
                cntl++;
            }
            else if(c == 'o'){
                cnto++;
            }
            else if(c == 'n'){
                cntn++;
            }
        }
        if(cntl%2 == 0) cntl /= 2;
        else    cntl = (cntl-1)/2;
        if(cnto%2 == 0) cnto /= 2;
        else    cnto = (cnto-1)/2;
        return Math.min(cnta, Math.min(cntb , Math.min(cntl ,Math.min(cnto,cntn))));
    }
}

public class Problem45_maxNumOfBalloons {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String text = "xcbalonlon";
        int ans = obj.maxNumberOfBalloons(text);
        System.out.println(ans);
    }
}
