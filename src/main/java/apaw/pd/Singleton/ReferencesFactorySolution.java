package apaw.pd.Singleton;

import java.util.HashMap;
import java.util.Map;

public class ReferencesFactorySolution {

	private static ReferencesFactorySolution FactorySolution;
	private Map<String, Integer> references;
	private int reference;

	private ReferencesFactorySolution() {
		this.references = new HashMap<>();
		this.reference = 0;
	}

	public static ReferencesFactorySolution getFactory() {
		if (FactorySolution == null) {
			FactorySolution = new ReferencesFactorySolution();
		}
		return FactorySolution;
	}

	public int getReference(String key) {
		Integer result = this.references.get(key);
		if (result == null) {
			this.references.put(key, this.reference);
			result = this.reference;
			reference++;
		}
		return result;
	}

	public void removeReference(String key) {
		this.references.remove(key);
	}

}
