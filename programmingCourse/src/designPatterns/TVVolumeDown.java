package designPatterns;

public class TVVolumeDown implements Command {
	 ElectronicDevice theDevice;
	 public TVVolumeDown(ElectronicDevice newDevice) {
		 theDevice= newDevice;
		 
	 }
		@Override
		public void execute() {
		theDevice.volumeDown();	
		}
		public void undo() {
			theDevice.volumeUp();	
			
		}

	}