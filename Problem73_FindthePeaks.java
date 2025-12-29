package p73;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> peaks = new ArrayList<>();
        for(int j=1;j<mountain.length-1;j++){
            if(mountain[j]>mountain[j-1]&&mountain[j]>mountain[j+1]){
                peaks.add(j);
            }
        }
        return peaks;
    }
}
public class Problem73_FindthePeaks {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] mountain = {10,5,3,2,1,7,3};
        List<Integer> ans = obj.findPeaks(mountain);
        System.out.println(ans);
    }
}
