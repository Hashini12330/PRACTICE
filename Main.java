public class Main{
    public static void main(String[] args) {
        Mons m1 = new Mons();
        Mons m2 = new Mons();
        Mons m3 = new Mons();
        Mons m4 = new Mons();
                
        System.out.println("Monsters: " + Mons.monsters);
    }
}

class Mons{
    static int monsters;

    static {
        System.out.println("Static block executed");
        monsters = 2;

    }
    public Mons(){
        System.out.println("Constructor executed");
    }

}