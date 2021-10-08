package TextArchive;
import javax.swing.*;
import java.io.*;

//In this class be read line for line of each register.
public class class_readArchiveline {
    public static void main(String[] args) {
        int registers = 1;
        File archive;
        FileReader read;
        BufferedReader storage;
        String cadena, name="",address="",email="";
        archive = new File("users.txt");
        try {
            read = new FileReader(archive);
            storage=new BufferedReader(read);
            cadena="";
            while (cadena!=null){
                try {
                    cadena=storage.readLine();
                    name=cadena;
                    cadena=storage.readLine();
                    address=cadena;
                    cadena=storage.readLine();
                    email=cadena;
                    if(cadena!=null){
                        JOptionPane.showMessageDialog(null,"Name: "+name
                        +"\nAddress: "+address+"\nEmail: "+email, "See details register #"+ registers,1);
                    registers++;
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            try {
                storage.close();
                read.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
