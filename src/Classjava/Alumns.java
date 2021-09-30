package Classjava;

public class Alumns {
    //Declarated Atributes

    int noControl;
    String nombre, apellidos;

    //Creating method Constructor
    /*Generalmente el constructor va asociado al nombre de la clase*/

    Alumns(int nC, String nom,String ape){
     //Initialized attributes
       //noControl=nc;
       //nombre=nom;
       //apellidos=ape;
     //Other form is using operator This
        this.noControl=nC;
        this.nombre=nom;
        this.apellidos=ape;


    }

    //Methods
    void  verDatos(){
        System.out.println("No. Control: "+ noControl);
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellidos);
    }

    //Creating methods Get and Set

    int getControl(){
       return this.noControl;
    }
    String getNombre(){
        return this.nombre;
    }

    String getApellidos(){
        return  this.apellidos;
    }

    //Methods Set

    void  setNoControl(int NC){
        this.noControl=NC;
    }
    void setNombre(String NOM){
        this.nombre=NOM;
    }
    void setApellidos(String APE){
        this.apellidos=APE;
    }
}
