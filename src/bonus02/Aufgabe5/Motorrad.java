package bonus02.Aufgabe5;

public class Motorrad {

    private String modell;
    private int hubraum, ps;
    private double preis;
    public Motorrad next;
    public Motorrad prev;

    public Motorrad(String modell, int hubraum, int ps, double preis) {
        this.modell = modell;
        this.hubraum = hubraum;
        this.ps = ps;
        this.preis = preis;
    }

    //getter
    public String getModell() {
        return modell;
    }

    public int getHubraum() {
        return hubraum;
    }

    public int getPS() {
        return ps;
    }

    public double getPreis() {
        return preis;
    }

    //setter
    public void setModell(String modell) {
        this.modell = modell;
    }

    public void setHubraum(int hubraum) {
        this.hubraum = hubraum;
    }

    public void setPS(int ps) {
        this.ps = ps;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    //list
    public Motorrad getNext() {
        return next;
    }

    public Motorrad getPrev() {
        return prev;
    }

    public void setNext(Motorrad next) {
        this.next = next;
    }

    public void setPrev(Motorrad prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "Modell: " + this.modell + " Hubraum: " + this.hubraum +
                " PS: " + this.hubraum + " Preis: " + this.preis;
    }
}
