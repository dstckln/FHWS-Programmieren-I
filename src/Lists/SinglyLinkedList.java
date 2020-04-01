package Lists;

public class SinglyLinkedList {

    private Node start;

    /**
     * Fügt den übergebenen Parameter ans Ende der Liste an.
     * Je nach übergebenen Parametertyp überlädt die Methode.
     *
     * @param data Dieser Parameter wird an die Liste angefügt
     * @return void
     */
    public void add(int data) {
        Node element = new Node(data);
        if (start == null) {
            start = element;
        } else {
            Node temp = start;
            while (temp.next != null) { //Bis zum letzten Element durchlaufen
                temp = temp.next;
            }
            temp.next = element; //Das letzte Element = null, also hier einfügen
        }
    }

    public void add(String data) {
        Node element = new Node(data);
        if (start == null) {
            start = element;
        } else {
            Node temp = start;
            while (temp.next != null) { //Bis zum letzten Element durchlaufen
                temp = temp.next;
            }
            temp.next = element; //Das letzte Element = null, also hier einfügen
        }
    }

    /**
     * Prüft ob der Übergebene Parameter teil der Liste ist.
     * Je nach übergebenen Parametertyp überlädt die Methode.
     *
     * @param data Zu suchendes Element
     * @return boolean (true, false)
     */
    public boolean isElementOf(int data) {
        Node temp = start;
        while (temp != null) {
            if (temp.getNum() == data) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public boolean isElementOf(String data) {
        Node temp = start;
        while (temp != null) {
            if (temp.getStr().equals(data)) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public int getListPosition(int data) {
        int count = 0;
        Node temp = start;
        while (temp != null) {
            if (temp.getNum() == data) {
                return count;
            }
            temp = temp.getNext();
            count++;
        }
        return count;
    }

    public int getListPosition(String data) {
        int count = 0;
        Node temp = start;
        while (temp != null) {
            if (temp.getStr().equals(data)) {
                return count;
            }
            temp = temp.getNext();
            count++;
        }
        return count;
    }

    public void deleteThis(int data) {
        Node temp = start;
        if (getListPosition(data) == 0) { //Wenn Head gelöscht werden soll
            start = temp.next;
            return;
        }
        if (isElementOf(data)) {
            Node previous = null;
            while (temp != null && temp.getNum() != data) {
                previous = temp;
                temp = temp.getNext();
            }
            previous.setNext(temp.getNext());
            return;
        } else {
            return;
        }
    }

    /*
        public void deleteThis(String data) {
            Node temp = start;
            if (temp==null) { //Liste ist leer
                return;
            } else if (start.getStr()==data) { //Wenn Head gelöscht werden soll
                start = temp.next;
            }

            Node previous = null;
            while (temp!=null) {
                if (temp.getStr()!=data) {
                    start = temp;
                    previous.setNext(temp.getNext());
                }
                temp = temp.getNext();
            }

            return;

        }*/
    public void deleteThis(String data) {
        start = delete(start, data);
    }

    private Node delete(Node node, String data) {
        if (node == null) {
            return null;
        }
        Node n = delete(node.getNext(), data);

        if (node.getStr().equals(data)) {
            node = n;
        } else {
            node.setNext(n);
        }
        return node;
    }

    public void printList() {
        Node temp = start;
        while (temp != null) {
            System.out.print(temp.getNum() + ", ");
            temp = temp.getNext();
        }
    }

    public void printListStr() {
        Node temp = start;
        while (temp != null) {
            System.out.println(temp.getStr());
            temp = temp.getNext();
        }
    }
}
