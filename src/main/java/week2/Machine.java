package week2;

public class Machine {
    private int id;
    class AI{
        public void activate(){
            System.out.println("Machine " + id + " is activated");
        }
    }
    public Machine(int id){
        this.id = id;
    }
    public void run(){
        System.out.println("Run machine" + " " + id);
        AI ai = new AI();
        ai.activate();
    }
}
