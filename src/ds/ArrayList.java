package ds;

public class ArrayList {
	int[] arr = new int[10];
	int size = 0;
	
	
	private void set( int index, int value) {
		if(index < 0 || index > size) throw new ArrayIndexOutOfBoundsException(String.valueOf(index));
		arr[index]=value;
		
	}
	private int get(int index) {
		if(index < 0 || index > size) throw new ArrayIndexOutOfBoundsException(String.valueOf(index));
		return arr[index];
		
		
	}
	
	private void append(int value) {
		ensureCapacity();
		arr[size]=value;
		size ++;
	}
	
	private void ensureCapacity() {
		if(size == arr.length) {
			int[] copy = new int[size*2];// create a new array.
			System.arraycopy(arr, 0, copy, 0, size);
			arr = copy;
		}
		
	}
	

}
