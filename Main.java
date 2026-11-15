public class Main{
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.setName("Tommy");
        dog.show();
      
        
    }
}

class Animal{
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


}

class Dog extends Animal{
    void show(){
        System.out.println("Dog name is: " + getName());
    }
}