
import java.util.Comparator;


public class AuthorComparator implements Comparator<Composition> {

    @Override
    public int compare(Composition o1, Composition o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
    }

}