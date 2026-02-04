package JavaConceptsweek1.JavaProblems;
class ClassMethodObject {
    String animal;
    int value;
    int month;

    void run(){
        System.out.println("Running");
        System.out.println("My " + animal + " is " + value + " years old");
    }
    //Return type: int
    int calculateMonthsToBirthday(){
        int monthsLeft = 12 - month;
        System.out.println(monthsLeft);
        return monthsLeft;
    }

     void talk(String text) {
         System.out.println(text);
    }
    void walk(int speed){
        System.out.println(speed);
    }
    void timer(int min){
        System.out.println("It took " + min  + " to get down the hill" );
    }
}
public class Object{
    public static void main(String[] args) {
        ClassMethodObject name = new ClassMethodObject();
        name.animal = "Cat";
        name.value = 9;
        //name.run();
        name.month = 6;
        int months = name.calculateMonthsToBirthday();
        System.out.println(months);
        name.talk("Hi I'm Kashish");
        name.walk(7);
        name.timer(1);

    }
}
