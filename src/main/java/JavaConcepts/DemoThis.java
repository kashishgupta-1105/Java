package JavaConcepts;

public class DemoThis {
    public void display(){
        System.out.println(this);

    }
 static class Driver{
        public void view(){
            System.out.println("This is Driver");
            System.out.println(this);
        }
}
class Child extends Driver{
        public void view1(){
            System.out.println("This is Child");

        }
}
static void main() {
    Driver d1 = new Driver();
    d1.view();
}

}