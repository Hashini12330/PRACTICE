public class Main{
    public static void main(String[] args) {
        Monster monster = new Monster();
        monster.showName();
        
    }
}

// inside constructor use method to set value

class Monster{
    private String name;

    public Monster(){
        this.setName("John");   // here use the setter method (setName()) to set the name
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void showName(){
        System.out.println("Monster name is: " + this.name);
    }
}