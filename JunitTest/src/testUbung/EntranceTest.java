package testUbung;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class EntranceTest {

	@Test
	public void testMaxArrives() {	
		NameDatabase nameDatabase = mock(NameDatabase.class);
		when(nameDatabase.retrieveLastname("Max")).thenReturn("Mustermann");
		Log log = mock(Log.class);
		
		Entrance entrance = new Entrance(nameDatabase, log);
		entrance.friendArrives("Max");
		verify(log).write("Max Mustermann arrived.");
	}
	
	@Test
	public void testUnknown() {
		NameDatabase nameDatabase = mock(NameDatabase.class);
		when(nameDatabase.retrieveLastname("Max")).thenReturn("Mustermann");
		Log log = mock(Log.class);
		
		Entrance entrance = new Entrance(nameDatabase, log);
		entrance.friendArrives("Tom");
		verifyZeroInteractions(log);
	}

}
