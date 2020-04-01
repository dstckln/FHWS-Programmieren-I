package ueb13.Aufgabe2;

public class Liste {

	private Knoten head;
	private Knoten tail;
	//insert
	public void insertFirst(Knoten knoten) {
		knoten.setNext(head);
		knoten.setPrev(null);
		if (head!=null) {
			head.setPrev(knoten);
		}
		head = knoten;
		if (tail==null) {
			tail = knoten;
		}
	}
	public void insertLast(Knoten knoten) {
		knoten.setNext(null);
		knoten.setPrev(tail);
		if (tail!=null) {
			tail.setNext(knoten);
		}
		tail = knoten;
		if (head==null) {
			head = knoten;
		}
	}
	public void insertSortedByAge(Knoten knoten) {
		Knoten temp = head.getNext();
		Knoten oldtemp = head;
		while (temp!=null) {
			if (knoten.getAlter()<temp.getAlter()) { //Wenn Alter kleiner temp-Alter
				knoten.setNext(temp);
				oldtemp.setNext(knoten);
				//prev set
				temp.setPrev(knoten);
				knoten.setPrev(oldtemp);
				break;
			} else { //Weiter in Liste
				oldtemp = temp;
				temp = temp.getNext();
			}
		}
	}
	//search
	public Knoten search(String nachname) {
		Knoten temp = head;
		while (temp!=null) {
			if (nachname.compareTo(temp.getNachname())==0) {
				return temp;
			}
			temp = temp.getNext();
		}
		return null;
	}
	//c
	public void printList() {
		Knoten temp = head;
		while (temp!=null) {
			System.out.println(temp.getAlter() + " " + temp.getNachname());
			temp = temp.getNext();
		}
		temp = tail;
		while (temp!=null) {
			System.out.println(temp.getAlter() + " " + temp.getNachname());
			temp = temp.getPrev();
		}
	}
	public void printTail() {
		System.out.println(tail.getAlter() + " " + tail.getNachname());
	}
	public void printHead() {
		System.out.println(head.getAlter() + " " + head.getNachname());
	}
	//main
	public static void main(String[] args) {
		Liste personenliste = new Liste();
		Knoten person = new Knoten(20,"Mustermann");
		personenliste.insertLast(person);
		person = new Knoten(30,"Mueller");
		personenliste.insertLast(person);
		person = new Knoten(40,"Jansen");
		personenliste.insertLast(person);
		person = new Knoten(25,"TEST");
		personenliste.insertSortedByAge(person);
		personenliste.printList();
		
		Knoten search = personenliste.search("Peter");
		
		if (search==null) {
			System.out.println("Nichts gefunden!");
		} else {
			System.out.println(search.getAlter() + " " + search.getNachname());
		}
	}
}
