public class BuddyInfo {



    private String name;
    private String address;
    private long phoneNumber;


    public BuddyInfo() {

        this("Sam","2261 Sandman Crescent", 613577987);


    }

    public BuddyInfo(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }


    public static void main(String[] args) {

        BuddyInfo buddy = new BuddyInfo("Homer","5556 Blooming Dales", 613555667);
        System.out.println("Hello " + buddy.getName());
        System.out.println("Hello world!");
    }
}
