package p99;
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max = 0 ; 
        int maxArea = 0 ;
        for (int i = 0 ; i < dimensions.length;i++) {
            double curMax = (dimensions[i][0]*dimensions[i][0]+dimensions[i][1]*dimensions[i][1]);
            if(curMax>max){
                max = curMax;
                maxArea = dimensions[i][0]*dimensions[i][1];
            }
            else if(curMax==max){
                maxArea = Math.max(dimensions[i][0]*dimensions[i][1],maxArea);
            }
        }
        return maxArea;
    }
}
public class Problem99_maxAreaOfLongestDiagonal {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[][] dimensions = {{2,8},{39,52},{33,56}};
        int ans = obj.areaOfMaxDiagonal(dimensions);
        System.out.println(ans);
    }
}
