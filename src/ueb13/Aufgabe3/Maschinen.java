package ueb13.Aufgabe3;

public class Maschinen {

	Motorrad head;
	Motorrad tail; 

	public void insertSorted(Motorrad motorrad) {
		Motorrad current; 
	    if (head == null) { //Liste ist leer
	        head = motorrad; 
	    } else if (head.getHubraum()>=motorrad.getHubraum()) { //Wenn insert am Anfang der Liste
	        motorrad.setNext(head); 
	        motorrad.getNext().setPrev(motorrad);
	        head = motorrad; 
	    } else { 
	        current = head;
	        while (current.getNext()!=null && current.getNext().getHubraum() < motorrad.getHubraum()) {
	            current = current.getNext(); 
	        }
	        
	        motorrad.setNext(current.getNext()); 

	        if (current.getNext() != null) { //Wenn insert am Ende der Liste
	        	motorrad.getNext().setPrev(motorrad);
	        }
	        current.setNext(motorrad);
	        motorrad.setPrev(current);
	    } 
	} 
	public Motorrad search(int hubraum) {
		Motorrad current = head;
		while (current!=null) {
			if (hubraum==current.getHubraum()) {
				return current;
			}
			current = current.getNext();
		}
		return null;
	}
	public void delete(String modell) {
		Motorrad current = head;
		while (current.getModell()!=modell) {
			current = current.getNext();
		}
		if (head==null) {
			head = current.getNext();
		}
		if (current.getNext()!=null) { //Wenn Tail = zu löschendes Objekt
			current.getNext().setPrev(current.getPrev());
		}
		if (current.getPrev()!=null) {
			current.getPrev().setNext(current.next);
		} else {
			head = current.getNext(); //Wenn head = zu löschendes Objekt
		}
		
	}
	public void printList() {
		Motorrad current = head;
		while (current!=null) {
			System.out.println(current.toString());
			current = current.getNext();
		}
	}
	public static void main(String[] args) {
		Maschinen maschinen = new Maschinen();
		Motorrad motorrad = new Motorrad("Yamaha",689,75,8000.0);
		maschinen.insertSorted(motorrad);
		motorrad = new Motorrad("BMW",1170,130,25000.0);
		maschinen.insertSorted(motorrad);
		motorrad = new Motorrad("KTM",1300,200,35000.0);
		maschinen.insertSorted(motorrad);
		motorrad = new Motorrad("Kawasaki",650,90,9500.0);
		maschinen.insertSorted(motorrad);
		motorrad = new Motorrad("Augusta",800,120,12000.0);
		maschinen.insertSorted(motorrad);
		//ausgabe alle
		maschinen.printList();
		//suche
		Motorrad search = maschinen.search(30000);
		if (search==null) {
			System.out.println("Nichts gefunden!");
		} else {
			System.out.println("Suche erfolgreich: " + search.toString());
		}
		//löschen
		maschinen.delete("Kawasaki");
		System.out.println();
		maschinen.printList();
	}
}
