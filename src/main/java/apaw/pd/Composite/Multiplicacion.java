package apaw.pd.Composite;

public class Multiplicacion extends ExpresionesComposite {

	public Multiplicacion(ExpresionComponente Expresion1, ExpresionComponente Expresion2) {
		super(Expresion1, Expresion2);
	}

	@Override
	public int operar() {
		return getExpresion1().operar() * getExpresion2().operar();

	}

	@Override
	public String operacion() {
		return "*";
	}
}
