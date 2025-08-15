package javaPractise;

public class LL {
	Node head;
	
	static class Node{
		int data;
		Node next;
		public  Node (int data) {
			this.data = data;
			this.next = null;
		}
	}
	public void addfirst(int data) {
		Node newnode = new Node(data);
		
		if(head==null) {
			head = newnode;
		}else {
			newnode.next = head;
			head = newnode;
		}
	}
	public void printlist() {
		Node current = head;
		while(current!=null) {
			System.out.print(current.data+"--->");
			current = current.next;
		}
	}
	public static void main(String[] args) {
		LL obj = new LL();
		obj.addfirst(3);
		obj.addfirst(2);
		obj.addfirst(1);
		obj.printlist();
	}

}
