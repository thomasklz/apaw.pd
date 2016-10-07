package apaw.pd.Composite;

public class Division  extends ExpresionesComposite{

	public Division(ExpresionComponente Expresion1, ExpresionComponente Expresion2) {
		super(Expresion1, Expresion2);
	}

	@Override
	public int operar() {
		return getExpresion1().operar() / getExpresion2().operar();

	}

	@Override
	public String operacion() {
		return "/";
	}
	
}
