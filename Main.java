public class Main{
    public static void main(String[] args) {
        
        // Create an instance of the Append class
        Append appendInstance = new Append();
        appendInstance.append();


        // StringBuilder example
        SB sb = new SB();
        sb.Sb();

    
        
    }
}

class Append{

    String name = "Hello";

    public void append() {

        name = name + " John";

        System.out.println(name);
    }

}



class SB{

    public void Sb(){
        
        StringBuilder sb = new StringBuilder();

        // append "Hello" to the StringBuilder
        sb.append("Hello"); 
        sb.append(" World");

        System.out.println(sb);


        // Insert a comma after "Hello"
        sb.insert(5, ","); 
        System.out.println(sb);


        // delete characters
        sb.delete(2, 4);    // "ll" only removed
        System.out.println(sb);

        // reverse
        sb.reverse();
        System.out.println(sb);





    }



}