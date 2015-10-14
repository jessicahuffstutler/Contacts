import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by jessicahuffstutler on 10/14/15.
 */
public class ContactSaver {
    public static void main(String[] args) throws IOException {
        File f = new File("contact.txt");

        Contact bob = new Contact();
        bob.name = "Bob";
        bob.address = "510 Mill St";
        bob.email = "bob@theironyard.com";
        bob.age = 35;

        JsonSerializer serializer = new JsonSerializer();
        String contentToSave = serializer.serialize(bob);//method called serialize and it will return a String

        FileWriter fw = new FileWriter(f);
        fw.write(contentToSave);
        fw.close();

        FileReader fr = new FileReader(f);
        int fileSize = (int) f.length(); //how big is the file?, we are casting it to and int by using (int) in the line since it wants to be a "long" which is double the size of an int
        char[] contents = new char[fileSize];
        fr.read(contents);
        String fileContents = new String(contents);

        JsonParser parser = new JsonParser();
        Contact newBob = parser.parse(fileContents, Contact.class); //class is a field in the contact class that is a little identifier that allows you to tell the parse method that you want to return a Contact object.
        System.out.println(newBob.name);
    }
}
