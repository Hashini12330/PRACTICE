public class Main{
    public static void main(String[] args) {
        
        MyClass cl = new MyClass();
        cl.display();   

    }
}


// interface
interface MyInterface{
    void display(); // method without body

}

class MyClass implements MyInterface{
    public void display(){
        System.out.println("Hello Java");
    };
}