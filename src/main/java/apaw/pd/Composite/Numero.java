package apaw.pd.Composite;

public class Numero extends ExpresionComponente {

	private int numero;

	public Numero(int numero) {
		super();
		this.numero = numero;
	}

	@Override
	public int operar() {
		
		return numero;
	}
	
	@Override
    public String toString() {
        return String.valueOf(numero);
    }

}
