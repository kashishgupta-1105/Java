package JavaConcepts;

public class StaticBlock {

     static void main(String[] args){
        System.out.println("This is  main");
        main(10);
    }
    static void main(int a){
        System.out.println("This is main2");

    }
    static{
        System.out.println("This a static block");

    }


}

