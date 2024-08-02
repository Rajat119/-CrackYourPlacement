class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        int c=0;
        while(l1!=null || l2!=null || c!=0){
            int d1=(l1!=null)?l1.val:0;
            int d2=(l2!=null)?l2.val:0;
            int sum=d1+d2+c;
            int digit=sum%10;
            c=sum/10;

            ListNode newD=new ListNode(digit);
            tail.next=newD;
            tail=tail.next;

            l1=(l1!=null)?l1.next:null;
            l2=(l2!=null)?l2.next:null;
        }
        return dummy.next;
    }
}