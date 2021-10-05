package Exercise_Poli;

import javax.swing.*;

public class class_Analyst extends class_informatics {
    public void salary(int hours, double payH,double bonnus) {
        JOptionPane.showMessageDialog(null, "The pay is: " + (hours*payH)+bonnus);
    }
    public void details(String name, String lastname, String address){
        JOptionPane.showMessageDialog(null, "The name is: " + name +"\nLast Name: "+lastname+"\nAddress :"+address);
    }
    public void work(String work, int hours){
        JOptionPane.showMessageDialog(null, "I'm  analyst and "+ " I dedicated myself at "+ work +" "+ hours +" hours");

    }

}
