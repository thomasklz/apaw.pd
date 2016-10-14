package apaw.pd.calculadoraMementable;

import apaw.pd.calculadora.Calculator;

public class CalculadoraMementable extends Calculator implements Mementable<MementoCalculadora> {

	@Override
	public MementoCalculadora createMenento() {
		return new MementoCalculadora(getTotal());
	}

	@Override
	public void restoreMemento(MementoCalculadora memento) {
		setTotal(memento.getSavedState());
	}

}
