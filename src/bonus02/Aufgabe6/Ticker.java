package bonus02.Aufgabe6;

public class Ticker {

    private char[] nachricht_ref;
    public int groesse;

    //constructor
    public Ticker(int groesse) {
        if (groesse <= 0) {
            this.groesse = 200;
        } else {
            this.groesse = groesse;
        }
        this.nachricht_ref = new char[groesse];
        for (int i = 0; i < this.nachricht_ref.length; i++) {
            this.nachricht_ref[i] = ' ';
        }
    }

    //getter
    public int getGroesse() {
        return groesse;
    }

    public char[] getNachricht() {
        char[] nachricht_get = new char[this.nachricht_ref.length];
        for (int i = 0; i < nachricht_get.length; i++) {
            nachricht_get[i] = this.nachricht_ref[i];
        }
        return nachricht_get;
    }

    //setter
    public void setNachricht(char[] nachricht_ref) {
        if (this.nachricht_ref.length > nachricht_ref.length) {
            for (int i = 0; i < this.nachricht_ref.length; i++) {
                this.nachricht_ref[i] = '+';
            }
            for (int i = 0; i < nachricht_ref.length; i++) {
                this.nachricht_ref[i] = nachricht_ref[i];
            }
        } else {
            for (int i = 0; i < this.nachricht_ref.length; i++) {
                this.nachricht_ref[i] = nachricht_ref[i];
            }
        }
    }

    public void resetNachricht(char zeichen) {
        for (int i = 0; i < this.nachricht_ref.length; i++) {
            nachricht_ref[i] = zeichen;
        }
    }

    public void resetNachricht() {
        for (int i = 0; i < this.nachricht_ref.length; i++) {
            nachricht_ref[i] = '+';
        }
    }

    //functions
    public void rotateNachricht(int distance) {
        char temp = ' ';
        if (distance <= 0 || distance >= this.nachricht_ref.length) {
            return;
        } else {
            for (int i = 1; i <= distance; i++) {
                temp = this.nachricht_ref[0];
                for (int k = 1; k < this.nachricht_ref.length; k++) {
                    this.nachricht_ref[k - 1] = this.nachricht_ref[k];
                }
                this.nachricht_ref[this.nachricht_ref.length - 1] = temp;
            }
        }

        for (int i = 0; i < this.nachricht_ref.length; i++) {
            System.out.print(this.nachricht_ref[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String test = "Wettervorhersage: Schnee in Wuerzburg++++++++";
        Ticker[] tagesticker_ref = new Ticker[24];

        //Rotate
        for (int i = 0; i < tagesticker_ref.length; i++) {
            tagesticker_ref[0] = new Ticker(100);
            tagesticker_ref[0].setNachricht(test.toCharArray());
            tagesticker_ref[0].rotateNachricht(6);
        }

        for (int i = 0; i < tagesticker_ref.length; i++) {
            tagesticker_ref[i] = new Ticker(100);
            tagesticker_ref[i].setNachricht(test.toCharArray());
            System.out.println(tagesticker_ref[i].getNachricht());
        }
    }

}
