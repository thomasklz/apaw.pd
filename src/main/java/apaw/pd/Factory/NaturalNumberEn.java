package apaw.pd.Factory;

public class NaturalNumberEn  extends NaturalNumber{
	
	private static final String[] textValue = { "Zero", "one", "two", "three", "four", "five" };

	public NaturalNumberEn(int value) {
		super(value);

	}

	@Override
	public String[] textValue() {

		return textValue;
	}

}
