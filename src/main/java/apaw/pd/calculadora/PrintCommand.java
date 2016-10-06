package apaw.pd.calculadora;

import upm.jbb.IO;

public class PrintCommand implements Comando {
	
	private Calculator calculator;

	public PrintCommand(Calculator calculator) {
		this.calculator= calculator;
	}
	
	@Override
	public void execute() {
		IO.getIO().println(calculator.getTotal());
	}

	@Override
	public String name() {
		return "PrintCommmand";
		
	}
}
