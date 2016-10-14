package apaw.pd.calculadoraMementable;

import upm.jbb.IO;

public class ComandoDeshacer extends CommandMemento {

	public ComandoDeshacer(CalculadoraMementable calculator, gestorMementos<MementoCalculadora> gestorMementos) {
		super(calculator, gestorMementos);
	}

	@Override
	public void execute() {
		String key = (String) IO.getIO().select(getgestorMementos().keys());
		MementoCalculadora mementoCalculadora = getgestorMementos().getMemento(key);
		((CalculadoraMementable) getCalculator()).restoreMemento(mementoCalculadora);
	}

	@Override
	public String name() {
		return "RestorePoint";
	}

}
