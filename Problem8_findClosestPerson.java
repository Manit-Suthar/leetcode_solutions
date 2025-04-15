// package p8;

class Solution {
    public int findClosest(int x, int y, int z) {
        int a = (z-x), b = (z-y);
        if(a<0)   a=-a;
        if(b<0)   b=-b;
        if(a>b){
            return 2;
        }
        else if (a<b){
            return 1;
        }
        else{
            return 0;
        }
    } 
}

public class Problem8_findClosestPerson {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int nearestPerson = obj.findClosest(7,5,3);
        System.out.println(nearestPerson);
    }
    
}
