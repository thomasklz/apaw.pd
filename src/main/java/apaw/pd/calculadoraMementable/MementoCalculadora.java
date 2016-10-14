package apaw.pd.calculadoraMementable;

public class MementoCalculadora {

	private int state;

	public MementoCalculadora(int stateToSave) {
		state = stateToSave;
	}

	public int getSavedState() {
		return state;
	}

}
