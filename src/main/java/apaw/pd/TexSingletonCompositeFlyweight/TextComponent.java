package apaw.pd.TexSingletonCompositeFlyweight;

public interface TextComponent {
	
  public abstract String imprimir(boolean mayuscula);
  public abstract void añadir(TextComponent textComponent);
  public abstract void borrar();
 
  
  
  
  
}
