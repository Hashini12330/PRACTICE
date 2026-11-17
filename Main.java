public class Main{
    public static void main(String[] args) {
        
        // super   
        Dog d = new Dog();


    }
}

// super
class Animal{
    Animal(){
        System.out.println("Animal Constructor show without super");    // In Java, even if you don't write super(), Java automatically calls the parent class's constructor.
    }

    public void check(){
        System.out.println("Not show without super");
    }

}

class Dog extends Animal{
    Dog(){
        super();
        super.check();    // here without super can show parent constructor
        System.out.println("Dog Constructor show");
    }
}
