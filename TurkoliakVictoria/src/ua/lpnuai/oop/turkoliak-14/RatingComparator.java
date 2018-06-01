
import java.util.Comparator;


public class RatingComparator implements Comparator<Composition> {

    @Override
    public int compare(Composition o1, Composition o2) {
        int firstRating = (int) o1.getRating().values().toArray()[0];
        int secondRating = (int) o2.getRating().values().toArray()[0];
        if (firstRating < secondRating) {
            return 1;
        } else {
            return -1;
        }
    }

}