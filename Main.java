public class Main{
    public static void main(String[] args) {
        Class<?> c = Car.class;

        System.out.println("Class name: " + c.getName());
        System.out.println("Simple name: " + c.getSimpleName());
        System.out.println("Parent class name: " + c.getSuperclass().getName());        // u think as Object but not

    }
}


class Car{
    
    public void drive(){
        System.out.println("Car is driving");
    }

}
