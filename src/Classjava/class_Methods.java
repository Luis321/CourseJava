package Classjava;

public class class_Methods {
    public static void main(String[] args) {
        //Creating objects

        Alumns alu1=new Alumns(567433,"Cattleya","Otoya Vargas");
        Alumns alu2=new Alumns(12345,"Leonidas","Fizher Romero");

        alu1.verDatos();
        alu2.verDatos();

        //Calling methods get
        System.out.println(alu2.getNombre());

        //Assigning value to variable
        alu2.setNombre("Ramiro");
        System.out.println(alu2.getNombre());
    }
}
