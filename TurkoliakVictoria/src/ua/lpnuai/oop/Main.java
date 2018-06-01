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
        Scanner t=new Scanner(System.in);
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

                case "1":

                    System.out.print("Enter value :");

                    /*
                     * Defines the number
                     * of books to store.
                     *  */
                    cinemas = new CinemaTool
                            [Integer.parseInt(
                            reader.readLine())];
                    break;

                case "2":

                    String init;
                    System.out.println("choose 1-Auto;2-Own");
                    int k = t.nextInt();
                    if (k == 2) {
                        for (int i = 0; i < cinemas.length; i++) {

                            cinemas[i] = new CinemaTool();

                            System.out.print("Name : ");

                            init = reader.readLine();
                            cinemas[i].setName(init);

                            System.out.print("Genre : ");

                            init = reader.readLine();
                            cinemas[i].setGenre(init);

                            System.out.print(
                                    "Director : ");

                            init = reader.readLine();
                            cinemas[i].setAuthor(init);

                            System.out.print("Actors : ");

                            init = reader.readLine();
                            cinemas[i].setActors(init);

                            System.out.print("Info : ");

                            init = reader.readLine();
                            cinemas[i].setText(init);
                            System.out.print("Date : ");

                            init = reader.readLine();
                            cinemas[i].setDateOfCreation(init);
                            System.out.print("Time : ");

                            init = reader.readLine();
                            cinemas[i].setDuration(init);

                            System.out.print("Format : ");

                            init = reader.readLine();
                            cinemas[i].setDataFormat(init);
                            File myFile = new File("/Users/victoria/IdeaProjects/ua.lpnuai.oop/TurkoliakVictoria/src/ua/lpnuai/Lab12/src/data.txt");
                            try {
                                PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
                                writer.println("Name  " + cinemas[i].getName());
                                writer.println("Type   " + cinemas[i].getGenre());
                                writer.println("Director  " + cinemas[i].getAuthor());
                                writer.println("Actors  " + cinemas[i].getActors());
                                writer.println("Info  " + cinemas[i].getText());
                                writer.println("Date  " + cinemas[i].getDateOfCreation());
                                writer.println("Time  " + cinemas[i].getDuration());
                                writer.println("Format  " + cinemas[i].getDataFormat());
                                writer.println("--------------------------------");
                                writer.flush();
                                writer.close();
                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }
                        }
                    } else if (k == 1) {
                        for (int i = 0; i < cinemas.length; i++) {

                            cinemas[i] = new CinemaTool();

                            System.out.print("Name : ");

                            cinemas[i].setName("none");

                            System.out.print("Genre : ");

                            cinemas[i].setGenre("none");

                            System.out.print("Director : ");

                            cinemas[i].setAuthor("none");

                            System.out.print("Actors : ");

                            cinemas[i].setActors("---");

                            System.out.print("Info : ");

                            cinemas[i].setText("---");
                            System.out.print("Date : ");

                            cinemas[i].setDateOfCreation("---");
                            System.out.print("Time : ");

                            cinemas[i].setDuration("---");

                            System.out.print("Format : ");
                            cinemas[i].setDataFormat("---");
                            File myFile = new File("/Users/victoria/IdeaProjects/ua.lpnuai.oop/TurkoliakVictoria/src/ua/lpnuai/Lab12/src/data.txt");
                            try {
                                PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(myFile, true)));
                                writer.println("Name  " + cinemas[i].getName());
                                writer.println("Type   " + cinemas[i].getGenre());
                                writer.println("Director  " + cinemas[i].getAuthor());
                                writer.println("Actors  " + cinemas[i].getActors());
                                writer.println("Info  " + cinemas[i].getText());
                                writer.println("Date  " + cinemas[i].getDateOfCreation());
                                writer.println("Time  " + cinemas[i].getDuration());
                                writer.println("Format  " + cinemas[i].getDataFormat());
                                writer.println("--------------------------------");
                                writer.flush();
                                writer.close();
                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }
                        }
                    }


                    System.out.println();
                    break;



                case "3" :{

                    File file = new File("/Users/victoria/IdeaProjects/ua.lpnuai.oop/TurkoliakVictoria/src/ua/lpnuai/Lab12/src/data.txt");

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