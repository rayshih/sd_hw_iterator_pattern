import java.util.Iterator;


public class Main {
	
	public static void main(String args[]){
		System.out.println("===== String Array Test =====");
		StringArray sa = generateStringArray();
		System.out.println("String array length = " + sa.length);
		traverse(sa.iterator());

		System.out.println("===== String Array Test =====");
		SkipList sl = generateSkipList();
		System.out.println("Skip List length = " + sl.size());
		traverse(sl.iterator());
	}
	
	static void traverse(Iterator<? extends Object> iterator){
		while(iterator.hasNext()){
			Object o = iterator.next();
			System.out.println(o);
		}
	}
	
	static StringArray generateStringArray(){
		StringArray sa = new StringArray();
		sa.add("Hello");
		sa.add("world");
		return sa;
	}
	
	static SkipList generateSkipList(){
		SkipList sl = new SkipList();
		sl.add(new SkipNode());
		sl.add(new SkipNode());
		sl.add(new SkipNode());
		sl.add(new SkipNode());
		return sl;
	}
}
