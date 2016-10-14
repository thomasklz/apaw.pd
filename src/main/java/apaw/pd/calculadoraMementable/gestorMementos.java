package apaw.pd.calculadoraMementable;

import java.util.HashMap;
import java.util.Map;

public class gestorMementos<T> {

	private int valor;
	private Map<String, T> map;

	public gestorMementos() {
		map = new HashMap<String, T>();
	}

	public void addMemento(String key, T memento) {
		map.put(valor + ":" + key, memento);
		valor++;
	}

	public T getMemento(String key) {
		return map.get(key);
	}

	public String[] keys() {
		return map.keySet().toArray(new String[map.size()]);
	}

}
