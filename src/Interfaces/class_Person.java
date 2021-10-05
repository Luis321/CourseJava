//SuperClass
// Making the abstract class to prevent it from being instantiated
package Interfaces;

public abstract class  class_Person{
     String name;
     int age;

    public class_Person(String name, int age){
        this.name= name;
        this.age= age;
    }

    //Creating method abstract
   abstract public void viewDetails();


}
