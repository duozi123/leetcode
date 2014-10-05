package zx;

public class Reorder_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode2 head = new ListNode2(1);
		ListNode2 head2 = new ListNode2(2);
		ListNode2 head3 = new ListNode2(3);
		ListNode2 head4 = new ListNode2(4);
		ListNode2 head5 = new ListNode2(5);
		head.next = head2;
		head2.next = head3;
		head3.next = head4;
		head4.next = head5;
		reorderList(head);

		while (head.next != null) {
			System.out.println(head.val);
			head = head.next;
		}
		System.out.println(head.val);
	}

	public static void reorderList(ListNode2 head) {
		if (head == null || head.next == null || head.next.next == null)
			return;
		ListNode2 tail = new ListNode2(0);
		ListNode2 now = head;
//
//		while (tail.next.next != null) {
//			tail = tail.next;
//		}
//		while (now != tail&&tail.next!=null) {
//			tail.next.next = now.next;
//			now.next = tail.next;
//			tail.next = null;
//			now = now.next.next;
//			tail=now;
//			while (tail.next!=null&&tail.next.next != null) {
//				tail = tail.next;
//			}
//
//		}
//	}
		
	int node=1;
	while(now.next!=null){
		now=now.next;
		node++;
	}
	now=head;
	int count=1;
	while(count<node-(node-1)/2){
		
		now=now.next;
		count++;
	}
	
	tail.next=now.next;
	now.next=null;
	ListNode2 temp=tail.next;
	ListNode2 move;
	while(temp.next!=null){
		move=temp.next;
		temp.next=move.next;
		move.next=tail.next;
		tail.next=move;
		
	}
	
	now=head;
	while(tail.next!=null){
		move=tail.next;
		tail.next=move.next;
		move.next=now.next;
		now.next=move;
		now=now.next.next;
	}
	
		
		
		
	}
}

class ListNode2 {
	int val;
	ListNode2 next;

	ListNode2(int x) {
		val = x;
		next = null;
	}
}
