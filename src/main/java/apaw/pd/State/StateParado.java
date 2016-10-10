package apaw.pd.State;

public class StateParado extends State {

	@Override
	public void abrir(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void cerrar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void parar(Conexion conexion) {
		
	}

	@Override
	public void iniciar(Conexion conexion) {
		conexion.setEstado(Estados.PREPARADO);
		conexion.setState(new StatePreparado());
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public Estados getEstado() {
		return Estados.PARADO ;
	}

}
