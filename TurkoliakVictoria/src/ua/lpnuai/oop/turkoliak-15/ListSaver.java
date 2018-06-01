

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

public class ListSaver {

    private static String SERIALPATH = "list.data";
    private static String XMLPATH = "archive.xml";

    private ListSaver() {
        // empty
    }

    public static void serialize(LinkedList<Composition> list) throws FileNotFoundException, IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(SERIALPATH));
        out.writeObject(list);
        out.close();
        System.out.println("List was saved!");
    }

    @SuppressWarnings("unchecked")
    public static LinkedList<Composition> deserialize()
            throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(SERIALPATH));
        LinkedList<Composition> data = (LinkedList<Composition>) in.readObject();
        in.close();
        System.out.println("List was extracted!");
        return data;
    }

    public static void xmlSaving(LinkedList<Composition> list) throws FileNotFoundException {
        XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(XMLPATH)));
        encoder.writeObject(list);
        encoder.close();
        System.out.println("List was saved!");
    }

    @SuppressWarnings("unchecked")
    public static LinkedList<Composition> xmlExtracting() throws FileNotFoundException {
        XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(XMLPATH)));
        LinkedList<Composition> data = (LinkedList<Composition>) decoder.readObject();
        decoder.close();
        System.out.println("List was extracted!");
        return data;
    }
}