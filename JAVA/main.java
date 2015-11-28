
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class main
{
    //binary fies
    //text files
    //204 --> text file
    public static void main(String[] args)
    {
        String fatinninie = "fatinninie.bin";
        try
        {
            FileOutputStream ProFile = new FileOutputStream(fatinninie);
            ObjectOutputStream file = new ObjectOutputStream(ProFile);
            file.writeChars ("Name: Fatin Nurhanini binti Rusli");
            file.writeChars ("Matrix No: 2014695322");
            file.writeChars ("Gender: Female");
            file.writeChars ("Age: 25 years old");
            file.writeChars ("E-mail: fatinninie890@gmail.com");
            file.writeChars ("Mobile Phone: 014-5281879");
            //file.writeBytes(String str)
            //file.writeDouble(val)
            file.close();
        }
        catch (FileNotFoundException e)
        {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("Done Writing");
        
        try
        {
            FileInputStream ProFiles = new FileInputStream(fatinninie);
            ObjectInputStream files = new ObjectInputStream(ProFiles);
            char x = files.readChar();
            System.out.println(x);
            files.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
