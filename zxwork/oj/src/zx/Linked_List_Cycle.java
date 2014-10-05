package zx;

public class Linked_List_Cycle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head1=new Node(1);
//		Node head2=new Node(1);
//		Node head3=new Node(1);
//		Node head4=new Node(1);
//		head1.next=head1;
//		head2.next=head3;
//		head3.next=head4;
//		head4.next=head3;
		System.out.println(hasCycle(head1));
	}
	public static boolean hasCycle(Node head) {
        if(head==null)
        return false;
        if(head.next==head)
        return true;
        Node now=head.next;
        while(now!=null){
            if(now.val!=-65535){
            	now.val=-65535;
            	now=now.next;}
            else return true;
        }
        return false;
        }

}class Node {
	     int val;
	      Node next;
	      Node(int x) {
	          val = x;
	         next = null;
	      }
	  }
