
public class SkipList extends MyArray<SkipNode> {
	
	public SkipNode getNode(int index){
		return this.get(index);
	}

	public int size(){
		return this.length;
	}
}
