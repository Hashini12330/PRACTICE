public class Main{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Tom";
        d.setAge(5);
        d.show();

    }
}


class Animal{
    protected String name;

}

class Dog extends Animal{
    private int age;

    public void show(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void setAge(int age){
        this.age = age;
    }

}


