package apaw.pd.Factory;

public class NaturalNumberGer extends NaturalNumber {
	
	private static final String[] textValue = { "null", "eins", "zwei", "drei", "vier", "fünf" };

	public NaturalNumberGer(int value) {
		super(value);

	}

	@Override
	public String[] textValue() {
		return textValue;
	}

}
