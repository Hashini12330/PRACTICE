public class Main{
    public static void main(String[] args) {
        Monster monster = new Monster();
        monster.name = "Goblin";
        System.out.println(monster.name);

    }
}

class Monster{
    public String name;

    public void setName(String name){
        this.name = name;
    }

}