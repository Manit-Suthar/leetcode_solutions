class Solution {
    public boolean checkRecord(String s) {
        int absentCount = 0;
        int lateCount = 0;
        char[] attendance = s.toCharArray();
        for(int i = 0 ; i < s.length();i++){
            
            if(attendance[i] == 'P'){
                continue;
            }
            else if(attendance[i] == 'A'){
                absentCount++;
                if(absentCount>1){
                    break;
                }
                continue;
            }
            else if(attendance[i] == 'L' && i<(s.length()-2)){
                lateCount++;
                if(attendance[i+1] == 'L'){
                    lateCount++;
                    if(attendance[i+2] == 'L'){
                        lateCount++;
                        break;
                    }
                    else{
                        lateCount = 0;
                        continue;
                    }
                }
                else{
                    lateCount = 0;
                    continue;
                }
            }    
        }   
        if(absentCount>=2 || lateCount>=3){
            return false;
        }
        return true;
    }
}
public class Problem15_studentAttendanceReport1{
    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "PPALLA";
        boolean result = obj.checkRecord(s);
        System.out.println(result);
        
    }
}