
/**
 * Write a description of class convert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class convert
{
   public static void convert(String h)
{
    int y =0;
    String f =" ";

    for(int i =0; i<h.length(); i++)
    {
         y = (int)h.charAt(i);
        f = Integer.toBinaryString(y);
    }

    System.out.println(y);
    System.out.println(f);
}
}
