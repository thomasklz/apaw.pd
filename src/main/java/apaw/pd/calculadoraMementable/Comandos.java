package apaw.pd.calculadoraMementable;

import apaw.pd.calculadora.Calculator;
import apaw.pd.calculadora.Comando;
import upm.jbb.IO;

public abstract class Comandos implements Comando {

	private Calculator calculator;

	public Comandos(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	protected int getvalor() {
		return IO.getIO().readInt();

	}

}
