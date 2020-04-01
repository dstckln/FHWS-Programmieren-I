package bonus02.Aufgabe4;

public class Knoten {
	private String wort;
	private String bedeutung;
	private Knoten left;
	private Knoten right;
	
	public Knoten(String wort, String bedeutung) {
		this.wort = wort;
		this.bedeutung = bedeutung;
	}
	
	public String getWort() {
		return this.wort;
	}
	public String getBedeutung() {
		return this.bedeutung;
	}
	
	public Knoten getLeft() {
		return left;
	}
	public Knoten getRight() {
		return right;
	}
	
	public void setLeft(Knoten left) {
		this.left = left;
	}
	public void setRight(Knoten right) {
		this.right = right;
	}
}
