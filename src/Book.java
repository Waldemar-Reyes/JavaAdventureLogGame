
public class Book implements GameThing, Readable, Openable {
	boolean isOpen = false;
	public String getName() {
		return "A dusty old book";
	}
	public String getDescription() {
		if (isOpen) {
			return "This book appears to be old and dusty. It's also quite heavy. The book is open.";
		} else {
			return "This book appears to be old and dusty. It's also quite heavy. The book is closed.";
		}
	}
	public void read() {
		if (isOpen) {
			System.out.println("This is a magical book, you need to achieve a higher level of knowledge to understand it.");
		} else {
			System.out.println("I can't read closed books!");
		}
	}
	public void open() {
		if (isOpen) {
			System.out.println("The book is already open!");
		} else {
			System.out.println("The book opens with a creaky sound");
			isOpen = true;
		}
	}
	public void close() {
		if (isOpen) {
			System.out.println("As the book closes, it makes a loud sound");
			isOpen = false;
		}
		else {
			System.out.println("The book is already closed!");
		}
	}
}
