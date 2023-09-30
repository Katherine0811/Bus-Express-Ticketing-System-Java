package busticketingsystem;
import java.util.Scanner;

public class BusTicketingSystem {
    //Yan Jie
    static String[][] seatR1B1 = {//seat array for bus 1100
            {"01","02" , "11","12"}, 
            {"03","04" , "13","14"}, 
            {"05","06" , "15","16"},    
            {"07","08" , "17","18"}, 
            {"09","10" , "19","20"}, 

            {"21","22" , "31","32"}, 
            {"23","24" , "33","34"}, 
            {"25","26" , "35","36"},    
            {"27","28" , "37","38"}, 
            {"29","30" , "39","40"}
        };
    static String[][] seatR1B2 = {//seat array for bus 1200
            {"01","02" , "11","12"}, 
            {"03","04" , "13","14"}, 
            {"05","06" , "15","16"},    
            {"07","08" , "17","18"}, 
            {"09","10" , "19","20"}, 

            {"21","22" , "31","32"}, 
            {"23","24" , "33","34"}, 
            {"25","26" , "35","36"},    
            {"27","28" , "37","38"}, 
            {"29","30" , "39","40"}
        };
    static String[][] seatR1B3 = {//seat array for bus 1300
            {"01","02" , "11","12"}, 
            {"03","04" , "13","14"}, 
            {"05","06" , "15","16"},    
            {"07","08" , "17","18"}, 
            {"09","10" , "19","20"}, 

            {"21","22" , "31","32"}, 
            {"23","24" , "33","34"}, 
            {"25","26" , "35","36"},    
            {"27","28" , "37","38"}, 
            {"29","30" , "39","40"}
        };
    static String[][] seatR2B1 = {//seat array for bus 2100
            {"01","02" , "11","12"}, 
            {"03","04" , "13","14"}, 
            {"05","06" , "15","16"},    
            {"07","08" , "17","18"}, 
            {"09","10" , "19","20"}, 

            {"21","22" , "31","32"}, 
            {"23","24" , "33","34"}, 
            {"25","26" , "35","36"},    
            {"27","28" , "37","38"}, 
            {"29","30" , "39","40"}
        };
    static String[][] seatR2B2 = {//seat array for bus 2200
            {"01","02" , "11","12"}, 
            {"03","04" , "13","14"}, 
            {"05","06" , "15","16"},    
            {"07","08" , "17","18"}, 
            {"09","10" , "19","20"}, 

            {"21","22" , "31","32"}, 
            {"23","24" , "33","34"}, 
            {"25","26" , "35","36"},    
            {"27","28" , "37","38"}, 
            {"29","30" , "39","40"}
        };
    static String[][] seatR2B3 = {//seat array for bus 2300
            {"01","02" , "11","12"}, 
            {"03","04" , "13","14"}, 
            {"05","06" , "15","16"},    
            {"07","08" , "17","18"}, 
            {"09","10" , "19","20"}, 

            {"21","22" , "31","32"}, 
            {"23","24" , "33","34"}, 
            {"25","26" , "35","36"},    
            {"27","28" , "37","38"}, 
            {"29","30" , "39","40"}
        };
    static String[][] seatR3B1 = {//seat array for bus 3100
            {"01","02" , "11","12"}, 
            {"03","04" , "13","14"}, 
            {"05","06" , "15","16"},    
            {"07","08" , "17","18"}, 
            {"09","10" , "19","20"}, 

            {"21","22" , "31","32"}, 
            {"23","24" , "33","34"}, 
            {"25","26" , "35","36"},    
            {"27","28" , "37","38"}, 
            {"29","30" , "39","40"}
        };
    static String[][] seatR3B2 = {//seat array for bus 3200
            {"01","02" , "11","12"}, 
            {"03","04" , "13","14"}, 
            {"05","06" , "15","16"},    
            {"07","08" , "17","18"}, 
            {"09","10" , "19","20"}, 

            {"21","22" , "31","32"}, 
            {"23","24" , "33","34"}, 
            {"25","26" , "35","36"},    
            {"27","28" , "37","38"}, 
            {"29","30" , "39","40"}
        };
    static String[][] seatR3B3 = {//seat array for bus 3300
            {"01","02" , "11","12"}, 
            {"03","04" , "13","14"}, 
            {"05","06" , "15","16"},    
            {"07","08" , "17","18"}, 
            {"09","10" , "19","20"}, 

            {"21","22" , "31","32"}, 
            {"23","24" , "33","34"}, 
            {"25","26" , "35","36"},    
            {"27","28" , "37","38"}, 
            {"29","30" , "39","40"}
        };
    //Jia Xuan
    static Bus[] bus = new Bus[9];//array to store bus details
    static Customer[] customer = new Customer[1000];//array to store customer details
    static Driver[] driver = new Driver[1000];//array to store driver details
    static Ticket[] ticket = new Ticket[1000];//array to store ticket details
    //display logo and main menu
    public static void displayMainMenu(){
        System.out.println("***************************************************************************************");
        System.out.println("***************************************************************************************");
        System.out.println("**     ____                    ___              ____                                 **");
        System.out.println("**    |     __.  . .__        |___|       __   |          __  .__   __   __   __     **");
        System.out.println("**    |--  /  .\\ | |  ' |  |  |   \\ |  | |__'  |---  \\_/ |  \\ |  ' /__\\ |__' |__'    **");
        System.out.println("**    |    \\__/| | |    '--|  |___/ \\__/ .__|  |____ / \\ |__/ |    |__. .__| .__|    **");
        System.out.println("**                      .__|                             |                           **");
        System.out.println("**                                                                                   **");
        System.out.println("***************************************************************************************");
        System.out.println("***************************************************************************************\n");
        
        System.out.println("******************************************************");
        System.out.println("******************************************************");
        System.out.println("**                                                  **");
        System.out.println("**    What would you like to do today ?             **");
        System.out.println("**                                                  **");
        System.out.println("**    1. Buy a ticket                               **");
        System.out.println("**    2. View More Details                          **");
        System.out.println("**    3. Registration                               **");
        System.out.println("**    4. Exit                                       **");
        System.out.println("**                                                  **");
        System.out.println("******************************************************");
        System.out.println("******************************************************");
    }
    //display menu 1(Buy a ticket)
    public static void displayMenu1(){
        System.out.println("\n******************************************************");
        System.out.println("******************************************************");
        System.out.println("**                                                  **");
        System.out.println("**    Choose the route you will be taking           **");
        System.out.println("**                                                  **");
        System.out.println("**    1. Setapak Station                            **");
        System.out.println("**    2. KL Sentral Station                         **");
        System.out.println("**    3. Kepong Station                             **");
        System.out.println("**                                                  **");
        System.out.println("******************************************************");
        System.out.println("******************************************************");
    }
    //display menu 2(view more details)
    public static void displayMenu2(){
        System.out.println("\n******************************************************");
        System.out.println("******************************************************");
        System.out.println("**                                                  **");
        System.out.println("**    View More Details                             **");
        System.out.println("**                                                  **");
        System.out.println("**    1. Bus                                        **");
        System.out.println("**    2. Customer                                   **");
        System.out.println("**    3. Driver                                     **");
        System.out.println("**    4. Seat                                       **");
        System.out.println("**    5. Station                                    **");
        System.out.println("**                                                  **");
        System.out.println("******************************************************");
        System.out.println("******************************************************");
    }
    //display menu 3(registration)
    public static void displayMenu3(){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        boolean continueInput = true;
        System.out.println("\n******************************************************");
        System.out.println("******************************************************");
        System.out.println("**                                                  **");
        System.out.println("**    Registration                                  **");
        System.out.println("**                                                  **");
        System.out.println("**    1. New Customer                               **");
        System.out.println("**    2. New Driver                                 **");
        System.out.println("**                                                  **");
        System.out.println("******************************************************");
        System.out.println("******************************************************");
        do{
            try{
                System.out.print("Please select an option : ");
                choice = input.nextInt();
                if(choice != 1 && choice != 2){
                    System.out.println("Please enter [1] or [2]");
                    continueInput = true;
                }
                else
                    continueInput = false;
            }
            catch(Exception ex){
                System.out.println("Please enter [1] or [2]");
                input.nextLine();
            }
        }while(continueInput);
        if(choice == 1)
            Customer.addCustomer(customer);
        else
            Driver.addDriver(driver);
    }
    //print all the customers or drivers details (polymorphism) - Jia Xuan
    public static void printDetails(Object[] x){
        for(int i = 0 ; i < x.length && x[i] != null ; i++){
            System.out.println(x[i].toString() + "\n");
        }
    }  
    //Ying Shan
    //display Thank You Message(before system ends)
    public static void displayThanks(){
        System.out.println("*********************************************************************************************************");
        System.out.println("*********************************************************************************************************");
        System.out.println("**         _       _         **                                                                        **");
        System.out.println("**        (c).---.(c)        **        T  H  A  N  K  .  Y  O  U  .  V  E  R  Y  .  M  U  C  H         **");
        System.out.println("**         / . _ . \\         **                                                                        **");
        System.out.println("**       __\\(  Y  )/__       **     F  O  R  .  T  R  A  N  S  P  O  R  T  I  N  G  .  W  I  T  H      **");
        System.out.println("**      (_.-/ '-' \\-._)      **                                                                        **");
        System.out.println("**         ||  X  ||         **           F  A  I  R  Y  .  B  U  S  .  E  X  P  R  E  S  S            **");
        System.out.println("**       _.'  '-'  '._       **                                                                        **");
        System.out.println("**      ( .-./'-'\\.-. )      ** ---------------------------- BROUGHT TO YOU BY : RSF1S3G2 GROUP 2 ---  **");
        System.out.println("**                           **                                                                        **");
        System.out.println("*********************************************************************************************************");
        System.out.println("*********************************************************************************************************");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char nextCustomer;
        int choice = 0, choice1 = 0;
        boolean continueMainMenu = true, continueMenu2 = true;
        //Arrays for Front Seat and Back Seat(Yan Jie)
        String[][] showFS = {      
            {"01","02" , "11","12"}, 
            {"03","04" , "13","14"}, 
            {"05","06" , "15","16"},    
            {"07","08" , "17","18"}, 
            {"09","10" , "19","20"}, 
            };      
        String[][] showBS = {
            {"21","22" , "31","32"}, 
            {"23","24" , "33","34"}, 
            {"25","26" , "35","36"},    
            {"27","28" , "37","38"}, 
            {"29","30" , "39","40"}
            };  
        //Create customer(Jia Xuan)
        customer[0] = new Customer("Chuah Jia Xuan", "0174124576", 1, "Student");//create 1st customer
        customer[1] = new Customer("Jung Hoseok", "0123456789", 2, "Student");//create 2nd customer
        customer[2] = new Customer("William Lim", "0124834199", 3, "Adult");//create 3rd customer
        //Create driver(Jia Xuan)
        driver[0] = new Driver("Muthu Samy", "01115596358", 1, 2571.00, 6);//create 1st driver
        driver[1] = new Driver("Tan Kwang Ming", "0168596324", 2, 2333.00, 2);//create 2nd driver
        //Create bus(Jia Xuan)
        bus[0] = new Bus(1100, "Transnasional", "BMW1111");         //create 1st bus
        bus[1] = new Bus(1200, "KKKL Express", "PEH9804");          //create 2nd bus
        bus[2] = new Bus(1300, "Plusliner", "WJK0921");             //create 3rd bus
        bus[3] = new Bus(2100, "Star Coach Express", "JKL1234");    //create 4th bus
        bus[4] = new Bus(2200, "Top Liner Express", "AAA6666");     //create 5th bus
        bus[5] = new Bus(2300, "Arwana Express", "ABC5694");        //create 6th bus
        bus[6] = new Bus(3100, "First Coach", "BYE6138");           //create 7th bus
        bus[7] = new Bus(3200, "Aerobus", "PHU3666");               //create 8th bus
        bus[8] = new Bus(3300, "Ekspres Mutiara", "PPP7777");       //create 9th bus
        // Assign object for Front Seat(Yan Jie)    
        FrontSeat front = new FrontSeat();
        front.setseatCategory("Senior", "Adult", "Child", "Student");
        front.setseatPrice(2.00, 8.00, 2.00, 4.00);
        // Assign object for Back Seat(Yan Jie)              
        BackSeat back = new BackSeat();
        back.setseatCategory("Senior", "Adult", "Child", "Student");
        back.setseatPrice(1.00, 4.00, 1.00, 2.00);
        //Create Departure Station(Ying Shan)
        DepartureStation dep1 = new DepartureStation("Setapak", "SE100", "PV15", "0630", "1200", "1830");           //departure station 1
        DepartureStation dep2 = new DepartureStation("KL Sentral", "KL100", "KL Sentral", "0630", "1200", "1830");  //departure station 2
        DepartureStation dep3 = new DepartureStation("Kepong", "KE100", "Kepong", "0630", "1200", "1830");          //departure station 3
        //Create Destination Station(Ying Shan)
        DestinationStation des1 = new DestinationStation();//destination station 1
        des1.setRoute("Setapak");
        des1.setStationID("SE101", "SE102", "SE103", "SE104");
        des1.setStationName("Setapak Central", "Wangsa Maju LRT", "TARUC Main Gate", "Taman Bunga Raya");
        des1.setTime("0645", "1215", "1845", "0700", "1230", "1900", "0715", "1245", "1915", "0730", "1300", "1930");
        
        DestinationStation des2 = new DestinationStation();//destination station 2
        des2.setRoute("KL Sentral");
        des2.setStationID("KL101", "KL102", "KL103", "KL104");
        des2.setStationName("Methodist College", "Mid Valley", "Sunway Lagoon", "IOI Mall");
        des2.setTime("0630", "1230", "1730", "0700", "1300", "1800", "0730", "1330", "1830", "0800", "1400", "1900");
        
        DestinationStation des3 = new DestinationStation();//destination station 3
        des3.setRoute("Kepong");
        des3.setStationID("KE101", "KE102", "KE103", "KE104");
        des3.setStationName("Metro Prima", "Jinjang", "Segambut", "Desa Park City");
        des3.setTime("0650", "1250", "1850", "0710", "1310", "1910", "0730", "1330", "1930", "0750", "1350", "1950");
        
        //Jia Xuan
        do{
            displayMainMenu();
            //input validation for main menu option(choice)
            do{
                try{
                    System.out.print("Please select an option : ");
                    choice = input.nextInt();
                    if(choice != 1 && choice != 2 && choice !=3 && choice !=4){
                        System.out.println("Please enter [1] [2] [3] or [4]");
                        continueMainMenu = true;
                    }
                    else
                        continueMainMenu = false;
                }
                catch(Exception ex){
                    System.out.println("Please enter [1] [2] [3] or [4]");
                    continueMainMenu = true;
                    input.nextLine();
                }
            }while(continueMainMenu);
            //if user choose option 1
            if(choice == 1){
                displayMenu1();
                Customer.purchaseTicket(seatR1B1, seatR1B2, seatR1B3, seatR2B1, seatR2B2, seatR2B3, seatR3B1, seatR3B2, seatR3B3, ticket);
            }
            //if user choose option 2
            else if(choice == 2){
                displayMenu2();
                //input validation for menu 2(choice1)
                do{
                    try{
                        System.out.print("Please select an option : ");
                        choice1 = input.nextInt();
                        if(choice1 != 1 && choice1 != 2 && choice1 !=3 && choice1 !=4 && choice1 != 5){
                            System.out.println("Please enter [1] [2] [3] [4] or [5]");
                            continueMenu2 = true;
                        }
                        else
                            continueMenu2 = false;
                    }
                    catch(Exception ex){
                        System.out.println("Please enter [1] [2] [3] [4] or [5]");
                        continueMenu2 = true;
                        input.nextLine();
                    }
                }while(continueMenu2);
                
                if(choice1 == 1)
                    Bus.printBusDetails(bus);
                else if(choice1 == 2){
                    System.out.println("\nCustomers' Details");
                    System.out.println("==================");
                    printDetails(customer);
                }
                else if(choice1 == 3){
                    System.out.println("\nDrivers' Details");
                    System.out.println("================");
                    printDetails(driver);
                }
                else if(choice1 == 4){
                    // Print out Front Seat Price(Yan Jie)
                    front.display(front.getseatCategory(), front.getseatPrice());
                    // Display Front Seat
                    for (int row = 0; row < 5; row++) {
                        System.out.print(" __  __    __  __  " + '\n');
                        for (int col = 0; col < 4; col++){
                            System.out.print("|" + showFS[row][col] + "|");                       
                            if (col == 1) {
                                System.out.print("  "); 
                            }
                        }
                        if (row == 4) {
                            System.out.print('\n');
                        } 
                    System.out.print('\n');
                    }
                    System.out.println();
                    // Print out Back Seat Price(Yan Jie)
                    back.display(back.getseatCategory(), back.getseatPrice());
                    // Display Back Seat
                    for (int row = 0; row < 5; row++) {
                    System.out.print(" __  __    __  __  " + '\n');
                        for (int col = 0; col < 4; col++){
                            System.out.print("|" + showBS[row][col] + "|");                       
                            if (col == 1) {
                                System.out.print("  "); 
                            }
                        }
                        if (row == 4) {
                            System.out.print('\n');
                        } 
                    System.out.print('\n');
                    }
                }
                else{
                    //Ying Shan
                    System.out.println("\n\t\tDeparture Times");
                    System.out.println("\t\t===============");
                    dep1.showStation(dep1.getRoute(), dep1.getStationID(), dep1.getStationName(), dep1.getTime());
                    dep2.showStation(dep2.getRoute(), dep2.getStationID(), dep2.getStationName(), dep2.getTime());
                    dep3.showStation(dep3.getRoute(), dep3.getStationID(), dep3.getStationName(), dep3.getTime());

                    System.out.println("\n\t\t   Arrival Times");
                    System.out.println("\t\t   =============");
                    des1.showStation(des1.getRoute(), des1.getStationID(), des1.getStationName(), des1.getTime());
                    des2.showStation(des2.getRoute(), des2.getStationID(), des2.getStationName(), des2.getTime());
                    des3.showStation(des3.getRoute(), des3.getStationID(), des3.getStationName(), des3.getTime());
                }
            }
            //if user choose option 3
            else if(choice == 3)
                displayMenu3();
            //if user choose option 4
            else{
                System.out.println();
                displayThanks();
                System.exit(0);
            }
            //next operation?
            System.out.println();
            System.out.println("Back to Main Menu?");
            System.out.print("(Yes[Y] / No[N]): ");
            nextCustomer = input.next().charAt(0);
            //input validation for nextCustomer
            while(nextCustomer != 'y' && nextCustomer != 'Y' && nextCustomer != 'n' && nextCustomer != 'N'){
                System.out.println("Please enter only [y] [Y] [n] [N].");
                System.out.println("\nBack to Main Menu?");
                System.out.print("(Yes[Y] / No[N]): ");
                nextCustomer = input.next().charAt(0);
            }
            System.out.println();
        }while(nextCustomer == 'Y' || nextCustomer == 'y');//if Yes, loop back
        System.out.println();
        displayThanks();
    }
    
}
