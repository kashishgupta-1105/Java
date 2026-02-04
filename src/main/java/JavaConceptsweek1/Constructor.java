package JavaConcepts;

class Program {
    int value;
    String text;

    public Program() {
        this(4);
        System.out.println("First Constructor");
        value = 12;
    }
    public Program(int value){
        this.value = value;  //this keyword is used to assign of a instance variable to a local variable.
        System.out.println("Second Constructor");
    }
    public Program(int value,String text){
        this.value = value;
        this.text = text;//this keyword is used to assign of a instance variable to a local variable.
        System.out.println("Third Constructor");
    }
}
public class Constructor {
    public static void main(String args[]) {
        Program myProgram = new Program();
        Program myProgram1 = new Program(2);
        Program myProgram2 = new Program(3,"abc");
    }

}
