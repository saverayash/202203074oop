import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class colour extends Applet implements ItemListener
 {
    Color colorList[]={Color.RED, Color.GREEN, Color.YELLOW}; 
    String colorNames[]={"Red", "Green", "Yellow"}; 
    Choice colorChoice; 
    public void init()
     {
        colorChoice=new Choice();
        for(int i=0;i<colorList.length;i++)
            colorChoice.add(colorNames[i]);
        add(colorChoice);
        colorChoice.addItemListener(this);
    }
    public void itemStateChanged(ItemEvent e)
     {
        if(e.getSource()==colorChoice)
            setBackground(colorList[colorChoice.getSelectedIndex()]);
    }
}
