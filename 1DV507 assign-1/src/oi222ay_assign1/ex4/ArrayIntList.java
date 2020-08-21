package oi222ay_assign1.ex4;

public class ArrayIntList extends AbstractIntCollection implements IntList{


	@Override
	public void add(int n) {
		// TODO Auto-generated method stub
		values[size++] = n;
		if(size == values.length)
			resize();
	}

	@Override
	public void addAt(int n, int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if(size == values.length) {
			resize();
		}
		values[index] = n;
		size++;
	}

	@Override
	public void remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		checkIndex(index,size);
		for(int i = index; i < size; i++) {
			values[i] = values [i+1];
		}
		size--;
		
	}

	@Override
	public int get(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return values[index];
	}

	@Override
	public int indexOf(int n) {
		// TODO Auto-generated method stub
		for(int i = 0; i < size; i++) {
			if(values[i] == n) {
				return i;
			}
		}
		return -1;
	}

}
