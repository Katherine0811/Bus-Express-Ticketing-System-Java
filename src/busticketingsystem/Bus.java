package busticketingsystem;

//Jia Xuan
public class Bus {
    private int busID;
    private String operator;
    private String plateNo;
    
    public Bus(){
        
    }

    public Bus(int i, String o, String p){
        busID = i;
        operator = o;
        plateNo = p;
    }

    public int getBusID() {
        return busID;
    }

    public void setBusID(int busID) {
        this.busID = busID;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }
    //print all bus details
    public static void printBusDetails(Bus[] bus){
        System.out.println("\nBus' Details");
        System.out.println("============");
        for(int i = 0 ; i < bus.length ; i++){
            System.out.println(bus[i] + "\n");
        }
    }

    @Override
    public String toString() {
        return "Bus ID   : " + busID + "\nOperator : " + operator + "\nPlate No.: " + plateNo;
    }
    
}
