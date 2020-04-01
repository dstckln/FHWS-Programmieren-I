package ueb13.Aufgabe1;
import Lists.SinglyLinkedList;

public class LottozahlenListe {
	
	public static boolean bereitsGezogen(int[] bereitsGezogen, int lottozahl) {
		for (int i: bereitsGezogen) {
			if (i==lottozahl) {
				lottozahl = (int) (Math.random()*49+1);
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {

		int[] bereitsGezogen = new int[6];
		int lottozahl;
		SinglyLinkedList liste = new SinglyLinkedList();

		for (int i = 1;i<=49;i++) {
			liste.add(i);
		}
		for (int i = 0;i<6;i++) {
			lottozahl = (int) (Math.random()*49+1);
			if (bereitsGezogen(bereitsGezogen,lottozahl)) {
				lottozahl = (int) (Math.random()*49+1);
				bereitsGezogen(bereitsGezogen,lottozahl); //rekursiver check
			}
			bereitsGezogen[i] = lottozahl;
			liste.deleteThis(lottozahl);
			System.out.println("Gezogene Zahl: " + lottozahl);
		}
		liste.printList();
	}
}
