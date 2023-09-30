package busticketingsystem;

//Yan Jie
public class BackSeat extends Seat{
    public BackSeat(){     
        
    }
    
    public BackSeat(String[] a, Double[] b) {
        super(a, b);
    }
    public void display(String[] a, Double[] b) {
        // Print out Back Seat Price
        System.out.println("Back Seat");
        System.out.println("=========");
        System.out.println("|----------------|--------------|");
        System.out.println("|    Category    |     Price    |");
        System.out.println("|----------------|--------------|");       
        System.out.println("| " + a[0] + "         |   RM  " + String.format("%.2f", b[0]) + "   |");
        System.out.println("|----------------|--------------|");
        System.out.println("| " + a[1] + "          |   RM  " + String.format("%.2f", b[1]) + "   |");
        System.out.println("|----------------|--------------|");
        System.out.println("| " + a[2] + "          |   RM  " + String.format("%.2f", b[2]) + "   |");
        System.out.println("|----------------|--------------|");
        System.out.println("| " + a[3] + "        |   RM  " + String.format("%.2f", b[3]) + "   |");
        System.out.println("|----------------|--------------|"); 
    }
    
}
