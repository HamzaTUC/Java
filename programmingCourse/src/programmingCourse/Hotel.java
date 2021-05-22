package programmingCourse;

import java.util.LinkedList;

public class Hotel {

	public static void main(String[] args) {
		System.out.println("Welcome im Hotel");
		
			
		Room firstRoom = new Room(1, "Piratentzimmer", 120.0f, 6);
		Room secondRoom = new Room(2, "Bauerzimmer", 80.0f, 4);
		Room thirdRoom = new Room();
		thirdRoom.name = "presidetensuite";
		thirdRoom.roomNumber = 3;
		thirdRoom.pricePerNight = 140.0f;
		thirdRoom.numberOfBeds = 10;
		Guest guestOne = new Guest("Hamza", 90, 'M');
		Guest guest2 = new Guest("Mohamed", 89, 'M');
		guest2.printGuest();
		Guest guest3 = new Guest("Annika", 20, 'F');
		Guest guest4 = new Guest("annika", 20, 'F');
		Room[] roomArray = new Room[10];
		roomArray[0] = new Room();
		Room fifthRoom = new Room();
		fifthRoom.name = "Hot-Stone Raum";
		fifthRoom.numberOfBeds = 0;
		fifthRoom.roomNumber = 5;
		roomArray[1] = fifthRoom;
		Room sixthRoom = new Room(6, "Yoga Raum", 0, 0);
		roomArray[3] = sixthRoom;
		System.out.println(roomArray[1].name);
		System.out.println(roomArray.length - 1);
		HotelManagement.addRoom(firstRoom);
		HotelManagement.addRoom(secondRoom);
		HotelManagement.addRoom(thirdRoom);
		HotelManagement.addGuest(guestOne);
		HotelManagement.addGuest(guest2);
		HotelManagement.addGuest(guest3);
		HotelManagement.addGuest(guest4);
		HotelManagement.findGuestName("Mohamed");
		HotelManagement.findGuestName("annika");
		
	    HotelManagement.createRoom(4, "mein Zimmer", 200.0f, 2);
		HotelManagement.roomList.get(3).printRoom();
	System.out.println("Bis jetzt enthält diese Liste \u00BD "+ HotelManagement.roomList.size()+ " EEinträge für Hotelräume.");
	HotelManagement.createGuest("Müller", 1967, 'm');
	Guest firstGuest= HotelManagement.guestList.get(0);
	HotelManagement.roomList.get(1).checkIn(firstGuest);
	System.out.println("Wer ist im SecondRaum ?.");
	secondRoom.guest.printGuest();
	System.out.println(HotelManagement.roomList.get(0).name);
	System.out.println(HotelManagement.roomList.get(1).pricePerNight);
	System.out.println(HotelManagement.roomList.get(2).numberOfBeds);
	HotelManagement.roomList.remove(1);
	System.out.println(HotelManagement.roomList.get(2).roomNumber);
	System.err.println("errrrrrrrrrrrrorrrrrrrrrr");
	}
	
}


