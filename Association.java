
public class Association<K,V>{
	protected K theKey;
	protected V theValue;
	
	public Association( K key, V value){
		
		theKey = key;
		theValue = value;
		
	}
	public V getValue(){
		return theValue;
	}
	public K getKey(){
		return theKey;
	}
	public V setValue(V val){
		V oldValue = theValue;
		theValue = val;
		return oldValue;
	}
	public K setKey(K val){
		K oldKey = theKey;
		theKey = val;
		return oldKey;
	}
}
