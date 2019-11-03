package middle;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
public class AddTwoNumbers {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int c = 0;
		ListNode head = null, p = null, r =null;
		while(l1 != null && l2 != null) {
			int value = (l1.val + l2.val + c) % 10;
			c = (l1.val + l2.val + c) / 10;
			r = new ListNode(value);
			if(head==null) {
				head = r;
			} else {
				p.next = r;
			}		
			p = r;
			r.next = null;
			
			l1 = l1.next;
			l2 = l2.next;
		}
		while(l1 != null) {
			int value = (l1.val + c) % 10;
			c = (l1.val + c) / 10;
			r = new ListNode(value);
			if(head==null) {
				head = r;
			} else {
				p.next = r;
			}		
			p = r;
			r.next = null;	
			l1 = l1.next;
		}
		while(l2 != null) {
			int value = (l2.val + c) % 10;
			c = (l2.val + c) / 10;
			r = new ListNode(value);
			if(head==null) {
				head = r;
			} else {
				p.next = r;
			}		
			p = r;
			r.next = null;	
			l2 = l2.next;
		}
		if(c!=0) {
			r = new ListNode(c);
			r.next = null;
			p.next = r;
		}
        return head;
    }
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(9);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(9);
		
		ListNode l3 = addTwoNumbers(l1,l2);
		while(l3 != null) {
			System.out.println(l3.val);
			l3 = l3.next;
		}
	}
}
