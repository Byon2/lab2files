package lab1assignments;
//Implement a generic iterable circular linked list 
//which allows the user to insert and remove elements 
//to/from the front and back end of the queue. Be careful 
//when designing the API. You should print the content of 
//the list after each insertion/deletion of an element.
public class CIRC {
	
	Nod head;
	Nod last;
	int length;
	
	CIRC(){
		head=null;
		last = null;
		length = 0;
	}
	
	boolean isEmpty() {
		return length == 0;
	}
	
	int getLength() {
		return length;
	}
	
	void insertFromFront(int id, int i) {
		Nod n = new Nod();
		Nod c = head;
		Nod d = last;
		if(i<length && i >= 0) {
			
			
		}else if(length == 0 && i == 0) {
			head = n;
			head.setId(id);
			head.setNext(head);
		}else if(length == 1 && i == 0) {
			head = n;
			last = c;
			head.setNext(last);
			head.setId(id);
			last.setNext(head);
			
		}
	}

}

class Nod{
	
	Nod next;
	int id;
	
	Nod() {
		next = null;
		id = 0;
	}
	Nod(int i){
		next = null;
		id = i;
	}
	Nod(Nod n, int i){
		next = n;
		id = i;
	}
	void setNext(Nod n) {
		this.next = n;
	}
	void setId(int i) {
		this.id=i;
	}
	
	
}