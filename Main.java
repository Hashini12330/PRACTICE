public class Main{
    public static void main(String[] args) {

        // Calling static method from static context
        Mons.test();

        // Calling static method from non static context
        Mons1.show();

        // Calling non static method from static context
        Mons2.test();



    }
}

class Mons{
    static int age = 25;    // static variable

    static void test(){ // static method
        age = 15;   // allow to change static variable in static method
        System.out.println("static variable wth static method: " + age);
    }
}


class Mons1{
    int age = 25; // non static variable
    private static int Age = 30;

    public static void show(){  // static method
        System.out.println("Age: " + Age);

        
        Mons1 ob = new Mons1();
        ob.age = 10;    //  allow with object of class
        System.out.println("Age: " + ob.age);
    }

}


// Non static method can not be called in static method directly, we need to create object of class to call non static method
class Mons2{
    public void setDetails(){
        System.out.println("This is non static method");
    }

    public static void test(){
        // setDetails(); // not allow to call non static method in static method

        Mons2 ob = new Mons2(); // create object of class
        ob.setDetails(); // allow to call non static method with object of class

    }


}



