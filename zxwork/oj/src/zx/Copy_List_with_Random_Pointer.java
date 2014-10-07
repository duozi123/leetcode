package zx;

public class Copy_List_with_Random_Pointer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomListNode h1=new RandomListNode(1);
		
		RandomListNode h2=new RandomListNode(2);
		RandomListNode h3=new RandomListNode(3);
		h1.next=h2;
		h2.next=h3;
		h3.random=h1;
//		h1.random=h2;
//		h2.random=h2;
		RandomListNode hq=copyRandomList(h1);
		while(hq!=null){
			System.out.print(hq.label+" ");
			if(hq.random!=null)
				System.out.println(hq.random.label);
			hq=hq.next;
		}
		
	}
public static RandomListNode copyRandomList(RandomListNode head) {
        if(head==null){
        	return null;
        }
        RandomListNode now=head;
        while(now!=null){
        	RandomListNode newNode=new RandomListNode(now.label);
        	newNode.random=null;
        	newNode.next=now.next;
        	now.next=newNode;
        	now=newNode.next;
        	
        }
        now=head;
        while(now!=null){
        	if(now.random!=null){
        	now.next.random=now.random.next;}
        	now=now.next.next;
        }
        now=head;
        RandomListNode newhead=now.next;
        RandomListNode newtail=now.next;
        head.next=newhead.next;
        now=newhead.next;
        while(now!=null){
        	newtail.next=now.next;
        	newtail=newtail.next;
        	now.next=now.next.next;
        	now=now.next;
        }
        return newhead;
        
    }
}
class RandomListNode {
	      int label;
	      RandomListNode next, random;
	      RandomListNode(int x) { this.label = x; }
	  };