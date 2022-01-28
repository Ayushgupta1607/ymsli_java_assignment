package ques3;

import java.util.ArrayList;

public class BookCollectionDemo {
	public static void main(String[] args) {
		ArrayList<Book> books=new ArrayList<Book>();
		Book b1=new Book("Ayush","bokk1","425",122);
		Book b2=new Book("Gupta","book2","142",455);
		books.add(b2);
		books.add(b1);
		
		BookCollection collection=new BookCollection("Ranbir",books);
		
		System.out.println(collection.hasBook(b1));
		collection.sort();
	}
}
