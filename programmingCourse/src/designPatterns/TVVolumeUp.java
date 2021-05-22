package designPatterns;

public class TVVolumeUp implements Command {
	 ElectronicDevice theDevice;
	 public TVVolumeUp(ElectronicDevice newDevice) {
		 theDevice= newDevice;
		 
	 }
		@Override
		public void execute() {
		theDevice.volumeUp();	
		}
		@Override
		public void undo() {
			theDevice.volumeDown();	
			
		}

	}