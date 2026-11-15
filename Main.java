public class Main{
    public static void main(String[] args) {
        Monster monster = new Monster();
        System.out.println("Read only value: " + monster.getName());
        

    }
}

class Monster{
    private String name = "john";

    public String getName(){
        return name;    
    }
}