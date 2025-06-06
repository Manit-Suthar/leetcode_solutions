import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> fList = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
                System.out.println(words[i].indexOf(x));
                fList.add(i);
            }

        }
        return fList;
    }
}

public class Problem17_FindWordContaingCharacter {
    public static void main(String[] args) {
        Solution obj = new Solution();
        String[] arr = {"abc","cbs","aaa"};
        char character = 'c';
        List<Integer> Answer = new ArrayList<>();
        Answer = obj.findWordsContaining(arr,character);
        System.out.println(Answer);
    }
    
}