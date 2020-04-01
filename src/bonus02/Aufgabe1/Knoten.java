package bonus02.Aufgabe1;

public class Knoten {
    private int alter;
    private String nachname;
    public Knoten next;
    public Knoten prev;

    public Knoten(int alter, String nachname) {
        this.alter = alter;
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public String getNachname() {
        return nachname;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Knoten getNext() {
        return next;
    }

    public Knoten getPrev() {
        return prev;
    }

    public void setNext(Knoten next) {
        this.next = next;
    }

    public void setPrev(Knoten prev) {
        this.prev = prev;
    }
}
