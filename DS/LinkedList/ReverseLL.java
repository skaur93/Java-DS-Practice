package DS.LinkedList;

import javapractice.pushZero;

public class ReverseLL {

	static Node head;
	static class Node {
		Node next;
		int data;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void print(Node node) {
		while(node!=null) {
			System.out.print(node.data + " ");
			node = node.next;
		}

	}

	public void push(int n) {
		Node newN = new Node(n);
		newN.next = head;
		head = newN;

	}

	public Node reverse(Node node) {
		Node current = node;
		Node next = null;
		Node prev = null;

		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		node = prev;
		return node;
	}
	public static void main(String[] args) {
		ReverseLL list = new ReverseLL();

		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(29);

		list.print(head);
		head = list.reverse(head);
		System.out.println("reverse");

		list.print(head);


	}

}
