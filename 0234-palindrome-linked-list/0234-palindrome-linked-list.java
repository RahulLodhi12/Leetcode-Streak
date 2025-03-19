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
    public boolean reverse(String s){
        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode p=head;

        String s="";
        while(p!=null){
            char ch = (char)(p.val + '0');
            s+=ch;
            p=p.next;
        }

        // System.out.println(s);

        return reverse(s);
    }
}