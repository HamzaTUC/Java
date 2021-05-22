package designPatterns;

public class DeviceButton {
Command theCommand;
DeviceButton(Command newCommand) {
theCommand=newCommand;
}	
public void press() {
	theCommand.execute();
}
public void pressUndo() {
	theCommand.undo();
}
}
