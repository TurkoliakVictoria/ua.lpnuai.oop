package src.ua.lpnuai.oop.turkoliak-10;
public class CinemaTool {
   private String name;
   private String type;
   private String director;
   private String actors;
   private String info;
   private String date;
   private String duration;
   private String format;
   private String[][] rate;

    @Override
    public String toString() {
        return "CinemaTool{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", director='" + director + '\'' +
                ", actors=" + actors +
                ", info='" + info + '\'' +
                ", date='" + date + '\'' +
                ", duration=" + duration +
                ", format='" + format + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
       this.actors=actors;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String[][] getRate() {
        return rate;
    }

    public void setRate(String[][] rate) {
        this.rate = rate;
    }



}
