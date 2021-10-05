package Exercise_Poli;

import javax.swing.*;

public class class_Developer  extends class_informatics{
    //Using Polymorphism Overload
    public void salary(int hours, double payH) {
        JOptionPane.showMessageDialog(null, "The pay is: " + (hours*payH));
    }
    public void details(String name, String lastname){
        JOptionPane.showMessageDialog(null, "The name is: " + name +"\nLast Name: "+lastname);
    }
    public void work(String work){
        JOptionPane.showMessageDialog(null, "I'm  developer and "+ " I dedicated myself at "+ work);

    }
}
