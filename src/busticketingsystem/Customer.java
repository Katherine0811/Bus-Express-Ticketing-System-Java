package busticketingsystem;
import java.util.Scanner;

//Jia Xuan
public class Customer extends Person{
    private String category;
    private static int numberOfCustomer;
    
    //no-arg constructor
    public Customer(){
        numberOfCustomer++;
    }
    //parameterized constructor
    public Customer(String a, String b, int i, String c){
        super(a, b, i);
        this.category = c;
        numberOfCustomer++;
    }
    //getter and setter
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public static void setNumberOfCustomer(int numberOfCustomer) {
        Customer.numberOfCustomer = numberOfCustomer;
    }
    //add new customer
    public static void addCustomer(Customer[] customer){
        Scanner input = new Scanner(System.in);
        boolean contName = false, contContact = false;
        String name, contact;
        System.out.println("\nNew Customer");
        System.out.println("===============");
        //input validation for name
        do{
            System.out.print("Customer Name  : ");
            name = input.nextLine();
            if(name.length() == 0){
                System.out.println("Please enter a valid name.");
                contName = true;
            }
            for(int i = 0 ; i < name.length() ; i++){
                if(!Character.isLetter(name.charAt(i)) && !Character.isSpace(name.charAt(i))){
                    System.out.println("Please enter a valid name.");
                    contName = true;
                    break;
                }
                else{
                    contName = false;
                }
            }
        }while(contName);
        //input validation for contact number
        do{
            System.out.print("Contact Number : ");
            contact = input.nextLine();
            if(contact.length() != 10 && contact.length() != 11){
                System.out.println("Please enter a valid contact number.");
                contContact = true;
            }
            else{
                for(int i = 0 ; i < contact.length() ; i++){
                    if(!Character.isDigit(contact.charAt(i))){
                        System.out.println("Please enter a valid contact number.");
                        contContact = true;
                        break;
                    }
                    else{
                        contContact = false;
                    }
                }
            }
        }while(contContact);
        System.out.print("Category       : ");
        String category = input.nextLine();
        //input validation for category
        while(!category.equalsIgnoreCase("Adult") && !category.equalsIgnoreCase("Child") && 
                !category.equalsIgnoreCase("Senior") && !category.equalsIgnoreCase("Student")){
            System.out.println("Please enter only [Adult] [Child] [Senior] [Student].");
            System.out.print("Category       : ");
            category = input.nextLine();
        }
        int custNo = Customer.getNumberOfCustomer();
        customer[custNo++] = new Customer(name, contact, custNo, category);
    }
    
    //customer purchase ticket
    public static void purchaseTicket(String[][] seatR1B1, String[][] seatR1B2, String[][] seatR1B3, String[][] seatR2B1, String[][] seatR2B2, String[][] seatR2B3,
    String[][] seatR3B1, String[][] seatR3B2, String[][] seatR3B3, Ticket[] ticket){
        Scanner input = new Scanner(System.in);
        int route = 0, bus = 0, seatInt = 0, seatSelected = 0;
        int inputQty = 1; //the amount of seat customer would like to purchase
        int count = 0; //used to count inputQTY
        int seatTotal = 40; //total seat available per bus
        boolean continueInput = true, contBus = true;
        //input validation for route
        do{
            try{
                System.out.print("Please select an option : ");
                route = input.nextInt();
                if(route != 1 && route != 2 && route !=3){
                    System.out.println("Please enter [1] [2] or [3]");
                    continueInput = true;
                }
                else
                    continueInput = false;
            }
            catch(Exception ex){
                System.out.println("Please enter [1] [2] or [3]");
                input.nextLine();
            }
        }while(continueInput);
        System.out.println();
        //if user choose route 1(Setapak)
        if(route == 1){
            System.out.println("                        ***********************************                     ");
            System.out.println("                        **        SETAPAK STATION        **                     ");
            System.out.println("                        ***********************************                     ");
            System.out.println("________________________________________________________________________________");
            System.out.println("|        |             |   Setapak   | Wangsa Maju |    TARUC    | Taman Bunga |");
            System.out.println("| Bus ID |    PV 15    |   Central   |     LRT     |  Main Gate  |    Raya     |");
            System.out.println("|--------|-------------|-------------|-------------|-------------|-------------|");
            System.out.println("|  1100  |    06 30    |    06 45    |    07 00    |    07 15    |    07 30    |");
            System.out.println("|--------|-------------|-------------|-------------|-------------|-------------|");
            System.out.println("|  1200  |    12 00    |    12 15    |    06 30    |    12 45    |    13 00    |");
            System.out.println("|--------|-------------|-------------|-------------|-------------|-------------|");
            System.out.println("|  1300  |    18 30    |    18 45    |    19 00    |    19 15    |    19 30    |");
            System.out.println("|--------|-------------|-------------|-------------|-------------|-------------|");
            //input validation for bus ID
            do{
                try{
                    System.out.print("Please select a bus (Bus ID) : ");
                    bus = input.nextInt();
                    if(bus != 1100 && bus != 1200 && bus != 1300){
                        System.out.println("Please enter a valid Bus ID.");
                        contBus = true;
                    }
                    else
                        contBus = false;
                }
                catch(Exception ex){
                    System.out.println("Please enter a valid Bus ID.");
                    input.nextLine();
                }
            }while(contBus);
            System.out.println();
            System.out.println("***********************************************");
            System.out.println("|     Ticket     |       Ticket Prices        |");
            System.out.println("|   Categories   |-------------|--------------|");
            System.out.println("|  (Age Groups)  |  Front Seat |  Back Seat   |");
            System.out.println("|----------------|-------------|--------------|");
            System.out.println("| Senior         |  RM  2.00   |  RM  1.00    |");
            System.out.println("| Adult          |  RM  8.00   |  RM  4.00    |");
            System.out.println("| Child          |  RM  2.00   |  RM  1.00    |");
            System.out.println("| Student        |  RM  4.00   |  RM  2.00    |");
            System.out.println("|---------------------------------------------|");
            System.out.println("|              Terms & Conditions             |");
            System.out.println("|---------------------------------------------|");
            System.out.println("|  Senior        | above 60 years old         |");
            System.out.println("|  Child         | below 12 years old         |");
            System.out.println("|  Student       | must show student card     |");
            System.out.println("***********************************************");
            input.nextLine();
            System.out.print("Please enter your category : ");
            String category = input.nextLine();
            //input validation for category
            while(!category.equalsIgnoreCase("Adult") && !category.equalsIgnoreCase("Child") && 
                !category.equalsIgnoreCase("Senior") && !category.equalsIgnoreCase("Student")){
                System.out.println("Please enter only [Adult] [Child] [Senior] [Student].");
                System.out.print("Please enter your category : ");
                category = input.nextLine();
            }
            System.out.println();
            //user choose bus 1100
            if(bus == 1100){
                //display seat(Yan Jie)
                if (seatTotal >= inputQty){
                    seatTotal -= inputQty;
                    while (count < inputQty){
                        for (int i = 0; i < 10; i++){
                            System.out.print("  __    __     __    __  " + '\n');
                            for (int j = 0; j < 4; j++){
                                System.out.print(" |" + seatR1B1[i][j] + "| ");
                                if (j == 1){
                                    System.out.print(" ");
                                }
                            }
                            if (i == 4){
                                System.out.print('\n');
                            }
                        System.out.print('\n');
                        }
                        System.out.println();
                        // Get user input for seat
                        System.out.print("Enter the seat number u would like to book : ");
                        String seat = input.nextLine();
                        // Try to prevent error input 
                        try {
                            seatInt = Integer.parseInt(seat);
                        } catch (NumberFormatException e) {
                            seatInt = 100;
                        }
                        // Prevent invalid input
                            int x = -10000;
                            int y = -10000;

                        // Standardize front and back seat               
                        if (seatInt < 1) {
                            x = -10000;
                            y = -10000;
                        }
                        else if (seatInt < 21) {
                            x = 0;
                            y = 0;
                        }
                        else if (seatInt < 41) {
                            x = 5;
                            y = 0;
                            seatInt -= 20; // seatInt between 1-20
                        }

                        // Calculate array x and y
                        if (seatInt < 21) {
                            int countSeatA = seatInt / 2;
                            int countSeatB = seatInt % 2;
                            if (countSeatB == 0) { // if seat number is EVEN number
                                countSeatA -= 1;
                                y++;
                                if (countSeatA > 4) { // if seat number is MORE than 10
                                    x += countSeatA - 5;
                                    y += 2;
                                }
                                else // if seat number is LESS than 10
                                    x += countSeatA;
                            }
                            else{ // if seat number is ODD number
                                if (countSeatA > 4) { // if seat number is MORE than 10
                                    x += countSeatA - 5;
                                    y += 2;
                                }
                                else // if seat number is LESS than 10
                                    x += countSeatA;
                            }
                        }
                        // Display Output
                        if ((x < 0) && (y < 0)) {
                            System.out.println("Please, input correct seat number." + '\n');
                        }
                        else if (seatR1B1[x][y] != "__") {
                            seatR1B1[x][y] = ("__");
                            System.out.println("Booking success!");
                            count++;
                            seatSelected = Integer.parseInt(seat);
                        }
                        else {
                            System.out.println("Sorry, This seat is booked.");
                        }
                    }
                }
                //make payment
                Customer.makePayment(seatSelected, category);
                int ticketID = Ticket.getNumberOfTicket();
                ticket[ticketID++] = new Ticket("Setapak", "PV 15", "06 30", category, seatSelected);
            }
            //user choose bus 1200
            else if(bus == 1200){
                //display seat(Yan Jie)
                if (seatTotal >= inputQty){
                    seatTotal -= inputQty;
                    while (count < inputQty){
                        for (int i = 0; i < 10; i++){
                            System.out.print("  __    __     __    __  " + '\n');
                            for (int j = 0; j < 4; j++){
                                System.out.print(" |" + seatR1B2[i][j] + "| ");
                                if (j == 1){
                                    System.out.print(" ");
                                }
                            }
                            if (i == 4){
                                System.out.print('\n');
                            }
                        System.out.print('\n');
                        }
                        System.out.println();
                        // Get user input for seat
                        System.out.print("Enter the seat number u would like to book : ");
                        String seat = input.nextLine();
                        // Try to prevent error input 
                        try {
                            seatInt = Integer.parseInt(seat);
                        } catch (NumberFormatException e) {
                            seatInt = 100;
                        }
                        // Prevent invalid input
                            int x = -10000;
                            int y = -10000;

                        // Standardize front and back seat               
                        if (seatInt < 1) {
                            x = -10000;
                            y = -10000;
                        }
                        else if (seatInt < 21) {
                            x = 0;
                            y = 0;
                        }
                        else if (seatInt < 41) {
                            x = 5;
                            y = 0;
                            seatInt -= 20; // seatInt between 1-20
                        }

                        // Calculate array x and y
                        if (seatInt < 21) {
                            int countSeatA = seatInt / 2;
                            int countSeatB = seatInt % 2;
                            if (countSeatB == 0) { // if seat number is EVEN number
                                countSeatA -= 1;
                                y++;
                                if (countSeatA > 4) { // if seat number is MORE than 10
                                    x += countSeatA - 5;
                                    y += 2;
                                }
                                else // if seat number is LESS than 10
                                    x += countSeatA;
                            }
                            else{ // if seat number is ODD number
                                if (countSeatA > 4) { // if seat number is MORE than 10
                                    x += countSeatA - 5;
                                    y += 2;
                                }
                                else // if seat number is LESS than 10
                                    x += countSeatA;
                            }
                        }
                        // Display Output
                        if ((x < 0) && (y < 0)) {
                            System.out.println("Please, input correct seat number." + '\n');
                        }
                        else if (seatR1B2[x][y] != "__") {
                            seatR1B2[x][y] = ("__");
                            System.out.println("Booking success!");
                            count++;
                            seatSelected = Integer.parseInt(seat);
                        }
                        else {
                            System.out.println("Sorry, This seat is booked.");
                        }
                    }
                }
                Customer.makePayment(seatSelected, category);
                int ticketID = Ticket.getNumberOfTicket();
                ticket[ticketID++] = new Ticket("Setapak", "PV 15", "12 00", category, seatSelected);
            }
            //user choose bus 1300
            else{
                //display seat(Yan Jie)
                if (seatTotal >= inputQty){
                    seatTotal -= inputQty;
                    while (count < inputQty){
                        for (int i = 0; i < 10; i++){
                            System.out.print("  __    __     __    __  " + '\n');
                            for (int j = 0; j < 4; j++){
                                System.out.print(" |" + seatR1B3[i][j] + "| ");
                                if (j == 1){
                                    System.out.print(" ");
                                }
                            }
                            if (i == 4){
                                System.out.print('\n');
                            }
                        System.out.print('\n');
                        }
                        System.out.println();
                        // Get user input for seat
                        System.out.print("Enter the seat number u would like to book : ");
                        String seat = input.nextLine();
                        // Try to prevent error input 
                        try {
                            seatInt = Integer.parseInt(seat);
                        } catch (NumberFormatException e) {
                            seatInt = 100;
                        }
                        // Prevent invalid input
                            int x = -10000;
                            int y = -10000;

                        // Standardize front and back seat               
                        if (seatInt < 1) {
                            x = -10000;
                            y = -10000;
                        }
                        else if (seatInt < 21) {
                            x = 0;
                            y = 0;
                        }
                        else if (seatInt < 41) {
                            x = 5;
                            y = 0;
                            seatInt -= 20; // seatInt between 1-20
                        }

                        // Calculate array x and y
                        if (seatInt < 21) {
                            int countSeatA = seatInt / 2;
                            int countSeatB = seatInt % 2;
                            if (countSeatB == 0) { // if seat number is EVEN number
                                countSeatA -= 1;
                                y++;
                                if (countSeatA > 4) { // if seat number is MORE than 10
                                    x += countSeatA - 5;
                                    y += 2;
                                }
                                else // if seat number is LESS than 10
                                    x += countSeatA;
                            }
                            else{ // if seat number is ODD number
                                if (countSeatA > 4) { // if seat number is MORE than 10
                                    x += countSeatA - 5;
                                    y += 2;
                                }
                                else // if seat number is LESS than 10
                                    x += countSeatA;
                            }
                        }
                        // Display Output
                        if ((x < 0) && (y < 0)) {
                            System.out.println("Please, input correct seat number." + '\n');
                        }
                        else if (seatR1B3[x][y] != "__") {
                            seatR1B3[x][y] = ("__");
                            System.out.println("Booking success!");
                            count++;
                            seatSelected = Integer.parseInt(seat);
                        }
                        else {
                            System.out.println("Sorry, This seat is booked.");
                        }
                    }
                }
                //make payment
                Customer.makePayment(seatSelected, category);
                int ticketID = Ticket.getNumberOfTicket();
                ticket[ticketID++] = new Ticket("Setapak", "PV 15", "18 30", category, seatSelected);
            }
        }
        //if user choose route 2(KL Sentral)
        else if(route == 2){
            System.out.println("                        ***********************************                     ");
            System.out.println("                        **       KL SENTRAL STATION      **                     ");
            System.out.println("                        ***********************************                     ");
            System.out.println("________________________________________________________________________________");
            System.out.println("|        |             |  Methodist  |             |   Sunway    |             |");
            System.out.println("| Bus ID |  KL Sentral |   College   | Mid Valley  |   Lagoon    |  IOI Mall   |");
            System.out.println("|--------|-------------|-------------|-------------|-------------|-------------|");
            System.out.println("|  2100  |    06 30    |    06 45    |    07 00    |    07 15    |    07 30    |");
            System.out.println("|--------|-------------|-------------|-------------|-------------|-------------|");
            System.out.println("|  2200  |    12 00    |    12 15    |    06 30    |    12 45    |    13 00    |");
            System.out.println("|--------|-------------|-------------|-------------|-------------|-------------|");
            System.out.println("|  2300  |    18 30    |    18 45    |    19 00    |    19 15    |    19 30    |");
            System.out.println("|--------|-------------|-------------|-------------|-------------|-------------|");
            //input validation for bus ID
            do{
                try{
                    System.out.print("Please select a bus (Bus ID) : ");
                    bus = input.nextInt();
                    if(bus != 2100 && bus != 2200 && bus != 2300){
                        System.out.println("Please enter a valid Bus ID.");
                        contBus = true;
                    }
                    else
                        contBus = false;
                }
                catch(Exception ex){
                    System.out.println("Please enter a valid Bus ID.");
                    input.nextLine();
                }
            }while(contBus);
            System.out.println();
            System.out.println("***********************************************");
            System.out.println("|     Ticket     |       Ticket Prices        |");
            System.out.println("|   Categories   |-------------|--------------|");
            System.out.println("|  (Age Groups)  |  Front Seat |  Back Seat   |");
            System.out.println("|----------------|-------------|--------------|");
            System.out.println("| Senior         |  RM  2.00   |  RM  1.00    |");
            System.out.println("| Adult          |  RM  8.00   |  RM  4.00    |");
            System.out.println("| Child          |  RM  2.00   |  RM  1.00    |");
            System.out.println("| Student        |  RM  4.00   |  RM  2.00    |");
            System.out.println("|---------------------------------------------|");
            System.out.println("|              Terms & Conditions             |");
            System.out.println("|---------------------------------------------|");
            System.out.println("|  Senior        | above 60 years old         |");
            System.out.println("|  Child         | below 12 years old         |");
            System.out.println("|  Student       | must show student card     |");
            System.out.println("***********************************************");
            input.nextLine();
            System.out.print("Please enter your category : ");
            String category = input.nextLine();
            while(!category.equalsIgnoreCase("Adult") && !category.equalsIgnoreCase("Child") && 
                !category.equalsIgnoreCase("Senior") && !category.equalsIgnoreCase("Student")){
                System.out.println("Please enter only [Adult] [Child] [Senior] [Student].");
                System.out.print("Please enter your category : ");
                category = input.nextLine();
            }
            //user choose bus 2100
            if(bus == 2100){
                //display seat(Yan Jie)
                if (seatTotal >= inputQty){
                    seatTotal -= inputQty;
                    while (count < inputQty){
                        for (int i = 0; i < 10; i++){
                            System.out.print("  __    __     __    __  " + '\n');
                            for (int j = 0; j < 4; j++){
                                System.out.print(" |" + seatR2B1[i][j] + "| ");
                                if (j == 1){
                                    System.out.print(" ");
                                }
                            }
                            if (i == 4){
                                System.out.print('\n');
                            }
                        System.out.print('\n');
                        }
                        System.out.println();
                        // Get user input for seat
                        System.out.print("Enter the seat number u would like to book : ");
                        String seat = input.nextLine();
                        // Try to prevent error input 
                        try {
                            seatInt = Integer.parseInt(seat);
                        } catch (NumberFormatException e) {
                            seatInt = 100;
                        }
                        // Prevent invalid input
                            int x = -10000;
                            int y = -10000;

                        // Standardize front and back seat               
                        if (seatInt < 1) {
                            x = -10000;
                            y = -10000;
                        }
                        else if (seatInt < 21) {
                            x = 0;
                            y = 0;
                        }
                        else if (seatInt < 41) {
                            x = 5;
                            y = 0;
                            seatInt -= 20; // seatInt between 1-20
                        }

                        // Calculate array x and y
                        if (seatInt < 21) {
                            int countSeatA = seatInt / 2;
                            int countSeatB = seatInt % 2;
                            if (countSeatB == 0) { // if seat number is EVEN number
                                countSeatA -= 1;
                                y++;
                                if (countSeatA > 4) { // if seat number is MORE than 10
                                    x += countSeatA - 5;
                                    y += 2;
                                }
                                else // if seat number is LESS than 10
                                    x += countSeatA;
                            }
                            else{ // if seat number is ODD number
                                if (countSeatA > 4) { // if seat number is MORE than 10
                                    x += countSeatA - 5;
                                    y += 2;
                                }
                                else // if seat number is LESS than 10
                                    x += countSeatA;
                            }
                        }
                        // Display Output
                        if ((x < 0) && (y < 0)) {
                            System.out.println("Please, input correct seat number." + '\n');
                        }
                        else if (seatR2B1[x][y] != "__") {
                            seatR2B1[x][y] = ("__");
                            System.out.println("Booking success!");
                            count++;
                            seatSelected = Integer.parseInt(seat);
                        }
                        else {
                            System.out.println("Sorry, This seat is booked.");
                        }
                    }
                }
                //make payment
                Customer.makePayment(seatSelected, category);
                int ticketID = Ticket.getNumberOfTicket();
                ticket[ticketID++] = new Ticket("KL Sentral", "KL Sentral", "06 30", category, seatSelected);
            }
            //user choose bus 2200
            else if(bus == 2200){
                //display seat(Yan Jie)
                if (seatTotal >= inputQty){
                    seatTotal -= inputQty;
                    while (count < inputQty){
                        for (int i = 0; i < 10; i++){
                            System.out.print("  __    __     __    __  " + '\n');
                            for (int j = 0; j < 4; j++){
                                System.out.print(" |" + seatR2B2[i][j] + "| ");
                                if (j == 1){
                                    System.out.print(" ");
                                }
                            }
                            if (i == 4){
                                System.out.print('\n');
                            }
                        System.out.print('\n');
                        }
                        System.out.println();
                        // Get user input for seat
                        System.out.print("Enter the seat number u would like to book : ");
                        String seat = input.nextLine();
                        // Try to prevent error input 
                        try {
                            seatInt = Integer.parseInt(seat);
                        } catch (NumberFormatException e) {
                            seatInt = 100;
                        }
                        // Prevent invalid input
                            int x = -10000;
                            int y = -10000;

                        // Standardize front and back seat               
                        if (seatInt < 1) {
                            x = -10000;
                            y = -10000;
                        }
                        else if (seatInt < 21) {
                            x = 0;
                            y = 0;
                        }
                        else if (seatInt < 41) {
                            x = 5;
                            y = 0;
                            seatInt -= 20; // seatInt between 1-20
                        }

                        // Calculate array x and y
                        if (seatInt < 21) {
                            int countSeatA = seatInt / 2;
                            int countSeatB = seatInt % 2;
                            if (countSeatB == 0) { // if seat number is EVEN number
                                countSeatA -= 1;
                                y++;
                                if (countSeatA > 4) { // if seat number is MORE than 10
                                    x += countSeatA - 5;
                                    y += 2;
                                }
                                else // if seat number is LESS than 10
                                    x += countSeatA;
                            }
                            else{ // if seat number is ODD number
                                if (countSeatA > 4) { // if seat number is MORE than 10
                                    x += countSeatA - 5;
                                    y += 2;
                                }
                                else // if seat number is LESS than 10
                                    x += countSeatA;
                            }
                        }
                        // Display Output
                        if ((x < 0) && (y < 0)) {
                            System.out.println("Please, input correct seat number." + '\n');
                        }
                        else if (seatR2B2[x][y] != "__") {
                            seatR2B2[x][y] = ("__");
                            System.out.println("Booking success!");
                            count++;
                            seatSelected = Integer.parseInt(seat);
                        }
                        else {
                            System.out.println("Sorry, This seat is booked.");
                        }
                    }
                }
                //make payment
                Customer.makePayment(seatSelected, category);
                int ticketID = Ticket.getNumberOfTicket();
                ticket[ticketID++] = new Ticket("KL Sentral", "KL Sentral", "12 00", category, seatSelected);
            }
            //user choose bus 2300
            else{
                //display seat(Yan Jie)
                if (seatTotal >= inputQty){
                    seatTotal -= inputQty;
                    while (count < inputQty){
                        for (int i = 0; i < 10; i++){
                            System.out.print("  __    __     __    __  " + '\n');
                            for (int j = 0; j < 4; j++){
                                System.out.print(" |" + seatR2B3[i][j] + "| ");
                                if (j == 1){
                                    System.out.print(" ");
                                }
                            }
                            if (i == 4){
                                System.out.print('\n');
                            }
                        System.out.print('\n');
                        }
                        System.out.println();
                        // Get user input for seat
                        System.out.print("Enter the seat number u would like to book : ");
                        String seat = input.nextLine();
                        // Try to prevent error input 
                        try {
                            seatInt = Integer.parseInt(seat);
                        } catch (NumberFormatException e) {
                            seatInt = 100;
                        }
                        // Prevent invalid input
                            int x = -10000;
                            int y = -10000;

                        // Standardize front and back seat               
                        if (seatInt < 1) {
                            x = -10000;
                            y = -10000;
                        }
                        else if (seatInt < 21) {
                            x = 0;
                            y = 0;
                        }
                        else if (seatInt < 41) {
                            x = 5;
                            y = 0;
                            seatInt -= 20; // seatInt between 1-20
                        }

                        // Calculate array x and y
                        if (seatInt < 21) {
                            int countSeatA = seatInt / 2;
                            int countSeatB = seatInt % 2;
                            if (countSeatB == 0) { // if seat number is EVEN number
                                countSeatA -= 1;
                                y++;
                                if (countSeatA > 4) { // if seat number is MORE than 10
                                    x += countSeatA - 5;
                                    y += 2;
                                }
                                else // if seat number is LESS than 10
                                    x += countSeatA;
                            }
                            else{ // if seat number is ODD number
                                if (countSeatA > 4) { // if seat number is MORE than 10
                                    x += countSeatA - 5;
                                    y += 2;
                                }
                                else // if seat number is LESS than 10
                                    x += countSeatA;
                            }
                        }
                        // Display Output
                        if ((x < 0) && (y < 0)) {
                            System.out.println("Please, input correct seat number." + '\n');
                        }
                        else if (seatR2B3[x][y] != "__") {
                            seatR2B3[x][y] = ("__");
                            System.out.println("Booking success!");
                            count++;
                            seatSelected = Integer.parseInt(seat);
                        }
                        else {
                            System.out.println("Sorry, This seat is booked.");
                        }
                    }
                }
                //make payment
                Customer.makePayment(seatSelected, category);
                int ticketID = Ticket.getNumberOfTicket();
                ticket[ticketID++] = new Ticket("KL Sentral", "KL Sentral", "18 30", category, seatSelected);
            }
        }
        //if user choose route 3(Kepong)
        else{
            System.out.println("                        ***********************************                     ");
            System.out.println("                        **         KEPONG STATION        **                     ");
            System.out.println("                        ***********************************                     ");
            System.out.println("________________________________________________________________________________");
            System.out.println("|        |             |             |             |             |  Desa Park  |");
            System.out.println("| Bus ID |   Kepong    | Metro Prima |   Jinjang   |  Segambut   |    City     |");
            System.out.println("|--------|-------------|-------------|-------------|-------------|-------------|");
            System.out.println("|  3100  |    06 30    |    06 45    |    07 00    |    07 15    |    07 30    |");
            System.out.println("|--------|-------------|-------------|-------------|-------------|-------------|");
            System.out.println("|  3200  |    12 00    |    12 15    |    06 30    |    12 45    |    13 00    |");
            System.out.println("|--------|-------------|-------------|-------------|-------------|-------------|");
            System.out.println("|  3300  |    18 30    |    18 45    |    19 00    |    19 15    |    19 30    |");
            System.out.println("|--------|-------------|-------------|-------------|-------------|-------------|");
            //input validation for bus ID
            do{
                try{
                    System.out.print("Please select a bus (Bus ID) : ");
                    bus = input.nextInt();
                    if(bus != 3100 && bus != 3200 && bus != 3300){
                        System.out.println("Please enter a valid Bus ID.");
                        contBus = true;
                    }
                    else
                        contBus = false;
                }
                catch(Exception ex){
                    System.out.println("Please enter a valid Bus ID.");
                    input.nextLine();
                }
            }while(contBus);
            System.out.println();
            System.out.println("***********************************************");
            System.out.println("|     Ticket     |       Ticket Prices        |");
            System.out.println("|   Categories   |-------------|--------------|");
            System.out.println("|  (Age Groups)  |  Front Seat |  Back Seat   |");
            System.out.println("|----------------|-------------|--------------|");
            System.out.println("| Senior         |  RM  2.00   |  RM  1.00    |");
            System.out.println("| Adult          |  RM  8.00   |  RM  4.00    |");
            System.out.println("| Child          |  RM  2.00   |  RM  1.00    |");
            System.out.println("| Student        |  RM  4.00   |  RM  2.00    |");
            System.out.println("|---------------------------------------------|");
            System.out.println("|              Terms & Conditions             |");
            System.out.println("|---------------------------------------------|");
            System.out.println("|  Senior        | above 60 years old         |");
            System.out.println("|  Child         | below 12 years old         |");
            System.out.println("|  Student       | must show student card     |");
            System.out.println("***********************************************");
            input.nextLine();
            System.out.print("Please enter your category : ");
            String category = input.nextLine();
            while(!category.equalsIgnoreCase("Adult") && !category.equalsIgnoreCase("Child") && 
                !category.equalsIgnoreCase("Senior") && !category.equalsIgnoreCase("Student")){
                System.out.println("Please enter only [Adult] [Child] [Senior] [Student].");
                System.out.print("Please enter your category : ");
                category = input.nextLine();
            }
            //user choose bus 3100
            if(bus == 3100){
                //display seat(Yan Jie)
                if (seatTotal >= inputQty){
                    seatTotal -= inputQty;
                    while (count < inputQty){
                        for (int i = 0; i < 10; i++){
                            System.out.print("  __    __     __    __  " + '\n');
                            for (int j = 0; j < 4; j++){
                                System.out.print(" |" + seatR3B1[i][j] + "| ");
                                if (j == 1){
                                    System.out.print(" ");
                                }
                            }
                            if (i == 4){
                                System.out.print('\n');
                            }
                        System.out.print('\n');
                        }
                        System.out.println();
                        // Get user input for seat
                        System.out.print("Enter the seat number u would like to book : ");
                        String seat = input.nextLine();
                        // Try to prevent error input 
                        try {
                            seatInt = Integer.parseInt(seat);
                        } catch (NumberFormatException e) {
                            seatInt = 100;
                        }
                        // Prevent invalid input
                            int x = -10000;
                            int y = -10000;

                        // Standardize front and back seat               
                        if (seatInt < 1) {
                            x = -10000;
                            y = -10000;
                        }
                        else if (seatInt < 21) {
                            x = 0;
                            y = 0;
                        }
                        else if (seatInt < 41) {
                            x = 5;
                            y = 0;
                            seatInt -= 20; // seatInt between 1-20
                        }

                        // Calculate array x and y
                        if (seatInt < 21) {
                            int countSeatA = seatInt / 2;
                            int countSeatB = seatInt % 2;
                            if (countSeatB == 0) { // if seat number is EVEN number
                                countSeatA -= 1;
                                y++;
                                if (countSeatA > 4) { // if seat number is MORE than 10
                                    x += countSeatA - 5;
                                    y += 2;
                                }
                                else // if seat number is LESS than 10
                                    x += countSeatA;
                            }
                            else{ // if seat number is ODD number
                                if (countSeatA > 4) { // if seat number is MORE than 10
                                    x += countSeatA - 5;
                                    y += 2;
                                }
                                else // if seat number is LESS than 10
                                    x += countSeatA;
                            }
                        }
                        // Display Output
                        if ((x < 0) && (y < 0)) {
                            System.out.println("Please, input correct seat number." + '\n');
                        }
                        else if (seatR3B1[x][y] != "__") {
                            seatR3B1[x][y] = ("__");
                            System.out.println("Booking success!");
                            count++;
                            seatSelected = Integer.parseInt(seat);
                        }
                        else {
                            System.out.println("Sorry, This seat is booked.");
                        }
                    }
                }
                //make payment
                Customer.makePayment(seatSelected, category);
                int ticketID = Ticket.getNumberOfTicket();
                ticket[ticketID++] = new Ticket("Kepong", "Kepong", "06 30", category, seatSelected);
            }
            //user choose bus 3200
            else if(bus == 3200){
                //display seat(Yan Jie)
                if (seatTotal >= inputQty){
                    seatTotal -= inputQty;
                    while (count < inputQty){
                        for (int i = 0; i < 10; i++){
                            System.out.print("  __    __     __    __  " + '\n');
                            for (int j = 0; j < 4; j++){
                                System.out.print(" |" + seatR3B2[i][j] + "| ");
                                if (j == 1){
                                    System.out.print(" ");
                                }
                            }
                            if (i == 4){
                                System.out.print('\n');
                            }
                        System.out.print('\n');
                        }
                        System.out.println();
                        // Get user input for seat
                        System.out.print("Enter the seat number u would like to book : ");
                        String seat = input.nextLine();
                        // Try to prevent error input 
                        try {
                            seatInt = Integer.parseInt(seat);
                        } catch (NumberFormatException e) {
                            seatInt = 100;
                        }
                        // Prevent invalid input
                            int x = -10000;
                            int y = -10000;

                        // Standardize front and back seat               
                        if (seatInt < 1) {
                            x = -10000;
                            y = -10000;
                        }
                        else if (seatInt < 21) {
                            x = 0;
                            y = 0;
                        }
                        else if (seatInt < 41) {
                            x = 5;
                            y = 0;
                            seatInt -= 20; // seatInt between 1-20
                        }

                        // Calculate array x and y
                        if (seatInt < 21) {
                            int countSeatA = seatInt / 2;
                            int countSeatB = seatInt % 2;
                            if (countSeatB == 0) { // if seat number is EVEN number
                                countSeatA -= 1;
                                y++;
                                if (countSeatA > 4) { // if seat number is MORE than 10
                                    x += countSeatA - 5;
                                    y += 2;
                                }
                                else // if seat number is LESS than 10
                                    x += countSeatA;
                            }
                            else{ // if seat number is ODD number
                                if (countSeatA > 4) { // if seat number is MORE than 10
                                    x += countSeatA - 5;
                                    y += 2;
                                }
                                else // if seat number is LESS than 10
                                    x += countSeatA;
                            }
                        }
                        // Display Output
                        if ((x < 0) && (y < 0)) {
                            System.out.println("Please, input correct seat number." + '\n');
                        }
                        else if (seatR3B2[x][y] != "__") {
                            seatR3B2[x][y] = ("__");
                            System.out.println("Booking success!");
                            count++;
                            seatSelected = Integer.parseInt(seat);
                        }
                        else {
                            System.out.println("Sorry, This seat is booked.");
                        }
                    }
                }
                //make payment
                Customer.makePayment(seatSelected, category);
                int ticketID = Ticket.getNumberOfTicket();
                ticket[ticketID++] = new Ticket("Kepong", "Kepong", "12 00", category, seatSelected);
            }
            //user choose bus 3300
            else{
                //display seat(Yan Jie)
                if (seatTotal >= inputQty){
                    seatTotal -= inputQty;
                    while (count < inputQty){
                        for (int i = 0; i < 10; i++){
                            System.out.print("  __    __     __    __  " + '\n');
                            for (int j = 0; j < 4; j++){
                                System.out.print(" |" + seatR3B3[i][j] + "| ");
                                if (j == 1){
                                    System.out.print(" ");
                                }
                            }
                            if (i == 4){
                                System.out.print('\n');
                            }
                        System.out.print('\n');
                        }
                        System.out.println();
                        // Get user input for seat
                        System.out.print("Enter the seat number u would like to book : ");
                        String seat = input.nextLine();
                        // Try to prevent error input 
                        try {
                            seatInt = Integer.parseInt(seat);
                        } catch (NumberFormatException e) {
                            seatInt = 100;
                        }
                        // Prevent invalid input
                            int x = -10000;
                            int y = -10000;

                        // Standardize front and back seat               
                        if (seatInt < 1) {
                            x = -10000;
                            y = -10000;
                        }
                        else if (seatInt < 21) {
                            x = 0;
                            y = 0;
                        }
                        else if (seatInt < 41) {
                            x = 5;
                            y = 0;
                            seatInt -= 20; // seatInt between 1-20
                        }

                        // Calculate array x and y
                        if (seatInt < 21) {
                            int countSeatA = seatInt / 2;
                            int countSeatB = seatInt % 2;
                            if (countSeatB == 0) { // if seat number is EVEN number
                                countSeatA -= 1;
                                y++;
                                if (countSeatA > 4) { // if seat number is MORE than 10
                                    x += countSeatA - 5;
                                    y += 2;
                                }
                                else // if seat number is LESS than 10
                                    x += countSeatA;
                            }
                            else{ // if seat number is ODD number
                                if (countSeatA > 4) { // if seat number is MORE than 10
                                    x += countSeatA - 5;
                                    y += 2;
                                }
                                else // if seat number is LESS than 10
                                    x += countSeatA;
                            }
                        }
                        // Display Output
                        if ((x < 0) && (y < 0)) {
                            System.out.println("Please, input correct seat number." + '\n');
                        }
                        else if (seatR3B3[x][y] != "__") {
                            seatR3B3[x][y] = ("__");
                            System.out.println("Booking success!");
                            count++;
                            seatSelected = Integer.parseInt(seat);
                        }
                        else {
                            System.out.println("Sorry, This seat is booked.");
                        }
                    }
                }
                //make payment
                Customer.makePayment(seatSelected, category);
                int ticketID = Ticket.getNumberOfTicket();
                ticket[ticketID++] = new Ticket("Kepong", "Kepong", "18 30", category, seatSelected);
            }
        }
    }
    //customer make payment
    public static void makePayment(int seat, String category){
        Scanner input = new Scanner(System.in);
        double payment = 0.0;
        boolean contPay = true;
        System.out.println();
        System.out.println("***********************************");
        System.out.println("**             PAYMENT           **");
        System.out.println("***********************************");
        System.out.printf("Total to pay : RM %.2f\n", Payment.calculateTotal(seat, category));//total amount to pay by customer
        //input validation for payment amount by customer
        do{
            try{
                System.out.print("Payment      : RM ");
                payment = input.nextDouble();
                if(payment < 0 || payment < Payment.calculateTotal(seat, category)){
                    System.out.println("Not enough payment.");
                    contPay = true;
                }
                else
                    contPay = false;
            }
            catch(Exception ex){
                System.out.println("Please enter a valid payment amount.");
                input.nextLine();
            }
        }while(contPay);
        //display change due
        System.out.printf("Change Due   : RM %.2f\n", (payment - Payment.calculateTotal(seat, category)));
        System.out.println("=================================");
        System.out.println("        Payment Successful       ");
        System.out.println("=================================");
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nCategory       : " + category;
    }
}
