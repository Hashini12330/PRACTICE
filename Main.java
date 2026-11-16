public class Main{
    public static void main(String[] args) {

        // method 01
        Day d = Day.MONDAY;
        System.out.println(d);
        

        // with if else
        Days dd = new Days();
        dd.dd();
        


    }
}


// method 01

enum Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}


// with if else

class Days{

    Day day = Day.TUESDAY;

    public void dd(){

        if(day == Day.MONDAY){
            System.out.println("Today is Monday");
        }else if(day == Day.TUESDAY){
            System.out.println("Today is Tuesday");
        }else{
            System.out.println("Today is Wednesday");
        }

    }

}