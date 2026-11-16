public class Main{
    public static void main(String[] args) {

        Dog d = new Dog();
        d.run();
    

    }
}


// eclips
class Animal{

}

interface RunnableTask{ // not Runnable with Thread
    void run(); // method without body
}

class Dog extends Animal implements RunnableTask{

    public void run(){  // here eed modifier
        System.out.println("Dog runns");
    }
}
