import java.util.ArrayList;

class Author {
	String name;

	Author(String name) {
		this.name = name;
	}

	void display() {
		System.out.println("Author: " + name);
	}
}

class Book {
	String title;
	Author author;

	Book(String title, Author author) {
		this.title = title;
		this.author = author;
	}

	void display() {
		System.out.println("Book: " + title);
		author.display();
	}
}

class Library {
	ArrayList<Book> books;

	Library() {
		books = new ArrayList<Book>();
	}

	void addBook(Book book) {
		books.add(book);
	}

	void display() {
		for (Book book : books) {
			book.display();
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Author a1 = new Author("George Orwell");
		Author a2 = new Author("J.K. Rowling");

		Book b1 = new Book("1984", a1);
		Book b2 = new Book("Harry Potter", a2);

		Library library = new Library();

		library.addBook(b1);
		library.addBook(b2);

		library.display();
	}
}