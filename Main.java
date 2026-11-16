import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Sc s = new Sc();
        s.scnner();
    }
}



class Sc{

    public void scnner(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = scanner.nextLine();
        String name1 = scanner.next();

        // read line
        System.out.println("His name is: " + name);     // rads one word

        System.out.println("His name is: " + name1);    // read whole lines

        // close scanner
        scanner.close();
        
    }

}
 