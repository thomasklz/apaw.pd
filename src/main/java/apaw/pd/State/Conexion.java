package apaw.pd.State;

public class Conexion {

	private Estados estado;
	private State state;
	private Link link;

	public Conexion(Link link) {
		assert link != null;
		this.link = link;
		this.estado = Estados.CERRADO;
		this.state = new StateCerrado();
	}

	public State getState() {
		return state;
	}

	public Estados getEstado() {
		return this.estado;
	}

	protected void setEstado(Estados estado) {
		this.estado = estado;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}

	public void abrir() {
		this.state.abrir(this);
	}

	public void cerrar() {
		this.state.cerrar(this);
	}

	public void parar() {
		this.state.parar(this);
	}

	public void iniciar() {
		this.state.iniciar(this);
	}

	public void enviar(String msg) {
		this.state.enviar(this, msg);
	}

	public void recibir(int respuesta) {
		this.state.recibir(this, respuesta);
	}

	public void getState(State estado) {
		this.state = estado;
	}
}
