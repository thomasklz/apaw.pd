package apaw.pd.calculadoraMementable;

public class Originador implements MomentoCalculadora {

	
	 private String state;

  
	@Override
	public Memento createMemento() {
		System.out.println("Originator: Create to Memento.");
        return new Memento(state);
	}


	@Override
	public void restoreMomento(Memento t) {
		state =  t.getSavedState(); 
        System.out.println("Originator: "+state);
		
	}


	
	
}
