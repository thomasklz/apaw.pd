package apaw.pd.calculadoraMementable;

import apaw.pd.calculadora.AddCommand;
import apaw.pd.calculadora.CommandManager;
import apaw.pd.calculadora.PrintCommand;
import apaw.pd.calculadora.ResetCommand;
import apaw.pd.calculadora.SubtractCommand;
import upm.jbb.IO;

public class MainCalculator {
	private CommandManager commandManager;

	public MainCalculator() {

		CalculadoraMementable calculadoraMemento = new CalculadoraMementable();
		gestorMementos<MementoCalculadora> gestormemento = new gestorMementos<MementoCalculadora>();
		this.commandManager = new CommandManager();
		this.commandManager.add(new AddCommand(calculadoraMemento));
		this.commandManager.add(new SubtractCommand(calculadoraMemento));
		this.commandManager.add(new ResetCommand(calculadoraMemento));
		this.commandManager.add(new PrintCommand(calculadoraMemento));
		this.commandManager.add(new ComandoDeshacer(calculadoraMemento, gestormemento));
		this.commandManager.add(new ComandoGuardar(calculadoraMemento, gestormemento));
	}

	public void execute() {
		String key = (String) IO.getIO().select(this.commandManager.keys());
		this.commandManager.execute(key);
	}

	public static void main(String[] args) {
		IO.getIO().addView(new MainCalculator());
	}
}
