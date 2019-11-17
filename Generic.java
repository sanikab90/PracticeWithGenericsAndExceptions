import java.util.ArrayList;

class Generic<E extends Comparable<E>> implements Comparable<E>{
	//declare an object of type T
	private ArrayList <E> list = new ArrayList<E>();
	private E t;
	
	//accesor
	public E getE() {
		return t;
	}
	
	@Override
	public int compareTo(E e) {
		return getE().compareTo(e);
	}
	
	public int compareTo(Generic<E> other) {
		return getE().compareTo(other.getE());
	}
	
	//insertion sort
	public void insertionSort(){
		E key = null;
		int j = 0;
		
		//loop through list
		for(int i = 0; i < list.size(); i++) {
			key = list.get(i); //get value at index
			j = i - 1; // get index to previous vlaue
			//compare value
			
			while(j >= 0 && list.get(j).compareTo(key) > 0) {
				list.set(j+1, list.get(j));
				j--;
			}
			
			list.set(j+1, key); //set with new value
		}
	}
	
	//binary search
	public E BinarySearch(E key) {
		int startIndex = 0;
		int endIndex = list.size() - 1;
		
		
		while(startIndex <= endIndex) {
			//get middle index of arraylist
			int mid = (startIndex + endIndex) / 2;
			
			
			//if middle index == key return the index at which it is kept at
			if(list.get(mid) == key) {
				return key;
			}
			//search left
			else if(list.get(mid).compareTo(list.get(mid-1)) > 0) {
				endIndex = mid - 1;
			}
			
			//search right
			else {
				startIndex = mid + 1;
			}
		}
		
		return key;
	}
}
