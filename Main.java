public class Main{
    public static void main(String[] args) {
        Monster a = new Monster();
        a.show();
        System.out.println(a.toString());
        System.out.println(a.getClass());
    
        
    }
}

class Monster{
    void show(){
        System.out.println("I am a Monster");
    }
}