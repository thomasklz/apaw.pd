package apaw.pd.calculadora;

import upm.jbb.IO;

public class AddCommand implements Comando {

   
	private Calculator calculator;
	
	public  AddCommand(Calculator calculator) {
		this.calculator= calculator;
	}
	
	@Override
	public void execute() {
		this.calculator.add(IO.getIO().readInt());
	}

	@Override
	public String name() {
		return "AñadirCommmand";
		
	}

}
