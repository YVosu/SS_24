package AuD.UB_03;

public class Link<T> {

    public T daten;

    //oeffentliche Instanzvariable, die auf den naechsten Knoten verweist.
    public Link<T> naechster;

    public Link(T daten, Link<T> naechster) {
        assert (daten != null);

        // Initialisierung der Instanzvariablen
        this.daten = daten;
        this.naechster = naechster;
    }

    public String toString() {
        return daten.toString();
    }

    public static void main(String[] args) {
        Link<String> mittleresElement = new Link<>("Test", null);
        mittleresElement.naechster = new Link<>("Letzter", null);
        Link<String> anfang = new Link<>("Erster", mittleresElement);

    }
}

