package Classjava;

public class class_Alumn {
    public static void main(String[] args) {

        Alumn alum1  = new Alumn();
        Alumn alum2 = new Alumn();


        alum1.setNoControl(12345);
        alum1.nombre="Jeremias";
        alum1.apellidos="Gaviliano";
        alum1.setEmail("jeremias@gmail.com");
        alum1.telefono="987654321";
        alum1.verDatos();

        alum2.setNoControl(91826);
        alum2.nombre="Luciana";
        alum2.apellidos="Sun";
        alum2.setEmail("sun@gmail.com");
        alum2.setTelefono("987654321");
        alum2.verDatos();

        System.out.println("Accediendo al noControl: "+ alum2.getNoControl());


    }
}
