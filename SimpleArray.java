import java.util.Iterator;

public class SimpleArray<E> implements Simple<E>{
	
	public static void main(String[] args) {
		Simple<String> strings = new SimpleArray<>();
		strings.add("first");
		strings.add("second");
		strings.add("third");
		strings.add("forth");
		
			for (String s : strings) {
			System.out.println(s);
		}
		
		System.out.println(strings.get(2));
		System.out.printf("ArrayList has %d elements \n", strings.size());
		
              
	if (strings.contains("forth")){
		System.out.println("strings contains forth as good");
	} else {
		System.out.println("strings doesn't contains forth");
		}
	strings.remove(0);
	for (String s : strings) {
		System.out.println(s);
	}
		System.out.printf("ArrayList has %d elements \n", strings.size());
	}
	
	    
	private E[] values;
	
	@SuppressWarnings("unchecked")
	public SimpleArray(){
		values = (E[]) new Object[0];
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean add(E e) {
		try {
		      E[] temp = values;
		      values = (E[]) new Object[temp.length + 1];
		      System.arraycopy(temp, 0, values, 0, temp.length); // (откуда копируем, с какого эл-та копируем, куда копируем, сколько всего эл-тов хотим скопировать)
		      values [values.length - 1] = e;
				return true;
	} catch (ClassCastException ex) {
		ex.printStackTrace();
	}
		return false;
}
	
	@SuppressWarnings("unchecked")
	@Override
	public void remove(int index) {
		try {
			E[] temp = values;
			values = (E[]) new Object[temp.length - 1];
			System.arraycopy(temp, 0, values, 0, index);
			int AmountElementsAfterIndex = temp.length - index - 1;
			System.arraycopy(temp, index + 1, values, index, AmountElementsAfterIndex);
	        }catch (ClassCastException ex) {
	        	ex.printStackTrace();
	        }
	}	
	
	@Override
	public Iterator<E> iterator() {
				return new ArrayIterator<>(values);
	}

	public E get(int index) {
				return values[index];
	}

	public int size() {
				return values.length;
	}

	public boolean contains(String string) {
	return false;
	}

	@Override
	public void update(int index, E e) {
				
	}
}
	