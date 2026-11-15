public class Main{
    public static void main(String[] args) {
        Monster m1 = new Monster();
        System.out.println("----------------------------------");
        Monster m2 = new Monster();
    }
}

class Monster {

    static int count;

    // SIB
    static {
        System.out.println("SIB");
        count = 10;
    }

    // IIB
    {
        System.out.println("IIB");
    }

    Monster() {
        System.out.println("Constructor");
    }
}