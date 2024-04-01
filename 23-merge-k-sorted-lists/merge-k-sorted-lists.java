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
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode ans=new ListNode(-1);
        ListNode temp=ans;
        while(temp1!=null&&temp2!=null){
            if(temp1.val<temp2.val){
                temp.next=temp1;
                temp=temp.next;
                temp1=temp1.next;
            }
            else{
                temp.next=temp2;
                temp=temp.next;
                temp2=temp2.next;
            }
        }
        while(temp1!=null){
            temp.next=temp1;
            temp=temp.next;
            temp1=temp1.next;
        }
        while(temp2!=null){
            temp.next=temp2;
            temp=temp.next;
            temp2=temp2.next;
        }
        return ans.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        ListNode res=lists[0];
        for(int i=1;i<lists.length;i++){
            if(lists[i]!=null)
            res=merge(res,lists[i]);
        }
        return res;
    }
}