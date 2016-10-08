package apaw.pd.Factory;

public class NaturalNumberEsCreator extends NaturalNumberCreator {

	@Override
	public NaturalNumber creatorNaturalNumber(int value) {
		return new NaturalNumberEs(value);
	}
	
	

}
