import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
public class cal extends Applet implements ActionListener
 {
    public static final String[] TEXT={"/","7","8","9","*","4","5","6","-","1","2","3","+","0",".","="};
    TextField t1;
    StringBuffer value = new StringBuffer();
    public void init()
     {
        Frame title=(Frame) this.getParent().getParent();
        title.setTitle("Yash' Calculator");
        setLayout(null);
        t1=new TextField("",4);
        t1.setBounds(100,200,400,100);
        add(t1);
        int x=100;
        int y=310;
        int k=1;
        Button b[]=new Button[16];
        for (int i=0;i<TEXT.length;i++) 
        {
            b[i]=new Button(""+TEXT[i]);
            b[i].setBounds(x*k,y,100,100);
            if(k%4==0) 
            {
                x=100;
                y+=100;
                k=0;
            }
            k++;
            add(b[i]);
            b[i].addActionListener(this);
        }
    }
    public void actionPerformed(ActionEvent e) 
    {
        String s=e.getActionCommand();
        if (s.equalsIgnoreCase("="))
         {
            t1.setText(calculate(value));
            value.setLength(0);
        } 
        else
         {
            value.append(s);
            t1.setText(value.toString());
        }
    }
    public String calculate(StringBuffer oop)
     {
        ScriptEngineManager mgr=new ScriptEngineManager();
        ScriptEngine engine=mgr.getEngineByName("JavaScript");
        Object result=null;
        try
         {
            result=engine.eval(oop.toString());
            System.out.println(result);
        } 
        catch (ScriptException ex) 
        {
            result="not valid";
        }
        return result.toString();
    }
}