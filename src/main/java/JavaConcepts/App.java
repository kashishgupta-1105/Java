package JavaConcepts;

// Encapsulation
class car{
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRevenueData(){
        String data = "Revenue" + calculateRevenue();
        return data;
    }
    private int calculateRevenue(){
        return 12000;
    }
}
public class App {
    public static void main(String[] args){
        
    }
}
