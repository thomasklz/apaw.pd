package apaw.pd.Composite;

public class Resta extends ExpresionesComposite {
	
	public Resta(ExpresionComponente Expresion1, ExpresionComponente Expresion2) {
		super(Expresion1, Expresion2);
	}

	@Override
	public int operar() {
		return getExpresion1().operar() - getExpresion2().operar();

	}

	@Override
	public String operacion() {
		return "-";
	}

}
