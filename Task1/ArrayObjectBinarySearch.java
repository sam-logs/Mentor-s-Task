package com.array;

import java.util.Arrays;

public class ArrayObjectBinarySearch {

	public static void main(String[] args) {
		Books book[];
		book = new Books[5];

		book[0] = new Books(105,"Canterville Ghost","Sir Canterville","Stroy");
		book[1] = new Books(104,"David Copperfield","Sir james","Novel");
		book[3] = new Books(103,"Pride and Prejudice","jane Austin","Love Stroy");
		book[2] = new Books(102,"Half Girlfriend","Chetan bhagat","biography");
		book[4] = new Books(101,"Revolution 2020","Chetan Bhagat","Stroy");
		
		System.out.println("Display All Books");
		for(Books obj:book) {
			obj.display();
		}

		//search book by name
		System.out.println("Searching Book by name: ");
		java.util.Arrays.sort(book);
		System.out.println(Arrays.binarySearch(book, new Books(102, "David Copperfield", "Sir James", "Novel")));
		
		//sort by bookid and name
		System.out.println("sorting by bid: ");
		Arrays.sort(book);
		for(Books obj:book) {
			obj.display();
		}
		
		//sort using Comparator
		System.out.println("Sorting by name");
		Arrays.sort(book,new NameComparator());
		for(Books obj:book) {
			obj.display();
		}
	}
		

}
