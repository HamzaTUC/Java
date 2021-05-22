package testUbung;

import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

import java.util.Collection;

import org.junit.Test;

public class RettungsLeitstelleTest {
	
	@Test
	public void testeNichts() {
		
		// Objekt von Klasse "Rettungswagen" instanziieren
		Rettungswagen rettungswagen = Rettungswagen.stationiertAn("Parkplatz");
		// Objekt von Klasse "Unfall" instanziieren
		Unfall unfall = Unfall.an("Unfallort");
		
		// Interface "Garage" benutzen
		Garage garage = null;
		Collection<Rettungswagen> fuhrpark = garage.gibVerfuegbareFahrzeuge();
		garage.entsende(rettungswagen, unfall);
		// Interface "Navigation" benutzen
		Navigation navigation = null;
		navigation.berechneFahrzeit(rettungswagen, unfall);
		
		fail("Das ist nur Beispielcode und sollte nicht als Test ausgeführt werden");
	}

}
