package com.endava.list;

import java.util.List;

public class MyListDemo {

	public static void main(String[] args) {

		List<Integer> list = new MyList<>();
		
		System.out.println(list);
		System.out.println("****************");

		for (int i = 0; i < 10; i++) {
			int elements = (int) (Math.random()*10);
			list.add(elements);			
		}

		System.out.println(list.toString());
		
		list.add(0, 6);
		
		System.out.println("****************");
		
		System.out.println(list.toString());
		
		System.out.println("****************");
		System.out.println(list.indexOf(0));
		
		System.out.println("****************");
		System.out.println(list.contains(0));		
		
		System.out.println("****************");
		System.out.println(list.size());
		
		list.clear();
		
		System.out.println("****************");
		System.out.println(list.toString());
		
		
		
	}

}
