package apaw.pd.TexSingletonCompositeFlyweight;

public class Caracter implements TextComponent{

	private char caracter;
	public  Caracter(char caracter) {
		this.caracter=caracter;
	}
	 
	@Override
	public String imprimir(boolean mayuscula) {
		if (mayuscula){
			return String.valueOf(Character.toUpperCase(caracter));
		}
		return String.valueOf(caracter);
	}

	@Override
	public void añadir(TextComponent textComponent) {
				
	}

	@Override
	public void borrar(TextComponent textComponent) {
			
	}

	@Override
	public boolean isComposite() {
	return false;
		
	}
	

}
