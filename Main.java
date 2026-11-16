import static java.lang.System.out;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        math ob = new math();
        ob.MP();
        
    }
}


class math{

    int a = 10;
    int b = 20;

    public void MP(){
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
        System.out.println((int)Math.sqrt(25));
    }


}