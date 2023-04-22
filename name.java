import java.applet.*;
import java.util.*;
import java.awt.*;
public class name extends Applet
{
    public void paint(Graphics x)
    {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    x.drawString("Mr."+str,300,300);
    }
}
