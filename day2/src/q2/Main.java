package q2;

import java.util.Scanner;

//Enter “1”, to display the Books: Title – Author – ISBN - Quantity.
//Enter “2”, to order new books.
//Enter “3”, to sell books. 
//Enter “0”, to exit the system.
class Book {
	String bookTitle;
	String author;
	String ISBN;
	int numOfCopies;

	
	public Book(String bookTitle, String author, String iSBN, int numOfCopies) {
		super();
		this.bookTitle = bookTitle;
		this.author = author;
		ISBN = iSBN;
		this.numOfCopies = numOfCopies;
	}


	void display() {
		System.out.println(bookTitle+" - " +author+" – "+ISBN+" – "+numOfCopies);
	}

}

class BookStore{
	Book [] books=new Book[10];
	
	void sell(String bookName,int qty) {
		
	}
	void order(String bookName,int qty) {
		
	}
	void display() {
		for(Book book:books) {
			book.display();
		}
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter “1”, to display the Books: Title – Author – ISBN - Quantity.");
		System.out.println("Enter “2”, to order new books.");
		System.out.println("Enter “3”, to sell books. ");
		System.out.println("Enter “0”, to exit the system.");

		Scanner scn = new Scanner(System.in);

		switch (scn.nextInt()) {
		case 1:

		case 2:
		case 3:
		case 0:
			break;
		default:
			System.out.println("Invalid input please try again");
		}
		scn.close();
	}

}


