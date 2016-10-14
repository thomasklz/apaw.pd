package apaw.pd.calculadoraMementable;

public abstract class CommandMemento extends Comandos {

	private gestorMementos<MementoCalculadora> getormementos;

	public CommandMemento(CalculadoraMementable calculator, gestorMementos<MementoCalculadora> getormementos) {
		super(calculator);
		this.getormementos = getormementos;
	}
	
	public gestorMementos<MementoCalculadora> getgestorMementos(){
		return getormementos;
	}

}
