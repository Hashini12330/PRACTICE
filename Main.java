public class Main{
    public static void main(String[] args) {
        
        Dog d = new Dog();
        d.show();

    }
}


class Animal{
    public void sound(){
        System.out.println("baw baw");
    }

}

class Dog extends Animal{
    public void show(){
        super.sound();
        System.out.println("Show sound");
    }
}