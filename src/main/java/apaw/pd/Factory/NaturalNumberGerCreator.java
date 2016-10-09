package apaw.pd.Factory;

public class NaturalNumberGerCreator extends NaturalNumberCreator {

	@Override
	public NaturalNumber creatorNaturalNumber(int value) {
		return new NaturalNumberGer(value);
	}
	

}
