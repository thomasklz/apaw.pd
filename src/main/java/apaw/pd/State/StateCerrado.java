package apaw.pd.State;

public class StateCerrado  extends State{

	@Override
	public void abrir(Conexion conexion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cerrar(Conexion conexion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parar(Conexion conexion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciar(Conexion conexion) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enviar(Conexion conexion, String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recibir(Conexion conexion, int respuesta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Estados getEstado() {
		return Estados.CERRADO;
	}

	
}
