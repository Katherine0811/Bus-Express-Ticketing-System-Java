package busticketingsystem;

//Yan Jie
public class Seat {
    protected int index;
    private String[] seatCategory = new String[4];
    private Double[] seatPrice = new Double[4];
    
    public Seat(){
        
    }
    
    public String[] getseatCategory() {
        return seatCategory;
    }
     public void setseatCategory(String [] newSeatCategory) {
        for (index = 0; index < 4; index++) {
            this.seatCategory[index] = newSeatCategory[index];
        }      
    }

    public Double[] getseatPrice() {
        return seatPrice;
    }
     public void setseatPrice(Double [] newSeatPrice) {
        for (index = 0; index < 4; index++) {
            this.seatPrice[index] = newSeatPrice[index];
        }      
    } 
    
    public Seat (String[] a, Double[] b) {
        this.seatCategory = a;
        this.seatPrice = b;   
    }
    
    public void setseatCategory(String a, String b, String c, String d){
        this.seatCategory[0] = a;
        this.seatCategory[1] = b;
        this.seatCategory[2] = c;
        this.seatCategory[3] = d;
    }
    
    public void setseatPrice(Double a, Double b, Double c, Double d){
        this.seatPrice[0] = a;
        this.seatPrice[1] = b;
        this.seatPrice[2] = c;
        this.seatPrice[3] = d;
    }    
   
}
