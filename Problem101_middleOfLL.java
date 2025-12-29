package p101;
class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        while (temp != null) {
            if(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }else{
                break;
            }
            temp = temp.next;
        }
        return temp;
    }
}
public class Problem101_middleOfLL {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {1, 2, 3, 4, 5,6,7};
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        ListNode middleHead = obj.middleNode(head);
        System.out.println(middleHead.data);
    }
}
