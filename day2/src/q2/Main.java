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
		this.bookTitle = bookTitle;
		this.author = author;
		ISBN = iSBN;
		this.numOfCopies = numOfCopies;
	}
	public Book() {}
	void display() {
		System.out.println(bookTitle + " - " + author + " – " + ISBN + " – " + numOfCopies);
	}

}

class BookStore extends Book {
	private Scanner scn=new Scanner(System.in);

	protected Book[] books = new Book[10];
	private int noOfBooks =0;
	
	BookStore(String bookTitle, String author, String ISBN, int numOfCopies) {
		super(bookTitle, author, ISBN, numOfCopies);
	}
	BookStore(){
		super();
	}
	void sell(String bookName, int qty) {
		Boolean flag=false;
		for(int i=0;i<noOfBooks;i++) {			if (books[i].bookTitle == bookName) {
				flag=true;
				if (qty <= books[i].numOfCopies) {
					books[i].numOfCopies -= qty;
				} else {
					System.out.println("Not enough quantity available");
				}
			}
			
		}
		if(!flag)System.out.println("Book not found");
	}

	void order(String bookName, int qty) {
		Boolean flag=false;

		for(int i=0;i<noOfBooks;i++) {
			if (books[i].bookTitle == bookName) {
				flag=true;
				books[i].numOfCopies+=qty;
			}
			
		}
		if (!flag) {
			//new book
    		System.out.println("Enter the isbn of the book");
    		String isbn=scn.next();
    		System.out.println("Enter the Author");
    		String Author=scn.next();
    		Book newBook=new Book(bookName,Author,isbn,numOfCopies);
    		books[noOfBooks]=newBook;
    		noOfBooks++;
		}
	}

	void display() {
		for(int i=0;i<noOfBooks;i++) {
    		books[i].display();
    	}
    	if(noOfBooks==0) {
    		System.out.println("No books To display");
    	}
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		BookStore bookStore=new BookStore();
		System.out.println("Enter “1”, to display the Books: Title – Author – ISBN - Quantity.");
		System.out.println("Enter “2”, to order new books.");
		System.out.println("Enter “3”, to sell books. ");
		System.out.println("Enter “0”, to exit the system.");

		switch (scn.nextInt()) {
		case 1:
				bookStore.display();
		case 2:
			System.out.println("Enter the name of book you want to order");
			String title=scn.next();
			System.out.println("Enter the no of copies");
			int num=scn.nextInt();
			bookStore.order(title, num);
			bookStore.display();
		case 3:
			System.out.println("Enter the book title");
			String bookName=scn.next();
			System.out.println("Enter the no of copies");
			int qty=scn.nextInt();
			bookStore.sell(bookName, qty);
			bookStore.display();
		case 0:
			break;
		default:
			System.out.println("Invalid input please try again");
		}
		scn.close();
	}

}
