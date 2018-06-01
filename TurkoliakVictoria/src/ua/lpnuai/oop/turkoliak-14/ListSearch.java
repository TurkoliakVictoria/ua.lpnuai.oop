

import java.util.LinkedList;


public class ListSearch {

    private ListSearch() {
        // empty
    }

    public static boolean searchByAuthor(LinkedList<Composition> list, String author) {

        for (Composition elem : list) {
            if (elem.getAuthor().equals(author)) {
                System.out.println(elem);
                return true;
            }
        }
        System.out.println("Not founded!");
        return false;
    }

    public static boolean searchByName(LinkedList<Composition> list, String name) {

        for (Composition elem : list) {
            if (elem.getName().equals(name)) {
                System.out.println(elem);
                return true;
            }
        }
        System.out.println("Not founded!");
        return false;
    }

    public static boolean searchByGenre(LinkedList<Composition> list, String genre) {

        for (Composition elem : list) {
            if (elem.getGenre().equals(genre)) {
                System.out.println(elem);
                return true;
            }
        }
        System.out.println("Not founded!");
        return false;
    }
}