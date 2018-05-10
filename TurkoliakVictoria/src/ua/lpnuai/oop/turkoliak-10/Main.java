package ua.lpnuai.oop.turkoliak-10;
import java.io.*;
import java.util.Scanner;
/**
 * Entry class.
 * Contains entry point of a program.
 */
public class Main{

    /**
     * Main method - entry point of a program.
     * Contains user menu for library control.
     *
     * @param args - command line parameters
     * @throws IOException - if there is any unresolved input/output
     */
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        /* Holds objects that define the entity of books. */
        CinemaTool[] cinemas = null;

        /* User menu output. */
        System.out.println("---MENU---");
        System.out.println("1. Define quantity of array elements");
        System.out.println("2. Assign array elements");
        System.out.println("3. Save array for a long term");
        System.out.println("4. Exit");

        /* Holds key for menu point. */
        String key = new String();

        /* Processes user's choices. */
        while (!key.equals("4")) {

            key = reader.readLine();

            switch (key) {

                case "1" :

                    System.out.print("Enter value :");

                    /*
                     * Defines the number
                     * of books to store.
                     *  */
                    cinemas = new CinemaTool
                            [Integer.parseInt(
                            reader.readLine())];
                    break;

                case "2" :

                    String init = new String();

                    /*
                     * The following for-loop construction
                     * initializes new objects.
                     */
                    for (int i = 0; i < cinemas.length; i++) {

                        cinemas[i] = new CinemaTool();

                        System.out.print("Name : ");

                        init = reader.readLine();
                        cinemas[i].setName(init);

                        System.out.print("Genre : ");

                        init = reader.readLine();
                        cinemas[i].setType(init);

                        System.out.print(
                                "Director : ");

                        init = reader.readLine();
                        cinemas[i].setDirector(init);

                        System.out.print("Actors : ");

                        init = reader.readLine();
                        cinemas[i].setActors(init);

                        System.out.print("Info : ");

                        init = reader.readLine();
                        cinemas[i].setInfo(init);
                        System.out.print("Date : ");

                        init = reader.readLine();
                        cinemas[i].setDate(init);
                        System.out.print("Time : ");

                        init = reader.readLine();
                        cinemas[i].setDuration(init);

                        System.out.print("Format : ");

                        init = reader.readLine();
                        cinemas[i].setFormat(init);
                        File myFile = new File("/Users/victoria/IdeaProjects/ua.lpnuai.oop/TurkoliakVictoria/src/ua/lpnuai/Lab10/src/Try.txt");
                        try {
                            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
                            writer.println("Name  " + cinemas[i].getName());
                            writer.println("Type   " + cinemas[i].getType());
                            writer.println("Director  " + cinemas[i].getDirector());
                            writer.println("Actors  " + cinemas[i].getActors());
                            writer.println("Info  " + cinemas[i].getInfo());
                            writer.println("Date  " + cinemas[i].getDate());
                            writer.println("Time  " + cinemas[i].getDuration());
                            writer.println("Format  " + cinemas[i].getFormat());
                            writer.println("--------------------------------");
                            writer.flush();
                            writer.close();
                        }catch (IOException ex){
                            ex.printStackTrace();
                        }

                    }

                    System.out.println();
                    break;



                case "3" :{

                    File file = new File("/Users/victoria/IdeaProjects/ua.lpnuai.oop/TurkoliakVictoria/src/ua/lpnuai/Lab10/src/Try.txt");

                    Scanner scanner = new Scanner(file);
                    while (scanner.hasNextLine()) {
                        System.out.println(scanner.nextLine());
                    }
                    scanner.close();
            }
                case "4" :

                    System.out.println("Exiting...");

                    /* Exits the user menu. */
                    break;

                default : break;

            }
        }

    }}
