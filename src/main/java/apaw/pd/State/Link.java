package apaw.pd.State;

public interface Link {
	static final int ACK=0;
	
	void enviar(String msg);
	void recibir(int respuesta);
	
}
