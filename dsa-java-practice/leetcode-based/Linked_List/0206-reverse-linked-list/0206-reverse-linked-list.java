/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {

        List<Integer> res = new ArrayList<>();



        if (head == null){
            return null;
        }

        while(head != null){
            res.add(head.val);
            head = head.next;
        }

        Collections.reverse(res);

        ListNode ans = new ListNode(res.get(0));

        for (int i = 1; i < res.size(); i++){

            ListNode new_node = new ListNode(res.get(i)); 
        
            if (ans == null) { 
                ans = new_node; 
            } else { 
            ListNode last = ans; 
            while (last.next != null) { 
                last = last.next; 
            } 
              last.next = new_node; 
            } 
        }

        return ans;
        
    }
}