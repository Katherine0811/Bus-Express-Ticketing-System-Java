package busticketingsystem;

//Jia Xuan
public class Payment {
    private int paymentID;
    private double totalToPay;
    
    public Payment(){
        
    }
    
    public Payment(int i, double t){
        paymentID = i;
        totalToPay = t;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public double getTotalToPay() {
        return totalToPay;
    }

    public void setTotalToPay(double totalToPay) {
        this.totalToPay = totalToPay;
    }
    //calculate total need to pay by the customer according to their category and seat selected
    public static double calculateTotal(int seat, String category){
        if(category.equalsIgnoreCase("Adult") && seat <= 20)
            return 8.00;
        else if(category.equalsIgnoreCase("Adult") && seat > 20)
            return 4.00;
        else if(category.equalsIgnoreCase("Child") && seat <= 20)
            return 2.00;
        else if(category.equalsIgnoreCase("Child") && seat > 20)
            return 1.00;
        else if(category.equalsIgnoreCase("Student") && seat <= 20)
            return 4.00;
        else if(category.equalsIgnoreCase("Student") && seat > 20)
            return 2.00;
        else if(category.equalsIgnoreCase("Senior") && seat <= 20)
            return 2.00;
        else
            return 1.00;
    }

    @Override
    public String toString() {
        return String.format("Payment ID   : " + paymentID + "\nTotal        : RM %.2f" , totalToPay);
    }
    
}
