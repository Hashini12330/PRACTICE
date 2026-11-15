public class Main{
    public static void main(String[] args) {

        // 03
        Iib1 obj1 = new Iib1();    // run when create object
        System.out.println("=====================================");



        // 01 - show only first constructor
        Iib obj = new Iib(25);    // run when create object
        obj.display();

        System.out.println("=====================================");

        // 02 - only show second constructor
        Iib obj2 = new Iib();    // run when create object
        obj2.display();

        
    }
}


class Iib1{
    int age;

    {
        age = 15;
    }

    public Iib1(){
        System.out.println("Iib1 constructor1");
        System.out.println("Iib1 constructor Age1: " + age);

    }


}



// IIB

class Iib{
    int age;

    
    public void display(){  // A normal method can access and use the value assigned inside an IIB (Instance Initialization Block) because both the IIB and normal method belong to the same object, and age is an instance variable.
        System.out.println("IIB display Age: " + age);
    }

    public Iib(int age){
        System.out.println("IIB constructor");
        System.out.println("IIB constructor Age: " + age);
    }

    public Iib(){
        System.out.println("IIB constructor 2");
    }

 
    {
        age = 20;   
        System.out.println("IIB block Age: " + age);
    }

        /*
        Object creation
        ````↓
        IIB runs
            ↓
        Constructor runs
        ````↓
        Normal method runs
        */
    

}