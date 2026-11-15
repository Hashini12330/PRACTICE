public class Main{
    public static void main(String[] args) {
        Monster monster = new Monster();
        monster.setName("John");
        monster.displayName();
    }
}

class Monster{
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void displayName(){
        System.out.println("Monster's name is: " + name);
    }
}