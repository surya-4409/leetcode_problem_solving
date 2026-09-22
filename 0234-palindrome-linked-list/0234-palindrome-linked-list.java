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
    public boolean isPalindrome(ListNode head) {

        //find the midlle
        //reverse 2ns half
        //compare 1st and 2nd half
   ListNode middle;
    if(head==null || head.next==null)
    {
        return true;
    }
    ListNode slow=head;
    ListNode fast=head;
    while(fast!=null &&  fast.next!=null)
    {
      slow=slow.next;
      fast=fast.next.next;
    }
    middle= slow;
        //1. finding the middle
     
        //2.reversing the 2nd half
        ListNode prev=null;
        ListNode curr=middle;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode right=prev;
        ListNode left=head;


        //3.checking 1st half and 2nd half

        while(right!=null)
        {
            if(left.val!=right.val)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
        
    }
}