package programmingCourse;

import java.util.LinkedList;

public class HotelManagement {
static String name;

static LinkedList<Room> roomList = new LinkedList<>();
static LinkedList<Guest> guestList = new LinkedList<Guest>();

public static void addRoom (Room room) {
	roomList.add(room);
	
            }
public static void createRoom (int roomNumber,String name,float pricePerNight,int numberOfBeds) {
	roomList.add(new Room(roomNumber, name,pricePerNight, numberOfBeds ));
        }	
public static void addGuest (Guest guest) {
	guestList.add(guest);
     }	
public static void createGuest (String name,int yearOfBirth,char gender) {
	guestList.add(new Guest( name,yearOfBirth, gender ));
   }	
public static Guest findGuestName(String nameToBesearched) {
int numberOfGuests= HotelManagement.guestList.size();
for (int i =0;i<numberOfGuests;i++) {
	Guest guest=HotelManagement.guestList.get(i);
	if (guest.name.equalsIgnoreCase(nameToBesearched)) {
		System.out.println("the name "+ nameToBesearched +" ist an der Stelle " + i +" in der Liste gefunden" );
		return guest;}
}
			System.out.println("the name \" "+ nameToBesearched+ "\"is not found");	
			return null;
			
	}

}

/* public static boolean isFreeRoomAvailable(){
for {(Room room : rooms)
        } 
	if {(room.guest==null)
return True
     }
}	
return false
*/	

