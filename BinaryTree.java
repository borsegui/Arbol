import java.io.IOException;

/**
 * 
 */

/**
 * @author Ligia Orantes
 *
 */
public class BinaryTree <E>{
	private Nodo root;
	private String traduccion="";
	private String diccionario="";
	
	public void add(Nodo raiz, String pi, String pe){
		try{
			
			
			if(root!=null){
				if(raiz==null)return;
			
				if(raiz.getterpi().compareTo(pi)>0){
					if(raiz.getterhi()==null){// Ingresando datos en la izquierda
						raiz.setterhi(new Nodo(null, null, pi, pe));
					}else{
						add(raiz.getterhi(), pi, pe);
					}
				}else{
					if(raiz.getterhd()==null){//Ingresado datos en la derecha
						raiz.setterhd(new Nodo(null, null,pi, pe));
					}else{
						add(raiz.getterhd(), pi, pe);
					}
				}
			}else{
				root= new Nodo(null,null, pi, pe);
				}
			
		}catch (Exception e){
		}
		
		}
	
	public void seek(Nodo raiz){ // recorer el arbol
		if(raiz ==null) return;
		seek(raiz.getterhi());
		diccionario=diccionario+"("+raiz.getterpi()+", "+raiz.getterpe()+")"+"\n";
		seek(raiz.getterhd());
	}
	
	public void serch(Nodo raiz, String pi){
		if(raiz == null) return;
		serch(raiz.getterhi(), pi);
		if(raiz.getterpi().equalsIgnoreCase(pi)) traduccion=raiz.getterpe()+ " ";
		serch(raiz.getterhd(), pi);
	}

	public Nodo getRoot() {
		return root;
	}
	public E getTraduccion() {
		return (E) traduccion;
	}
	public E getDiccionario() {
		return (E) diccionario;
	}
	public void setRoot(Nodo root) {
		this.root = root;
	}
	public void setTraduccion(String traduccion) {
		this.traduccion = traduccion;
	}
	public void setDiccionario(String diccionario) {
		this.diccionario = diccionario;
	}}
