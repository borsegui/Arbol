/**
Jonathan Aguirre 14349
Diego de leo	 14345
Angel Ochoa   	 14230
 * 
 */
public class Nodo <E> {
	private Association<String, String> p;
	private Nodo<E> hojad; 
	private Nodo<E> hojai;
	
	public Nodo(Nodo hojad, Nodo hojai, String pi,String pe) {
		super();
		this.hojad = hojad;
		this.hojai = hojai;
		this.p = new Association<String,String>(pi,pe);
	}
	public Nodo<E> getterhd() {
		return hojad;
	}
	public Nodo<E> getterhi() {
		return hojai;
	}
	public String getterpi() {
		return p.getKey();
	}
	public String getterpe() {
		return p.getValue();
	}
	public void setterhd(Nodo hojad) {
		this.hojad = hojad;
	}
	public void setterhi(Nodo hojai) {
		this.hojai = hojai;
	}
	public void setterpi(String pi) {
		p.setKey(pi);
	}
	public void setterpe(String pe) {
		p.setValue(pe);
	}
}
