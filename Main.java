public class Main{
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle(10);
        Bicycle bike2 = new Bicycle(20);
        Bicycle bike3 = new Bicycle(30);

        System.out.println("Bike 1 ID: " + bike1.getId());
        System.out.println("Bike 2 ID: " + bike2.getId());  
        System.out.println("Bike 3 ID: " + bike3.getId());

        System.out.println("Total number of bicycles: " + Bicycle.getNumOfBicycles());  // for static method we do not create an object to call it

    }
}

// static variable and method
class Bicycle{
    private int speed;
    private int id;

    private static int numOfBicycles = 0;

    public Bicycle(int starSpeed){
        speed = starSpeed;

        numOfBicycles++;
        id = numOfBicycles;

    }

    public int getId(){
        return id;
    }

    public static int getNumOfBicycles(){
        return numOfBicycles;
    }


}