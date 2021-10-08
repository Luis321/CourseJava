package TextArchive;
import javax.swing.*;
import java.io.*;

public class class_writeArchive {

    public static void main(String[] args) {
        /*
        * Algoritmo para escribir en un archivo desde Java
        * 1- Crear una variable de tipo File
        * 2- Crear una variable de tipo PrintWriter
        * 3- Preparar al archivo
        * 4- Verificar si el archivo no existe
            *4.1- Crear al Archivo
            ***4.2 En otro caso (else)***
                * 4.2.1 Preparar al archivo para escribir
                * 4.2.2 Escribir en el archivo
             * 4.2.3 Cerrar el archivo
         */

        String name;
       File myArchive; //Manage archive
       PrintWriter writer; //Write archive

        myArchive = new File("Example.txt");//Prepare the File
        if (!myArchive.exists()){
            //Create archive
            System.out.println("Archive created exists");
            try {
                myArchive.createNewFile();
            }catch (IOException ex){

            }
        }else {
            System.out.println("The archive exists");
            try {
                writer = new PrintWriter(myArchive,"utf-8");
                name= JOptionPane.showInputDialog(null,"Enter Name " );
                writer.println("Hi, engineer "+name+ " ,welcome to the party");
                writer.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

         }
        }
    }
//}
