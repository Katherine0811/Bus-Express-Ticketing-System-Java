package busticketingsystem;

//Ying Shan
public class Station {
    protected int index;
    private String route;
    private String[] stationID = new String[4];
    private String[] stationName = new String[4];
    private String[] time = new String[12];
    
    public Station(){
            
    }
    
    public Station(String a, String[] b, String[] c, String[] d){
        this.route = a;
        this.stationID = b;
        this.stationName = c;
        this.time = d;
    }
    
    public Station(String a, String b, String c, String d, String e, String f){
        this.route = a;
        this.stationID[0] = b;
        this.stationName[0] = c;
        this.time[0] = d;
        this.time[1] = e;
        this.time[2] = f;
    }
    
    public String getRoute() {
        return route;
    }
     public void setRoute(String newRoute) {
        this.route = newRoute;
    }
    
    public String[]getStationID(){
        return stationID.clone();
    }
     public void setStationID(String[] newStationID) {
        for (index = 0; index < 12; index++) {
            this.stationID[index] = newStationID[index];
        }      
    }
     
    public String[]getStationName(){
        return stationName.clone();
    }
     public void setStationName(String[] newStationName) {
        for (index = 0; index < 12; index++) {
            this.stationName[index] = newStationName[index];
        }      
    }
     
    public String[]getTime(){
        return time.clone();
    }
     public void setTime(String[] newTime) {
        for (index = 0; index < 12; index++) {
            this.time[index] = newTime[index];
        }      
    }
    
    public void setStationID(String a, String b, String c, String d){
        this.stationID[0] = a;
        this.stationID[1] = b;
        this.stationID[2] = c;
        this.stationID[3] = d;
    }
    
    public void setStationName(String a, String b, String c, String d){
        this.stationName[0] = a;
        this.stationName[1] = b;
        this.stationName[2] = c;
        this.stationName[3] = d;
    }
    
    public void setTime (String a, String b, String c, String d, String e, 
            String f, String g, String h, String i, String j, String k, String l){
        this.time[0] = a;
        this.time[1] = b;
        this.time[2] = c;
        this.time[3] = d;
        this.time[4] = e;
        this.time[5] = f;
        this.time[6] = g;
        this.time[7] = h;
        this.time[8] = i;
        this.time[9] = j;
        this.time[10] = k;
        this.time[11] = l;
    }
 
}
