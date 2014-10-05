package zx;

public class Insertion_Sort_List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode aListNode = new ListNode(2);
		ListNode bListNode = new ListNode(1);
		ListNode cListNode = new ListNode(7);
		ListNode dListNode = new ListNode(8);
		ListNode hListNode = new ListNode(6);
		hListNode.next = aListNode;
		aListNode.next = bListNode;
		bListNode.next = cListNode;
		cListNode.next = dListNode;
		ListNode listNode = insertionSortList(hListNode);
		while (listNode.next != null) {
			System.out.println(listNode.val);
			listNode = listNode.next;
		}
		System.out.println(listNode.val);
	}

	public static ListNode insertionSortList(ListNode head) {
		if(head==null)
			return null;
		ListNode startListNode = new ListNode(0);
		ListNode nowListNode = startListNode;
		ListNode tempListNode = null;
		
		while (head != null) {
			tempListNode = new ListNode(head.val);
			
				head=head.next;
			nowListNode = startListNode;
			while (nowListNode.next != null
					&& tempListNode.val > nowListNode.next.val) {
				nowListNode = nowListNode.next;
			}
			if (nowListNode.next == null) {
				nowListNode.next = tempListNode;
			} else if (nowListNode.next != null) {
				tempListNode.next = nowListNode.next;
				nowListNode.next = tempListNode;
			}
		}

		return startListNode.next;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}
