 
public class ArrayList implements Iteravel {

	public boolean add(Object element){
		return true;
	}
	
	public void remove(Object element){
		
	}
	
	public boolean contains(Object element){
		return false;
	}
	
	public int size(){
		return 0;
	}
	
	public void clear(){
		
	}
	
	public Object get(int i){
		return null;
	}

	@Override
	public Iterador percorrerColecao() {
		return new SequenciaDeElementosDoArrayList(this);
	}
	
	
	
	
}
