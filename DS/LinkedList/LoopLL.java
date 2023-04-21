package DS.LinkedList;

public class LoopLL {

	Node head;
	class Node {
		
		Node next;
		int data;
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public void print(Node node) {
		while(node!=null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	public boolean detectLoop() {
		Node slow = head;
		Node fast = head;
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow.data == fast.data) {
				return true;
			}
		}
		return false;
	}
	
	public void push(int n) {
		Node newN = new Node(n);
		newN.next = head;
		head = newN;
	}
	
	public static void main(String[] args) {
		LoopLL ll = new LoopLL();
		ll.push(2);
		ll.push(10);
		ll.push(12);
		ll.push(23);

		
        /*Create loop for testing */
        ll.head.next.next.next.next = ll.head;
        System.out.println(ll.detectLoop());


	}


	

}

