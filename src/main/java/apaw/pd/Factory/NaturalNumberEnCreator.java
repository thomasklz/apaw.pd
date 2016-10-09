package apaw.pd.Factory;

public class NaturalNumberEnCreator extends NaturalNumberCreator {

	@Override
	public NaturalNumber creatorNaturalNumber(int value) {
		return new NaturalNumberEn(value);
	}

}
