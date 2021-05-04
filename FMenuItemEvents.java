import java.awt.*;
import java.awt.event.*;

class MenuFrame extends Frame 
implements ActionListener,ItemListener,WindowListener
 {
TextArea ta;
MenuFrame(String title)
 {
super(title);
ta=new TextArea(10,20);
add(ta);
addWindowListener(this);
MenuBar mb=new MenuBar();
setMenuBar(mb);

Menu a=new Menu("A");
mb.add(a);
MenuItem a1=new MenuItem("A1");
a1.addActionListener(this);
a.add(a1);
MenuItem a2=new MenuItem("A2");
a2.addActionListener(this);
a.add(a2);
MenuItem a3=new MenuItem("A3");
a3.addActionListener(this);
a.add(a3);
}
public void actionPerformed(ActionEvent ae)
 {
ta.append("ActionEvent:"+ae.getActionCommand()+"/n");
 }
public void itemStateChanged(ItemEvent ie)
 {
CheckboxMenuItem cbmi=(CheckboxMenuItem)ie.getSource();
ta.append("ItemEvent:"+cbmi.getLabel()+"/n");
 }
public void windowActivated(WindowEvent we)
 {
 }
public void windowClosed(WindowEvent we)
 {
 }
public void windowClosing(WindowEvent we)
 {
dispose();
 }
public void windowDeactivated(WindowEvent we)
 {
 }
public void windowIconified(WindowEvent we)
 {
 }
public void windowDeiconified(WindowEvent we)
 {
 }
public void windowOpened(WindowEvent we)
 {
 }
 }
public class FMenuItemEvents
 {
public static void main(String a[])
 {
MenuFrame mf=new MenuFrame("MyFrame");
mf.setVisible(true);
mf.setSize(200,200);
}
}


