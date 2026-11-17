public class Main{
    public static void main(String[] args) {
        
        // super   
        Dog d = new Dog("Tom");
        d.show();
        


    }
}

// super
class Animal{
    String name;

    Animal(String name){
        this.name = name;
    }

}

class Dog extends Animal{
    Dog(String name){
        super(name);
        
    }

    void show(){
        System.out.println("Nmme: " + name);
    }
}
