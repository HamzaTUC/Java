package testUbung;

class Entrance {
	
	private NameDatabase nameDatabase;
	private Log log;

	Entrance(NameDatabase nameDatabase, Log log) {
		this.nameDatabase = nameDatabase;
		this.log = log;
	}
	
	void friendArrives(String givenName) {
		String lastName = nameDatabase.retrieveLastname(givenName);
		if (lastName != null) {
			log.write(givenName + " " + lastName + " arrived.");			
		}
	}

}
