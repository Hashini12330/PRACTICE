public class Main{
    public static void main(String[] args) {
        Mons ob = new Mons("John", 25);

        System.out.println("Original Name:" + ob.getname());
        System.out.println("Original Age:" + ob.getage());

        ob.setname("Doe");
        System.out.println("Updated Name:" + ob.getname());


        ob.setage(26);
        System.out.println("Updated Age:" + ob.getage());


        // get data from Monster class
        Monster monster = new Monster();
        ob.steal(monster);
        
    }
}

class Mons{
    private String name;
    private int age;

    public Mons(String name1, int age1){
        this.name = name1;
        this.age = age1;
    }

    public void setname(String name1){
        this.name = name1;
    }

    public String getname(){
        return this.name;
    }

    public void setage(int age1){
        this.age = age1;
    }

    public int getage(){
        return this.age;
    }

    // method to call loseStick() from Monster class
    public void steal(Monster mons){
        mons.loseStick();
    }

}