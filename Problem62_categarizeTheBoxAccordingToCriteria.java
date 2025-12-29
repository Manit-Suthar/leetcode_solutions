package p62;
class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        double volume = (double)length*width*height;
        if(volume<Math.pow(10, 9) && length<10000 && width<10000 && height<10000 && mass<100){
            return "Neither";
        }
        else if((volume>=Math.pow(10, 9) ||length>=10000 ||width>=10000 || height>=10000 )&& mass>=100){
            return "Both";
        }
        else if(volume>=Math.pow(10, 9) ||length>=10000 ||width>=10000 || height>=10000 ){
            return "Bulky";
        }
        else{
            return "Heavy";
        }
    }
}
public class Problem62_categarizeTheBoxAccordingToCriteria {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int l = 2909;
        int b = 3968;
        int h = 3272;
        int w = 727;
        String ans = obj.categorizeBox(l, b, h, w);
        System.out.println(ans);
    }
}
