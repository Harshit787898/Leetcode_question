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
    public ListNode removeZeroSumSublists(ListNode head) {
        Map<Integer,ListNode> map=new HashMap<>();
        ListNode dummy=new ListNode(0);
        map.put(0,dummy);
        dummy.next=head;

       int sum=0;
       ListNode ptr=head;
       while(ptr!=null)
       {
           sum+=ptr.val;
           if(map.containsKey(sum)){
               int psum=sum;
               ListNode temp=map.get(sum).next;
               while(temp!=ptr)
           {
               psum+=temp.val;
               map.remove(psum);
               temp=temp.next;
           }
           map.get(sum).next=ptr.next;
           }
           else{
               map.put(sum,ptr);
           }
           ptr=ptr.next;
       }
       return dummy.next;
    }
}