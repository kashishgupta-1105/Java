package week2;

//An inner class is a class defined inside another class.

//Why it exists:
//Represents a strong relationship
//Improves encapsulation
//Helps group helper classes logically

//Java has 4 types of inner classes:
//Non-static (Regular) inner class
//Static inner class
//Local inner class
//Anonymous inner class

class OuterClass{
    int x = 10;

    class InnerClass{
        void display(){
            System.out.println(x);
        }
    }
}
public class Test {
    static void main() {
        OuterClass o = new OuterClass();
        OuterClass.InnerClass i = o.new InnerClass();
        i.display();
    }
}
