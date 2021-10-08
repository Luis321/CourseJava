package TextArchive;
import javax.swing.*;
import java.io.*;

public class class_readArchive {
    public static void main(String[] args) {
        /*
        ***Algoritmo para leer un archivo de Java***
        * 1- Declarar una variable de tipo File
        * 2- Declarar una variable de tipo FileReader
        * 3- Declarar una variable de tipo String
        * 4- Preparar el archivo
        * 5- Crear una instancia de tipo FileReader(lector)
        * 6- Crear una instancia de tipo BufferedReader
        * 7- Inicializar la variable de tipo cadena a nada.
        * 8- Crear un ciclo que se repita mientras la variable de tipo cadena sea diferente de nula
            *8.1- Asignar a la variable de tipo cadena buffer .readline()
            *8.2- Si la variable de tipo cadena es diferent de nulo mostrar su contenido
        * Cerrar el buffer
        * Cerrar el lector
        *  */

        File myArchive;
        FileReader read;
        String cadena;

        myArchive = new File("RequisitosLectura.txt");
        String  KDNACH="";
        try {
            read = new FileReader(myArchive);
            BufferedReader storage = new BufferedReader(read);
            cadena="";
            while(cadena!=null){
                try {
                    cadena=storage.readLine();
                    if(cadena!=null){
                        System.out.println(cadena);
                        KDNACH=KDNACH + cadena + "\n";
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
        JOptionPane.showMessageDialog(null,KDNACH,"See details of archive with style",1);

    }
}
