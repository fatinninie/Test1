import java.io.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class readprofile
{
    public static void main (String []args)
    {
        String fatinninie = "fatinninie.bin";
        String line ="null";
        try
        {
            FileReader MyProfile = new FileReader ("fatinninie.bin");
            BufferedReader bufferedProfile = new BufferedReader (MyProfile);
            while((line = bufferedProfile.readLine())!= null)
            {
                System.out.println(line);
            }
            bufferedProfile.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("NOT FOUND'"+ fatinninie + "'");
        }
        catch(IOException ex)
        {
            System.out.println("ERROR'"+ fatinninie + "'");
        }
    }
}