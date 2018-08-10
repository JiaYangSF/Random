package practice;

public class ArrayList {
	int[] arr = new int[10];
	int size = 0;
	
	public void set(int index, int value) {
		if(index<0 || index>size) throw new IndexOutOfBoundsException();
		arr[index] = value;
	}
	
	public int get(int index) {
		if(index<0 || index >size) throw new IndexOutOfBoundsException(String.valueOf(index));
		return arr[index];
	}
	
	public void append(int value) {
		ensureCapacity();
		arr[size]=value;
		size++;
		
	}

	private void ensureCapacity() {
		if(size > arr.length) {
			int[] newArr = new int[size*2];
			System.arraycopy(arr, 0, newArr, 0, size);
			arr = newArr;
			
		}
		
	}

}
