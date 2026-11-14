public class Main{
    public static void main(String[] args) {

        Monster ob = new Monster();
        System.out.println(ob.getName());   // You cannot call a constructor like a normal method.
        
    }
}


// constructor chain
class Monster{
    private String Name;

    public Monster(String Name){
        this.Name = Name;

    }

    public Monster(){
        this("John");
    }

    public String getName(){
        return Name;
    }
}