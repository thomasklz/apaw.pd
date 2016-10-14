package apaw.pd.calculadoraMementable;

import upm.jbb.IO;

public class ComandoGuardar extends CommandMemento {

	public ComandoGuardar(CalculadoraMementable calculator, gestorMementos<MementoCalculadora> getormementos) {
		super(calculator, getormementos);
	}

	@Override
	public void execute() {

		MementoCalculadora mementoCalculadora = ((CalculadoraMementable) getCalculator()).createMenento();
		String key = IO.getIO().readString("Guardar como:");
		getgestorMementos().addMemento(key, mementoCalculadora);
	}

	@Override
	public String name() {
		return "Save Command";
	}

}
