import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class MyArray<T> {
	protected List<T> list = new ArrayList<T>();
	public int length = 0;
	
	public void add(T data){
		length++;
		this.list.add(data);
	}
	
	public T get(int index){
		return this.list.get(index);
	}
	
	public Iterator<T> iterator(){
		return this.list.iterator();
	}
}
