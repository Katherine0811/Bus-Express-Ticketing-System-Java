package busticketingsystem;

//Ying Shan
public class DestinationStation extends Station{
    
    public DestinationStation(){
            
    }
    
    public DestinationStation(String a, String[] b, String[] c, String[] d){
        super(a, b, c, d);
    }
    
    public void showStation(String a, String[] b, String[] c, String[] d) {
        System.out.println(" " + a + " Route");
        System.out.println(" ___________________________________________________");
        System.out.println("| Station ID |     Station Name     | Arrival Times |");
        System.out.println("|---------------------------------------------------|");
        System.out.print("| " + b[0] + "\t     | ");
        System.out.printf("%-21s", c[0]);
        System.out.print("| " + d[0] + "\t    |\n");
        System.out.println("|\t     |\t\t\t    | " + d[1] + "\t    |");
        System.out.println("|\t     |\t\t\t    | " + d[2] + "\t    |");
        System.out.println("|---------------------------------------------------|");
        System.out.print("| " + b[1] + "\t     | ");
        System.out.printf("%-21s", c[1]);
        System.out.print("| " + d[3] + "\t    |\n");
        System.out.println("|\t     |\t\t\t    | " + d[4] + "\t    |");
        System.out.println("|\t     |\t\t\t    | " + d[5] + "\t    |");
        System.out.println("|---------------------------------------------------|");
        System.out.print("| " + b[2] + "\t     | ");
        System.out.printf("%-21s", c[2]);
        System.out.print("| " + d[6] + "\t    |\n");
        System.out.println("|\t     |\t\t\t    | " + d[7] + "\t    |");
        System.out.println("|\t     |\t\t\t    | " + d[8] + "\t    |");
        System.out.println("|---------------------------------------------------|");
        System.out.print("| " + b[3] + "\t     | ");
        System.out.printf("%-21s", c[3]);
        System.out.print("| " + d[9] + "\t    |\n");
        System.out.println("|\t     |\t\t\t    | " + d[10] + "\t    |");
        System.out.println("|\t     |\t\t\t    | " + d[11] + "\t    |");
        System.out.println(" --------------------------------------------------- \n");
    }
}
