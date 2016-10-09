package apaw.pd.TexSingletonCompositeFlyweight;

public class Caracter implements TextComponent{

	
	
	@Override
	public String imprimir(boolean mayuscula) {
		if (mayuscula){
			
			return String.valueOf(Character.toUpperCase(caracter));
		}
		
	}

	@Override
	public void añadir(TextComponent textComponent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar() {
		// TODO Auto-generated method stub
		
	}
	

}
