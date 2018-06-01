import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CinemaTool {
    private String name;
    private String genre;
    private String author;
    private String actors;

    public void setText(String text) {
        this.text = text;
    }

    private String text;
    private String dateOfCreation;
    private String duration;
    private String dataFormat;


    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getActors() {
        return actors;
    }

    public String getText() {
        return text;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public String getDuration() {
        return duration;
    }

    public String getDataFormat() {
        return dataFormat;
    }

    public void setAuthor(String author) {
        if (checkAuthor(author)) {
            this.author = author;
        } else {
            this.author = "none";
        }
    }

    private boolean checkAuthor(String author) {
        Pattern pattern;
        Matcher matcher;
        String regex = "[a-zA-Z0-9 ]+";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(author);

        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public void setGenre(String genre) {
        if (checkGenre(genre)) {
            this.genre = genre;
        } else {
            this.genre = "none";
        }
    }

    private boolean checkGenre(String genre) {
        Pattern pattern;
        Matcher matcher;
        String regex = "[a-zA-Z ]+";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(genre);

        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }
    private boolean checkActors(String actors) {
        Pattern pattern;
        Matcher matcher;
        String regex = "[a-zA-Z0-9,.!?() ]+";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(genre);

        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }
    public void setActors(String actors) {
        if (checkActors(actors)) {
            this.actors = actors;
        } else {
            this.actors = "none";
        }
    }


    public void setName(String name) {
        if (checkName(name)) {
            this.name = name;
        } else {
            this.name = "none";
        }
    }

    private boolean checkName(String date) {
        Pattern pattern;
        Matcher matcher;
        String regex = "[a-zA-Z0-9,.!?() ]+";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(date);

        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public void setDateOfCreation(String date) {
        if (checkDate(date)) {
            this.dateOfCreation = date;
        } else {
            this.dateOfCreation = "none";
        }
    }

    private boolean checkDate(String date) {
        Pattern pattern;
        Matcher matcher;
        String regex = "([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(date);

        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public void setDuration(String duration) {
        if (checkDuration(duration)) {
            this.duration = duration;
        } else {
            this.duration = "00:00";
        }
    }

    private boolean checkDuration(String duration) {
        Pattern pattern;
        Matcher matcher;
        String regex = "(0[0-9]):([0-5][0-9])";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(duration);

        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public void setDataFormat(String data) {
        if (checkFormat(data)) {
            this.dataFormat = data;
        } else {
            this.dataFormat = "unknown";
        }
    }

    private boolean checkFormat(String data) {
        Pattern pattern;
        Matcher matcher;
        String regex = "(flac)|(w((av)|(ma)))|(ogg)|(m((idi)|(4a)|(p[1-4])))|(a((iff)|(pe)))";
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(data);

        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }




}