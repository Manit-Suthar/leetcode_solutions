package p44;
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int countL = 0,countR = 0;
        String fullMoves = "";
        for(int i = 0;i<moves.length();i++){
            if(moves.charAt(i) == 'L'){
                countL++;
            }
            if(moves.charAt(i) == 'R'){
                countR++;
            }
        }
        if(countL>=countR){
             fullMoves = moves.replace('_', 'L');
        }
        else{
             fullMoves = moves.replace('_', 'R');
        }
        countL = 0;
        countR = 0;
        for(int i = 0;i<fullMoves.length();i++){
            if(fullMoves.charAt(i) == 'L'){
                countL--;
            }
            else{
                countR++;
            }
        }
    return Math.abs(countL+countR); 
    }
}
public class Problem44_furthestPointFromOrigin {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String moves = "LLL_R__R_RR";
        int ans = obj.furthestDistanceFromOrigin(moves);
        System.out.println(ans);
    }
}
