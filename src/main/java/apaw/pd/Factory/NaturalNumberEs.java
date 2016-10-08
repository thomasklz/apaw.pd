package apaw.pd.Factory;

public class NaturalNumberEs extends NaturalNumber {

	private static final String[] textValue = { "cero", "uno", "dos", "tres", "cuatro", "cinco" };

	public NaturalNumberEs(int value) {
		super(value);

	}

	@Override
	public String[] textValue() {

		return textValue;
	}

}
