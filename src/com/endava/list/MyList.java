package com.endava.list;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyList<E> implements List<E> {

	private Object[] array;
	private int size = 0;

	public MyList() {

		this.array = new Object[size];

	}

	public MyList(int actualSize) {

		if (actualSize < 0) {
			throw new IllegalArgumentException("Illegal capacity:" + actualSize);
		}
		this.array = new Object[actualSize];
	}

	private void increaseMyListSize() {

		array = Arrays.copyOf(array, (array.length + 1));

	}

	@Override
	public boolean add(E e) {
		if (array.length - size == 0) {
			increaseMyListSize();
		}
		array[size++] = e;
		return true;
	}

	@Override
	public void add(int index, E element) {
		if (array.length - size == 0) {
			increaseMyListSize();
		}
		System.arraycopy(array, index, array, index + 1, size - index);
		array[index] = element;
		size++;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {

		for (int i = 0; i < array.length; i++) {
			array[i] = null;
			size = 0;
			array = new Object[size];
		}

	}

	@Override
	public boolean contains(Object o) {
		if (indexOf(o) >= 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		for (int i = 0; i < array.length; i++) {
			if (o == array[i]) {
				return i;
			}
		}
		return -1;

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public E set(int index, E element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {

		return size;

	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return Arrays.toString(array);
	}

}
