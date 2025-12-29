package p97;
// class Solution {
//     public int mostWordsFound(String[] sentences) {
//         int max = 0;
//         for(int i = 0 ; i<sentences.length ;i++){
//             int curMax = 0;
//             for(int j = 0 ; j<sentences[i].length();j++){
//                 if(sentences[i].charAt(j)==' ') curMax++;
//             }
//             max = max > curMax ? max : curMax;
//         }
//         return max+1;
//     }
// }
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s : sentences) 
            max = Math.max(max, s.split(" ").length);
        return max;
    }
}

public class Problem97_maxWordsInSentence {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String[] sen = {"hii there","hello there boy"};
        int ans = obj.mostWordsFound(sen);
        System.out.println(ans);
    }
}
