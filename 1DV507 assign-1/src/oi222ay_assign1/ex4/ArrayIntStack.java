package oi222ay_assign1.ex4;

public class ArrayIntStack extends AbstractIntCollection implements IntStack{

	@Override
	public void push(int n) {
		// TODO Auto-generated method stub
		if (size < values.length) {
			values[size++] = n;
		}
		
	}

	@Override
	public int pop() throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		int i = size - 1;
		values[size - 1] = 0;
		size--;
		return i;
	}

	@Override
	public int peek() throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if(size > 0) {
			return values[size - 1];
		}
		throw new IndexOutOfBoundsException();
	}

}
