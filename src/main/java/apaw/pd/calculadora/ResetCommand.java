package apaw.pd.calculadora;

public class ResetCommand implements Comando {

	private Calculator calculator;

	public ResetCommand(Calculator calculator) {
		this.calculator = calculator;
	}

	@Override
	public void execute() {
		this.calculator.reset();
		;
	}

	@Override
	public String name() {
		return "ResetCommmand";

	}
}
