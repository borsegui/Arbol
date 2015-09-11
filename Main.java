/**
Jonathan Aguirre 14349
Diego de leo	 14345
Angel Ochoa   	 14230
 * 
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * 
 *
 */
public class Main {

	/**
	 * @param args
	 * 
	 */
	private  String cadena;
	private  String[] texto = new String [1000];
	private static  String palabra = "";
	private static  String [] p = new String [1000];
	private static  String [] words = new String [1000];
	private static  BinaryTree<String> arb = new BinaryTree();
	private  String traducido;
	
	public static void muestraContenido(String archivo) throws FileNotFoundException, IOException { 
		FileReader f = new FileReader(archivo);
		BufferedReader b = new BufferedReader(f);
		String line = null;
		
		while ((line = b.readLine()) != null) {
			palabra = line.toString().replace("(", "").replace(",", "").replace(")", "");
			p=palabra.split(" ");
			arb.add(arb.getRoot(), p[0], p[1]);
		}
    b.close();
	}
	
	public static String leeentrada(String archivo) throws FileNotFoundException, IOException { 
		
		FileReader f = new FileReader(archivo);
		String[] p;
		String traduccion = "";
		BufferedReader br = new BufferedReader(f);
		String line = null;
		
		while ((line = br.readLine()) != null){
			
			p=line.toString().replace(".", "").split(" ");
		    for(String palabra: p){
		    	
		    	arb.setTraduccion("");
		    	arb.serch(arb.getRoot(), palabra);
		    	
		    	if(((String) arb.getTraduccion()).equalsIgnoreCase("")){
		    		traduccion=traduccion+"*"+palabra+"* ";
		    	}else{
		    		traduccion=traduccion+ arb.getTraduccion()+" ";
		    	}
		    	
		    }
		
		}
		br.close();
		return traduccion;
		}
	
	
	public BinaryTree <String> getArbol() {
		return arb;
	}
	public void setarb(BinaryTree arbol) {
		this.arb = arbol;
	}
	
	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		
	muestraContenido("diccionario.txt");
	arb.add(arb.getRoot(), words[0],p[0]);
	leeentrada("texto.txt");
	System.out.println((leeentrada("texto.txt") ) );
	
    
	
	}
	private void asserEquals(Object object, String p) {
		// TODO Auto-generated method stub		
		}
	}
