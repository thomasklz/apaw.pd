package apaw.pd.calculadora;

import upm.jbb.IO;

public class SubtractCommand implements Comando {
	
	private Calculator calculator;

	public SubtractCommand(Calculator calculator) {
		this.calculator= calculator;
	}
	
	@Override
	public void execute() {
		this.calculator.subtract(IO.getIO().readInt());
	}

	@Override
	public String name() {
		return "SubtractCommmand";
		
	}

}
