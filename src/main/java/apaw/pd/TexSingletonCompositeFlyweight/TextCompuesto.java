package apaw.pd.TexSingletonCompositeFlyweight;

public abstract class TextCompuesto implements TextComponent {

	@Override
	public abstract String imprimir(boolean mayuscula);

	@Override
	public abstract void añadir(TextComponent textComponent) ;

	@Override
	public  abstract void borrar(TextComponent textComponent) ;
	
	@Override
	public  abstract boolean isComposite();

}
