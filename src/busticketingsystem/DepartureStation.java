package busticketingsystem;

//Ying Shan
public class DepartureStation extends Station{
    
    public DepartureStation(){
            
    }
    
    public DepartureStation(String a, String b, String c, String d, String e, String f){
        super(a, b, c, d, e, f);
    }
    
    public void showStation(String a, String[] b, String[] c, String[] d) {
        System.out.println(" " + a + " Route");
        System.out.println(" _____________________________________________");
        System.out.println("| Station ID | Station Name | Departure Times |");
        System.out.println("|---------------------------------------------|");
        System.out.print("| " + b[0] + "\t     | ");
        System.out.printf("%-13s", c[0]);
        System.out.print("| " + d[0] + "\t      |\n");
        System.out.println(" ---------------------------| " + d[1] + "\t      |");
        System.out.println("\t\t\t    | " + d[2] + "\t      |");
        System.out.println("\t\t\t     ----------------- \n");
    }
}
