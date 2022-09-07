package com.array;

import java.util.Comparator;

public class NameComparator implements Comparator<Books> {

	@Override
	public int compare(Books book1, Books book2) {
		return book1.getName().compareToIgnoreCase(book2.getName());
	}


}
