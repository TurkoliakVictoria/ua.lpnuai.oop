
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class Main {

    private Main() {

    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        final String serialPath = "list.dat";
        final String xmlPath = "Archieve.xml";

        LinkedList<AudioLibrary> list = new LinkedList<>();
        Scanner t=new Scanner(System.in);
        System.out.println("1-Autofill,2-Own");
        int k=t.nextInt();
        if(k==1) {
            AudioLibrary tmp = new AudioLibrary();
        tmp.autoinit(tmp);
        list.add(tmp);}
       else if(k==2) {
        for (int i = 0; i < 3; i++) {
            AudioLibrary temp = new AudioLibrary();
            temp.init(temp);
            list.add(temp);
        }}

        Object[] array = list.toArray();

        for (AudioLibrary item : list) {
            System.out.println(item);
        }

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(serialPath));
        out.writeObject(list);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(serialPath));
        LinkedList<AudioLibrary> data = (LinkedList<AudioLibrary>) in.readObject();
        in.close();

        XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(xmlPath)));
        encoder.writeObject(list.toArray());
        encoder.close();
        System.out.println("Object was saved.");

        XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(xmlPath)));
        Object[] extracted = (Object[]) decoder.readObject();
        decoder.close();
        System.out.println("Object was extracted.");
        for (Object item : extracted) {
            System.out.println(item);
        }
        list.remove(0);
        for (AudioLibrary item : list) {
            System.out.println(item);
        }

    }
}