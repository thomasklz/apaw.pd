package apaw.pd.TexSingletonCompositeFlyweight;

public class Text  extends TextCompuesto{

	String Textos;
	
	@Override
	public String imprimir(boolean mayuscula) {
		String textosSting;
		if (mayuscula){
			textosSting= this.Textos.toUpperCase();
		}else{
			 textosSting=this.Textos;
			}
			return textosSting +"---o---\n";
			
	}

	@Override
	public void añadir(TextComponent textComponent) {
		if(textComponent.isComposite()){
			this.Textos=this.Textos+textComponent.imprimir(false);
		}else{
			
			throw new UnsupportedOperationException();
		}
		
	}

	@Override
	public void borrar(TextComponent textComponent) {
		
		if(textComponent.isComposite()){
			textComponent.borrar(textComponent);
		}else{
			throw new UnsupportedOperationException();
		}
		
	}

	
	public boolean isComposite() {
		return true;
	}

}
