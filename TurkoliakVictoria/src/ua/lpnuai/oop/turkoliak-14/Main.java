

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Random random = new Random();
        LinkedList <Composition> list = new LinkedList <>();
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        boolean autoFlag = false;
        while (k != 0) {

                    Composition temp = new Composition();
                    temp.setAuthor("ABC");
                    temp.setName("DSC");
                    temp.setRating("Rolling Stone", random.nextInt(100));
                    temp.setDuration("000000");
                    temp.setDataFormat("mp4");
                    list.add(temp);
                    k--;

            }

        System.out.println(list.getFirst().author);
            Collections.sort(list, new RatingComparator());
            ListSaver.serialize(list);
            LinkedList <Composition> extracted = ListSaver.deserialize();
            for (Composition elem : extracted) {
                System.out.println(elem);
            }
        }
    }