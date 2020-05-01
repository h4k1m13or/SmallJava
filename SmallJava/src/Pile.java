
import java.util.LinkedList;

public class Pile {
    LinkedList<String> pile;

    public Pile() {
        this.pile = new LinkedList<String>();
    }

    public Pile(LinkedList<String> pile) {
        this.pile = pile;
    }

    void empiler(String element) {
        //if(!pile.contains(element))
        pile.add(element);
    }

    String depiler() {

        return pile.removeLast();

    }

    boolean pileVide() {
        return pile.isEmpty();
    }


    void displayPile() {
        pile.stream().map(e -> "| " + e + " |").forEach(System.out::println);

    }

    void ViderPile() {
        pile.clear();

    }
}


