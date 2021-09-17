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

        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 613);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
        System.out.println("Address Book");
    }





}
