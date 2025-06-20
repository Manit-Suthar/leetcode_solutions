package p43;

class Solution {
    public boolean judgeCircle(String moves) {
        int x =0,y=0;
        for(int i = 0;i<moves.length();i++){
            if(moves.charAt(i) == 'U'){
                y++;
            }
            if(moves.charAt(i) == 'D'){
                y--;
            }
            if(moves.charAt(i) == 'R'){
                x++;
            }
            if(moves.charAt(i) == 'L'){
                x--;
            }
        }
        if(x==0 && y==0){
            return true;
        }
        else{
            return false;
        }
    }
}
public class Problem43_robotReturnToOrigin {
    public static void main(String[] args) {
        String moves = "UDLR";
        Solution obj = new Solution();
        boolean ans = obj.judgeCircle(moves);
        System.out.println(ans);
    }
}
