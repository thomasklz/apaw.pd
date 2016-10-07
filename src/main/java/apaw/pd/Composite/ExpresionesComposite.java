package apaw.pd.Composite;

public abstract class ExpresionesComposite extends ExpresionComponente {

	
	protected ExpresionComponente Expresion1;
	protected ExpresionComponente Expresion2;

	public ExpresionesComposite(ExpresionComponente Expresion1, ExpresionComponente Expresion2) {
		this.Expresion1 = Expresion1;
		this.Expresion2 = Expresion2;
	}
	
	public ExpresionComponente getExpresion1() {
		return Expresion1;
	}
	
	public ExpresionComponente getExpresion2() {
		return Expresion2;
	}
	
	@Override
    public String toString() {
        return "(" + Expresion1 + operacion() + Expresion2 + ")";
    }
	
	 public abstract String operacion() ;
   
}
