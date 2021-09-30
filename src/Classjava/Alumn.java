package Classjava;

public class Alumn {

    //Attributes

    private  int noControl;
    private String email;
    public String nombre,apellidos;
    protected String telefono;

    //Creating methods Get & Set for access to our private attributes

    void setNoControl(int NC){
        this.noControl=NC;
    }
    int  getNoControl(){
        return noControl;
    }
    void setEmail(String EM){
        this.email=EM;
    }
    String getEmail(){
        return email;
    }

    void  setTelefono(String TEF){
        this.telefono=TEF;
    }
    String getTelefono(){
        return telefono;
    }
    //Creating method far print values
    void verDatos(){
        System.out.println("No. de COntrol: "+noControl);
        System.out.println("Email: "+email);
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellidos);
        System.out.println("Telefono: "+telefono);
    }


}
