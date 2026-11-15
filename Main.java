public class Main{
    public static void main(String[] args) {
        Monster obj = new Monster();
        obj.setAge(25);
        System.out.println(obj.getAge());

    }
}


class Monster{
    private int age;

    public void setAge(int age){
        if(age >= 1){
            this.age = age;
        }else{
            System.out.println("Age must be greater than 0");
        }

    }

    public int getAge(){
        return age;
    }

}
