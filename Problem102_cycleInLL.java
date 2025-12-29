package p102;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      val = x;
      next = null;
    }
}
 
class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
public class Problem102_cycleInLL {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] arr = {1,2};
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        // Creating a cycle for testing
        temp.next = head.next; // Cycle here
        
        boolean result = obj.hasCycle(head);
        System.out.println("Linked List has cycle: " + result);
    }
}
