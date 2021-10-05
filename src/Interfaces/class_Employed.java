//Subclass
package Interfaces;

import javax.swing.*;

public class class_Employed extends class_Person implements Sicks{
    double salary;
    String telephone, address;
    public class_Employed(String name, int age, double salary, String telephone, String address){
        super(name, age);
        this.address=address;
        this.salary=salary;
        this.telephone=telephone;

    }
    @Override
    public void viewDetails(){
        JOptionPane.showMessageDialog(null,"Name: "+name+ "\nAge: " + age + "\nSalary: " + salary +
                        "\nTelephone: " + telephone + "\nAddress: "+ address,"Details of Employed",1);
    }

    @Override
    public void tos() {
        JOptionPane.showMessageDialog(null,"I have tos");

    }

    @Override
    public void diarrea() {
        JOptionPane.showMessageDialog(null,"I have diarrea");

    }
}
