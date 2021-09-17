import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddyCollection;

    public AddressBook(){
        this.buddyCollection = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){

        this.buddyCollection.add(buddy);

    }

    public void removeBuddy(BuddyInfo buddyInfo){
        this.buddyCollection.remove(buddyInfo);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }





}
