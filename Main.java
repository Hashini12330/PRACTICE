public class Main{
    public static void main(String[] args) {
        Animal.show();
        Dog.show();
        

    }
}


 
class Animal{
    public static void show(){
        System.out.println("Animal");
    }

}

class Dog extends Animal{
    public static void show(){
        System.out.println("Dog");
    }

}
