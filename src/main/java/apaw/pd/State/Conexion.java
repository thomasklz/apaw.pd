package apaw.pd.State;

public class Conexion {
	
	private State estado;
	private Link link;
	
	public Conexion(Link link){
		assert link!=null;
		this.link = link;
		this.estado=new StateCerrado();	
	}
	
	public State getEstado() {
		return estado;
	}

	public void setEstado(State estado) {
		this.estado = estado;
	}

	public Link getLink() {
		return link;
	}

	public void setLink(Link link) {
		this.link = link;
	}
	
	public void abrir(){
		this.estado.abrir(this);
	}

	public void cerrar(){
		this.estado.cerrar(this);
	}
	
	public void parar(){
		this.estado.parar(this);
	}
	
	public void iniciar(){
		this.estado.iniciar(this);
	}
	
	public void enivar(String msg){
		this.estado.enviar(this, msg);
	}
	
	public void recibir(int respuesta){
		this.estado.recibir(this,respuesta);
	}

	public void getEstados(State estado){
		this.estado=estado;
	}
}
