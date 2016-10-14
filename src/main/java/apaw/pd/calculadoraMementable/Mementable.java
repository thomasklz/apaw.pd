package apaw.pd.calculadoraMementable;

public interface Mementable<T> {

	public T createMenento();

	void restoreMemento(T memento);
}
