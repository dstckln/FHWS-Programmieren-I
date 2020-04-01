package bonus02.Aufgabe4;
import java.util.Scanner;
public class Baum {
    Knoten root;
	
    public void insert(Knoten knoten) {
	if (root==null) {
	    root = knoten;
	} else {
	    einfuegen(root, knoten);
	}
    }
	
    protected void einfuegen(Knoten temp, Knoten knoten) {
	if (knoten.getWort().compareTo(temp.getWort()) < 0) {
	    if (temp.getLeft() == null) {
		temp.setLeft(knoten);
	    } else {
		einfuegen(temp.getLeft(), knoten);
	    }
	} else {
	    if (temp.getRight() == null) {
		temp.setRight(knoten);
	    } else {
		einfuegen(temp.getRight(), knoten);
	    }
	}
    }
	
    public void print() {
	print(root);
    }
	
    protected void print(Knoten temp) {
	if (temp.getLeft() != null) {
	    print(temp.getLeft());
	}
	System.out.println("Wort: " + temp.getWort());
	System.out.println("Bedeutung: " + temp.getBedeutung());
	
	if (temp.getRight() != null) {
	    print(temp.getRight());
	}
    }	
	
    public void search(String wort) {
	search(root,wort);
    }
	
    protected String search(Knoten root, String wort) { 
	if (root==null) {
	    return null;
	}
	
	if (root.getWort().compareTo(wort)==0) {
	    System.out.println("Bedeutung vom gesuchten Wort: " + root.getBedeutung());
	    return root.getBedeutung(); 
	}
	
	if (root.getWort().compareTo(wort) > 0) {
	    return search(root.getLeft(),wort); 
	}
	
	return search(root.getRight(),wort); 
    } 
	
    public static void main(String[] args) {
	Baum baum = new Baum();
	int menu;
	String wort, bedeutung;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Willkommen! Bitte w�hlen Sie eine Aktion aus!");
	System.out.printf("1. Einf�gen" + "\t" + "2. Suchen");
	System.out.println();
	menu = scanner.nextInt();
		
	if (menu==1) {
	    System.out.println("Bitte geben Sie ein Wort ein: ");
	    wort = scanner.nextLine();
	    System.out.println("Bitte geben Sie die Bedeutung ein: ");
	    bedeutung = scanner.nextLine();
	    Knoten knoten = new Knoten(wort,bedeutung);
	    baum.insert(knoten);
	    baum.print();
	} else if(menu==2) {
	    System.out.print("Bitte geben Sie das zu suchende Wort ein: ");
	    wort = scanner.nextLine();
	    baum.search(wort);
	} else {
	    System.out.println("Ung�ltige Eingabe!");
	}
	scanner.close();
    }
}
