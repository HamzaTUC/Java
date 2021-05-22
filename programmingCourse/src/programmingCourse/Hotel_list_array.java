package programmingCourse;

import java.util.LinkedList;

public class Hotel_list_array {

	public static void main(String[] args) {
        
		System.out.println("Welcome im Hotel");

		LinkedList<SpecialRoom> spaRoomList = new LinkedList<>();
		System.out.println("Bis jetzt enthält diese Liste "+ spaRoomList.size()+ " einträge für SPA Räume.");
		spaRoomList.add(new SpecialRoom());
		SpecialRoom hotStoneSpaRoom = new SpecialRoom();
		hotStoneSpaRoom.name= "Hot-Stone Room ";
		hotStoneSpaRoom.roomNumber= 120;
		spaRoomList.add(hotStoneSpaRoom);
		SpecialRoom saunaScandi= new SpecialRoom(121, "scandinavia sauna", 14);
		spaRoomList.add(saunaScandi);
		for (int count = 0; count <spaRoomList.size();count ++) {
			SpecialRoom spaRoom = spaRoomList.get(count);
			spaRoom.printSpecialRoom();			
		}
		SpecialRoom[] spaRoomArray= new SpecialRoom [3];
		spaRoomArray[0]= new SpecialRoom();
		System.out.println("Bis jetzt enthält dieses Array  "+ spaRoomArray.length + " einträge für SPA Räume.");
		spaRoomArray[1]= hotStoneSpaRoom;
	    spaRoomArray[2]=saunaScandi;
	    for (int i = 0; i <spaRoomArray.length;i ++) {
	    	if (spaRoomArray[i] != null) 
	    	spaRoomArray[i].printSpecialRoom();
	    	
	    }
	    for (SpecialRoom room :spaRoomArray) {
	    	room.printSpecialRoom();
	}
	    for (Guest guest :HotelManagement.guestList) {
	    	if (guest.formerGuest ==true );
	    	guest.printGuest();
	    		
	    }
}
}