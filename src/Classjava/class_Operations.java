package Classjava;

public class class_Operations {
    public static void main(String[] args) {
        int result;
        int r=5;
        boolean statuValue;
        Operations opl = new Operations();
        result=opl.sum(5,30);
        System.out.println("La suma es: "+result);

        result= opl.rest(30,5);
        System.out.println("La resta es: "+result);
        System.out.println("El área del círculo con radio es: "+r+" es " + opl.areaCirculo(r));
        statuValue= opl.status(3);
        System.out.println("El estatus del tequila es :" +statuValue);

        if (statuValue==true){
            System.out.println("Que mal, estas ebrio");
        }else{
            System.out.println("Que bien, aún estas sobrio");
        }


    }
}
