public class Main{
    public static void main(String[] args) {
            Warrior warrior = new Warrior();
            Monster monster = new Monster(warrior);
            warrior.displayMonster();

    }
}


// Monster's details through the Warrior object.
class Monster{
    private String name;

    public Monster(String name){
        this.name = name;
    }


    // constructor receives a warrior obj
    public Monster(Warrior warrior){
        this.name = "Monster A";

        // pass current monster obj to warrior obj
        warrior.setMonster(this);
    }

    public void display(){
        System.out.println("Monster's name: " + this.name);
    }
}


class Warrior{
    private Monster monster;

    public void setMonster(Monster monster){
        this.monster = monster;
    }

    public void displayMonster(){
        monster.display();
    }
    
}
