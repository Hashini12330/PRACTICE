public class Main{
    public static void main(String[] args) {
        
        // call default method
        Dog d = new Dog();
        d.sound();

        Animal.information();




    }
}

 
interface Animal{
    default void sound(){
        System.out.println("Default animal sound");
    }

    static void information(){
        System.out.println("This is an animal");
    }


}

class Dog implements Animal{

    // No need to write sound() here

}