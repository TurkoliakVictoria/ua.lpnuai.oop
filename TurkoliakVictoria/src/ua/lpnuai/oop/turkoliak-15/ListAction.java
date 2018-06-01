import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class ListAction {


        private static final String PATH = "/Users/victoria/IdeaProjects/ua.lpnuai.oop/TurkoliakVictoria/src/ua/lpnuai/Lab15/src/data.txt";
        private static LinkedList<Composition> list = new LinkedList<>();

        public static void init() throws FileNotFoundException {
            Random random = new Random();

            Scanner in = new Scanner(new File(PATH));
            int t=5;
            while (t!=0) {
                Composition temp = new Composition();
                temp.setAuthor("dddd");
                temp.setName("dc");
                temp.setRating("Rolling Stone", random.nextInt(100));
                temp.setDuration("3:15");
                temp.setDataFormat("mp4");
                list.add(temp);
                t--;
            }
            in.close();
        }



        public static void show() {
            for (Composition elem : list) {
                System.out.println(elem);
            }
        }

        public static void save() throws FileNotFoundException, IOException {
            ListSaver.serialize(list);
        }

        public static void extract() throws FileNotFoundException, ClassNotFoundException, IOException {
            ListSaver.deserialize();
        }

        public static void sort() {
            Collections.sort(list, new RatingComparator());
            System.out.println("List was sorted!");
        }
    }
