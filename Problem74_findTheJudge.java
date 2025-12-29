package p74;
class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1) return 1;
        int[] trackArr1 = new int[n]; 
        int[] trackArr2 = new int[n]; 
        for(int i=0;i<trust.length;i++){
            trackArr1[(trust[i][0])-1]++;
            trackArr2[(trust[i][1])-1]++;
        }
        for(int j = 0 ;j<trackArr1.length;j++){
            if(trackArr1[j]==0 && trackArr2[j]==n-1) return j+1;
        }
        return -1;
    }
}
public class Problem74_findTheJudge {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int n = 3;
        int[][] people = {{1,2},{2,3},{1,3}};
        int ans = obj.findJudge(n, people);
        System.out.println(ans);

    }
}
