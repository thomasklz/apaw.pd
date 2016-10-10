package apaw.pd.State;

public class StatePreparado extends State{

	@Override
	public void abrir(Conexion conexion) {
		
	}

	@Override
	public void cerrar(Conexion conexion) {
		conexion.setEstado(Estados.CERRADO);
		conexion.setState(new StateCerrado());
	}

	@Override
	public void parar(Conexion conexion) {
		conexion.setEstado(Estados.PARADO);
		conexion.setState(new StateParado());
	}

	@Override
	public void iniciar(Conexion conexion) {
		
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		conexion.getLink().enviar(msg);
		conexion.setEstado(Estados.ESPERANDO);
		conexion.setState(new StateEsperando());
		
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public Estados getEstado() {
		return Estados.PREPARADO;
	}

}
