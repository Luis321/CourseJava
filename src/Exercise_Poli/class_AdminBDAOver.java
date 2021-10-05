package Exercise_Poli;

import javax.swing.*;

public class class_AdminBDAOver extends class_InformaticsOver{
    @Override
    public void salary(double pay) {
        JOptionPane.showMessageDialog(null,"The pay of a DBA is "+pay );

    }

    @Override
    public void details(String name) {
        JOptionPane.showMessageDialog(null,"The name of a DBA is " + name);
    }

    @Override
    public void work(String work) {
        JOptionPane.showMessageDialog(null,"The work of a DBA is "+ work );
    }
}
