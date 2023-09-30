package busticketingsystem;

//Jia Xuan
public class Ticket {
    private String route;
    private String departureStation;
    private String departureTime;
    private String category;
    private int seat;
    private static int numberOfTicket;
    
    public Ticket(){
        numberOfTicket++;
    }
    
    public Ticket(String r, String ds, String dt, String c, int s){
        route = r;
        departureStation = ds;
        departureTime = dt;
        category = c;
        seat = s;
        numberOfTicket++;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public static int getNumberOfTicket() {
        return numberOfTicket;
    }

    public static void setNumberOfTicket(int numberOfTicket) {
        Ticket.numberOfTicket = numberOfTicket;
    }

    @Override
    public String toString() {
        return "Ticket{" + "Route : " + route + ", Departure Station : " + departureStation + ", Departure Time : " + departureTime + ", Category : " + category + ", Seat : " + seat + '}';
    }
     
}
