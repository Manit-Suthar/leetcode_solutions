
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber>0){
            int r = (columnNumber-1) % 26 ;
            sb.append((char)(r+'A'));
            columnNumber = (columnNumber-1)/26;
        }
        return sb.reverse().toString();
    }
}

public class Problem16_sheetColumnTitle {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int columnNumber = 18279;
        String title = obj.convertToTitle(columnNumber);
        System.out.println(title);
    }
    
}
