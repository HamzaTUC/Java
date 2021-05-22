package modell;

import view.ObserverIF;

public interface ObservableIF {
	

		public void addObserver(ObserverIF observer);
		
		
		public void removeObserver(ObserverIF observer);
		
		
		public void notifyObserver();

}
