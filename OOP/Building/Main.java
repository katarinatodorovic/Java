package building;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Building building = new Building("29 Acacia Road", 2, 4, new String[4]);
        Building building2 = new Building(" 345 Cave Stone Road", 1, 4,
                new String[]{"Flinstones", "Rubbles", " Rockhead", "Gruesomes"});

        building.setNumOfApartments(3);
        System.out.println(building.getNumOfApartments());
        System.out.println(building.getAddress());
        building2.setAddress("10 Rodeo Drive");
        System.out.println(building2.getAddress());
        building2.setNumOfFloors(2);
        System.out.println(building2.getNumOfFloors());
        System.out.println(Arrays.toString(building2.getOwnersLastNames()));
        building.setNumOfApartments(3);
        System.out.println(building.getNumOfApartments());
        building.setOwnersLastNames(new String[]{"Blight", "Gloom", "Appleman"});
        System.out.println(Arrays.toString(building.getOwnersLastNames()));


    }
}
