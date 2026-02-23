import java.util.Scanner;
import java.util.ArrayList;
class Party{
    private String partyname;
    private String location;
    private String date;
    public Party(String partyName, String location, String date){ 
        this.partyname = partyName;
        this.location = location;
        this.date = date;
    }
    public String getPartyName(){
        return this.partyname;
    }
    public void setPartyName(String partyName){
        this.partyname = partyName;
    }
    public String getLocation(){
        return this.location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getDate(){
        return this.date;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String toString(){
        return "Name : "+ this.partyname + "\nLocation : "+ this.location + "\nDate :" + this.date ;
    }
}
class BirthdayParty extends Party{
    private String birthdayPerson;
    private int age;
    private double cakeBudget;
    public BirthdayParty(String birthdayPerson, String location, String date, String name, int age, double cakeBudget){
        super(name, location, date);
        this.birthdayPerson = birthdayPerson;
        this.age = age;
        this.cakeBudget = cakeBudget;
    }
    public double calculateTotalCost(){
        return cakeBudget + 5000;
    }
    @Override
    public String toString(){
        return super.toString() + "\nType : Birthday Party" + "\nBirthday Person : " + this.birthdayPerson + "\nAge : " + this.age + "\nTotal Cost : " + calculateTotalCost();
    }
}
class WeddingParty extends Party{
    private int guestCount;
    private double costPerGuest;
    private double hallCharge;
    public WeddingParty(String partyname, String location, String date, int guestCount,double costPerGuest, double hallCharge){
        super(partyname, location, date);
        this.guestCount = guestCount;
        this.costPerGuest = costPerGuest;
        this.hallCharge = hallCharge;
    }
    public double calculateTotalCost(){
        return (guestCount*costPerGuest) + hallCharge;
    }
    @Override
    public String toString(){
        return super.toString() + "\nType : Wedding Party" + "\nGuest Count : " + this.guestCount + "\n Cost Per Guest : " + this.costPerGuest + "\nHall Charge : " + this.hallCharge + calculateTotalCost();
    }
}
class CristmasParty extends Party{
    private int guestCount;
    private double giftCost;
    public CristmasParty(String partyName,String location,String date,int guestCount,double giftCost){
        super(partyName,location,date);
        this.guestCount = guestCount;
        this.giftCost = giftCost;
    }
    @Override
    public String toString(){
        return super.toString() + "\nGuest Count :" + this.guestCount + "\nGift Cost :" + this.giftCost;
    }
}
public class Project{
    public static void main(String[] args){
        ArrayList <Party> parties = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int choice;
        int type;
        while (true){
            System.out.println( "\n*** Party Management System ***");
            System.out.println("1.Add Party");
            System.out.println("2.Display All Parties");
            System.out.println("3.Search by PartyName");
            System.out.println("4.Exit");
            System.out.println("\nEnter choice : ");
            choice = s.nextInt();
            String partyname;
            String location;
            String date;
            String personname;
            int age;
            double budget;
            int count;
            double cost;
            double charge;
            boolean found = false;
            String search;
            if (choice == 1){
                System.out.println("1=Birthday Party, 2=Wedding Party, 3=Cristmas Party: ");
                type = s.nextInt();
                s.nextLine();
                System.out.println("Enter Party Name : ");
                partyname = s.nextLine();
                System.out.println("Enter Location : ");
                location = s.nextLine();
                System.out.println("Enter Date (YYYY-MM-DD) : ");
                date = s.nextLine();
                if (type == 1){
                    System.out.println("Enter Birthday Person : ");
                    personname = s.nextLine();
                    System.out.println("Enter Age : ");
                    age = s.nextInt();
                    System.out.print("Enter Cake Budget : ");
                    budget = s.nextDouble();

                    parties.add(new BirthdayParty(partyname,location,date,personname,age,budget));
                }else if (type ==2){
                    System.out.println("Enter guest Count : ");
                    count = s.nextInt();
                    System.out.println("Cost Per Guest : ");
                    cost = s.nextDouble();
                    System.out.println("Enter Hall Charge : ");
                    charge = s.nextDouble();

                    parties.add(new WeddingParty(partyname,location,date,count, cost, charge));
                }else if (type ==3){
                    System.out.println("Enter the Guest Count :");
                    count = s.nextInt();
                    System.out.println("Enter the Total Gift Cost :");
                    cost = s.nextDouble();

                    parties.add(new CristmasParty(partyname, location, date, count, cost));
                }
                System.out.println("Party added successfully");

            }else if (choice == 2){
                System.out.println(" *** All Parties ***");
                for (Party p : parties){
                    System.out.println(p);
                    System.out.println("****************");
                }
            }else if (choice == 3){
                System.out.println("Enter Party Name to Search : ");
                s.nextLine();
                search = s.nextLine();
                for (Party p: parties){
                    if(p.getPartyName().equalsIgnoreCase(search)){
                        System.out.println("\nParty Found!");
                        System.out.println(p);
                        found = true;
                    }
                }
                if(!found){
                    System.out.println("\nParty not found.");
                }
            }else if(choice == 4){
                break;
            }
        }
        s.close();
    }
}
