package apaw.pd.State;

public class StateEsperando extends State {

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
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void iniciar(Conexion conexion) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		throw new UnsupportedOperationException("Acción no permitida... ");
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		if (respuesta==0){
			conexion.setEstado(Estados.PREPARADO);
			conexion.setState(new StatePreparado());
		}else			{
			conexion.setEstado(Estados.CERRADO);
			conexion.setState(new StateCerrado());	
			}
			
		
	}

	@Override
	public Estados getEstado() {
		
		return Estados.ESPERANDO ;
	}

}
