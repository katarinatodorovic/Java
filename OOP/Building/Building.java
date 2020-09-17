package building;

public class Building {
    private String address;
    private int numOfFloors;
    private int numOfApartments;
    private String[] ownersLastNames;

    public Building(String address, int numOfFloors, int numOfApartments, String[] ownersLastNames) {
        this.address = address;
        this.numOfFloors = numOfFloors;
        this.numOfApartments = numOfApartments;
        this.ownersLastNames = ownersLastNames;
        if (ownersLastNames.length > numOfApartments) {
            System.out.println("You entered more number than expected.");
        }
        if (ownersLastNames.length == 0) {
            System.out.println("Your building is empty.");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    public int getNumOfApartments() {
        return numOfApartments;
    }

    public void setNumOfApartments(int numOfApartments) {
        this.numOfApartments = numOfApartments;
    }

    public String[] getOwnersLastNames() {
        return ownersLastNames;
    }

    public void setOwnersLastNames(String[] ownersLastNames) {
        this.ownersLastNames = ownersLastNames;

        if (ownersLastNames.length > numOfApartments) {
            System.out.println("You entered more number than expected.");
        }
        if (ownersLastNames.length == 0) {
            System.out.println("Your building is empty.");
        }

        for (int i = 0; i < ownersLastNames.length; i++) {
            ownersLastNames[i] = ownersLastNames[i];
        }
    }

}
