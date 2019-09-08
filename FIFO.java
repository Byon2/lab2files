package lab1assignments;

public class FIFO {

	Node head;
	Node last;
	int length;
	
	FIFO(){
		head = null; 
		last = null;
		length = 0;
	}
	
	boolean isEmpty() {
		return head == null;
	}
	
	int getLength() {
		return length;
	}
	
	void clear() {
		head = null;
		last = null;
		length = 0;
		System.out.println(this.toString());
	}
	void PUSH(int d) {
		Node n = new Node();
		length++;
		if(this.isEmpty()) {
			n.setid(d);
			head = n;
			last = n;
			
		}else {
			n.setafter(head);
			n.setid(d);
			head.setbefore(n);
			head = n;
		}
		System.out.println(this.toString());
	}
	int POP() {
		Node n = new Node();
		if(this.isEmpty()) {
			System.out.println(this.toString());
			return n.id;
		}else {
			length--;
			if(head.after != null) {
				head.after.setbefore(null);
				n = head;
				head = head.after;
			}else {
				n = head;
				head = null;
				last = null;
			}
			n.setafter(null);
			System.out.println(this.toString());
			return n.id;
		}
	}
	public String toString(){
		if(this.isEmpty()) {
			return "The list is empty";
		}else{
			String s = "[" + head.id + "]";
			
			
			if(head.after != null) {
				Node next = head.after;
			
				while(next!=null && next.after!=null && next.notEqual(last)) {
					s = s + ", [" + next.id + "]";
				
					next = next.after;
				
				}
			
				s = s + ", [" + last.id + "]";
			}
			return s;
		}
		
	}

}

class Node{
	Node before;
	Node after;
	int id;
	
	Node() {
		before = null;
		after = null;
		id = 0;
	}
	Node(int i) {
		before = null;
		after = null;
		id = i;
	}
	
	Node( Node a, int i){
		before = null;
		after = a;
		id=i;
		
	}
	
	void setbefore(Node b){
		this.before = b;
	}
	
	void setafter(Node a){
		this.after = a;
	}
	
	void setid(int i){
		this.id = i;
	}
	
	boolean notEqual(Node n) {
		
		return this.id!=n.id;
	}
	
	
	
}
