import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.HashMap;


public class Composition implements Serializable {

    private static final long serialVersionUID = -1953977639393957131L;
    protected String name;
    protected String genre;
    protected String author;
    protected String actors;
    protected String text;
    protected String dateOfCreation;
    protected String duration;
    protected String dataFormat;
    protected Map<String, Integer> rating = new HashMap<String, Integer>();

    public Composition(String name, String genre, String author,String actors, String text, String date, String duration,
                       String dataFormat) {
        this.name = name;
        this.genre = genre;
        this.author = author;
        this.actors=actors;
        this.text = text;
        this.dateOfCreation = date;
        this.duration = duration;
        this.dataFormat = dataFormat;
    }
    public Composition() {
        this.name = "none";
        this.genre = "none";
        this.author = "none";
        this.text = "none";
        this.dateOfCreation = "none";
        this.duration = "none";
        this.dataFormat = "none";
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getGenre() {
        return this.genre;
    }
    public void setGenre(final String genre) {
        this.genre = genre;
    }


    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(final String author) {
        this.author = author;
    }
    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors=actors;
    }

    public String getText() {
        return this.text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public String getDateOfCreation() {
        return this.dateOfCreation;
    }


    public void setDateOfCreation(final String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }


    public String getDuration() {
        return this.duration;
    }


    public void setDuration(final String duration) {
        this.duration = duration;
    }
    public String getDataFormat() {
        return this.dataFormat;
    }

    public void setDataFormat(final String dataFormat) {
        this.dataFormat = dataFormat;
    }
    public Map<String, Integer> getRating() {
        return this.rating;
    }

    public void setRating(final String key, final int value) {
        this.rating.put(key, value);
    }



    @Override
    public String toString() {
        return "AudioLibrary{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                ", actors='" + actors + '\'' +
                ", text='" + text + '\'' +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", duration='" + duration + '\'' +
                ", dataFormat='" + dataFormat + '\'' +
                ", rating=" + rating +
                '}';
    }

    public Composition init(Composition object) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String temp = null;

        System.out.print("Name ");
        temp = input.readLine();
        object.setName(temp);

        System.out.print("Genre: ");
        temp = input.readLine();
        object.setGenre(temp);

        System.out.print("Author: ");
        temp = input.readLine();
        object.setAuthor(temp);


        System.out.print("Actors ");
        temp = input.readLine();
        object.setActors(temp);

        System.out.print("Text ");
        temp = input.readLine();
        object.setText(temp);


        System.out.print("Date ");
        temp = input.readLine();
        object.setDateOfCreation(temp);

        System.out.print("Duration ");
        temp = input.readLine();
        object.setDuration(temp);

        System.out.print("Format ");
        temp = input.readLine();
        object.setDataFormat(temp);


        System.out.print(" Rating  ");
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        object.setRating("IMBD", value);

        return object;
    }

    public Composition autoinit(Composition object) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String temp = null;

        System.out.print("Name ");
        object.setName("Call");

        System.out.print("Genre: ");

        object.setGenre("Fantasy");

        System.out.print("Author: ");
        object.setAuthor("Besson");


        System.out.print("Actors ");
        object.setActors("unknown");

        System.out.print("Text ");
        object.setText("=---");


        System.out.print("Date ");
        object.setDateOfCreation("2018");

        System.out.print("Duration ");
        object.setDuration("45");

        System.out.print("Format ");

        object.setDataFormat("mp4");


        System.out.print(" Rating  ");

        object.setRating("IMBD",4);

        return object;
    }
}