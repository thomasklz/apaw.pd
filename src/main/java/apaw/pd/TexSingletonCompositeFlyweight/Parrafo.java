package apaw.pd.TexSingletonCompositeFlyweight;

public class Parrafo extends TextCompuesto {

	String Parrafos= "";

	@Override
	public String imprimir(boolean mayuscula) {
		String parrafoSting;
		if (mayuscula) {
			parrafoSting = this.Parrafos.toUpperCase();
		} else {
			parrafoSting = Parrafos;
		}
		return parrafoSting + "\n";
	}

	@Override
	public void añadir(TextComponent textComponent) {
		if (!textComponent.isComposite()) {
			this.Parrafos = this.Parrafos + textComponent.imprimir(false);
		} else {

			throw new UnsupportedOperationException();
		}

	}

	@Override
	public void borrar(TextComponent textComponent) {
		if (!textComponent.isComposite()) {
			textComponent.borrar(textComponent);
		} else {
			throw new UnsupportedOperationException();
		}

	}

	@Override
	public boolean isComposite() {
		return true;
	}

}
