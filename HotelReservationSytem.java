import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Hotel {
    private String name;
    private Map<String, Boolean> rooms;

    public Hotel(String name) {
        this.name = name;
        rooms = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addRoom(String roomNumber) {
        rooms.put(roomNumber, true);
    }

    public void displayAvailableRooms() {
        System.out.println("Available Rooms in " + name + ":");
        for (String roomNumber : rooms.keySet()) {
            if (rooms.get(roomNumber)) {
                System.out.println("Room Number: " + roomNumber);
            }
        }
    }

    public void bookRoom(String roomNumber) {
        if (rooms.containsKey(roomNumber) && rooms.get(roomNumber)) {
            rooms.put(roomNumber, false);
            System.out.println("Room " + roomNumber + " booked successfully.");
        } else {
            System.out.println("Room " + roomNumber + " is not available.");
        }
    }
}

public class HotelReservationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel("MyHotel");

        // Add some rooms to the hotel
        hotel.addRoom("101");
        hotel.addRoom("102");
        hotel.addRoom("103");
