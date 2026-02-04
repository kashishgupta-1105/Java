package week2;

public class classA extends classC{
    //final variables should be assigned value at time of initiation.
    final int test;
    {
        test = 20;
        System.out.println(test);
    }

    void print(){
        System.out.println(super.protectedVariable);
    }
    static void main() {
        classA a = new classA();
        System.out.println(protectedVariable);

    }
}
