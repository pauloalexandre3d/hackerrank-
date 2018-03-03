package challenges;

public class Node {

	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public Node() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// 1->2->3->NULL

		Node head = new Node();
		head.data = 1;
		Node node1 = new Node(2);
		head.next = node1;
		Node node2 = new Node(3);
		node1.next = node2;

		Print(head);

		head = Insert(head, 4);
		Print(head);

		head = Insert(head, 5);
		Print(head);
	}

	static void Print(Node head) {
		if (head == null)
			return;
		while (true) {
			System.out.println(head.data);
			head = head.next;
			if (head == null)
				return;
		}
	}

	static Node Insert(Node head, int data) {
		if (head.next == null) {
			head.next = new Node();
			head.next.data = data;
			return head;
		}

		Node tmp = head.next;
		while (true) {
			if (tmp.next == null) {
				Node abobora = new Node();
				abobora.data = data;
				tmp.next = abobora;
				return head;
			} else {
				tmp = tmp.next;
			}
		}
	}

}
