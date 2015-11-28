import java.io.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class profile
{
    public static void main (String []args)
    {
        String fatinninie = "fatinninie.bin";
        try
        {
            FileWriter MyProfile = new FileWriter ("fatinninie.bin");
            BufferedWriter bufferedProfile = new BufferedWriter (MyProfile);
            bufferedProfile.write("Name: Fatin Nurhanini binti Rusli");
            bufferedProfile.newLine();
            bufferedProfile.write("Matrix No: 2014695322");
            bufferedProfile.newLine();
            bufferedProfile.write("Gender: Female");
            bufferedProfile.newLine();
            bufferedProfile.write("Age: 25 years old");
            bufferedProfile.newLine();
            bufferedProfile.write("E-mail: fatinninie890@gmail.com");
            bufferedProfile.newLine();
            bufferedProfile.write("Mobile Phone: 014-5281879");
            bufferedProfile.newLine();
            bufferedProfile.close();
        }
        catch(IOException ex)
        {
            System.out.println("ERROR'"+ fatinninie + "'");
        }
    }
}
        
