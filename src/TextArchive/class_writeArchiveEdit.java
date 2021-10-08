package TextArchive;

import javax.swing.*;
import java.io.*;

public class class_writeArchiveEdit {
    public static void main(String[] args) {
        File archive;
        FileWriter writer;
        PrintWriter line;
        String name = "", address = "", email = "";
        archive = new File("users.txt");
        if (!archive.exists()) {
            try {
                archive.createNewFile();
                name = JOptionPane.showInputDialog(null,"Enter name: "+" requesting details"+3);
                address = JOptionPane.showInputDialog(null,"Enter address: "+" requesting details"+3);
                email = JOptionPane.showInputDialog(null,"Enter mail: "+" requesting details"+3);

                writer = new FileWriter(archive, true);
                line = new PrintWriter(writer);
                //Write the archive

                line.println(name);
                line.println(address);
                line.println(email);
                line.close();
                writer.close();



            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {

                name = JOptionPane.showInputDialog(null,"Enter name: "," requesting details",3);
                address = JOptionPane.showInputDialog(null,"Enter address: "," requesting details",3);
                email = JOptionPane.showInputDialog(null,"Enter mail: "," requesting details",3);

                writer = new FileWriter(archive, true);
                line = new PrintWriter(writer);
                //Write the archive

                line.println(name);
                line.println(address);
                line.println(email);
                line.close();
                writer.close();



            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}