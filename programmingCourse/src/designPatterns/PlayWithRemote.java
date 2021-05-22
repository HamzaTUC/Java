package designPatterns;

import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote {

	public static void main(String[] args) {
		ElectronicDevice newDevice = TVRemote.getDevice();
		//---------------------TURN TV ON----------------------------
		TurnTVON onCommand = new TurnTVON (newDevice);
        DeviceButton onPressed = new DeviceButton(onCommand);
	    onPressed.press();
 //---------------------TURN TV OFF----------------------------
       TurnTVOff offCommand = new TurnTVOff (newDevice);
        onPressed = new DeviceButton(offCommand);
	    onPressed.press();	
	    //----------------TV Volume UP-----------------------------
	       TVVolumeUp volUpCommand = new TVVolumeUp (newDevice);
	        onPressed = new DeviceButton(volUpCommand);
		  System.out.println("increase vol");
	        onPressed.press();	
		    onPressed.press();	
		    onPressed.press();	
		    onPressed.press();	
		    //-------------TV Volume DOWN----------------------------------
		    TVVolumeDown volDownCommand = new TVVolumeDown (newDevice);
	        onPressed = new DeviceButton(volDownCommand);
	        System.out.println("increase vol");
	        onPressed.press();	
		    onPressed.press();	
		    onPressed.press();	
		    onPressed.press();
		    
		  //-------TURN ALL DEVICES (TV & Radio) OFF -----------------------------
          Television theTV = new Television();
          Radio theRadio= new Radio();
          List <ElectronicDevice> allDevices= new ArrayList<ElectronicDevice>(); 
          allDevices.add(theRadio);
          allDevices.add(theTV);
          TurnItAllOff turnOffDevices =new TurnItAllOff(allDevices);
          DeviceButton turnThemOff= new DeviceButton(turnOffDevices);
          turnThemOff.press();
        //-------------------Undo Method ----------------------------
          turnThemOff.pressUndo();
}
	
}