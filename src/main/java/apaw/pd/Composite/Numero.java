package apaw.pd.Composite;

public class Numero implements ExpresionComponente {

	private int numero;

	public Numero(int numero) {
		this.numero = numero;
	}

	@Override
	public int operar() {
		
		return 0;
	}

}
