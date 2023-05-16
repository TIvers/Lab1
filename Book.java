
import java.io.PrintStream;

public class Book implements Comparable<Book> {
	// Задаем поля класса   
	String name;
	String author;
	int year;
	int quantity;
	
	// Конструктор	
	public Book(String name, String author, int year, int quantity) {
		this.name = name;
		this.author = author;
		this.year = year;
		this.quantity = quantity;
    }
    // Массив в строку
    public String toString() {
        return ("(" + name + ", " + author + ", " + year + ", " + quantity + ")");}
    // Сравнение
    public int compareTo(Book o) {
        return toString().compareTo(o.toString());}
 
	// Название данных вывода в консоль
	void printTitlesToConsole() {
		System.out.printf("%25s %25s %10s %10s", "Name", "Author", "Year", "Quantity");
	}	
	
	// Ввод элементов в консоль
	void print() {
		System.out.printf("\n%25s %25s %10s %10s", name, author, year, quantity);
	}

	// Название данных вывода в файл	
	void printTitlesToFile(PrintStream stream) {
		stream.printf("%20s %20s %10s %10s", "Name", "Author", "Year", "Quantity");
	}

	// Ввод элементов в файл
	void printToFile(PrintStream stream) {
		stream.printf("\n%25s %25s %10s %10s", name, author, year, quantity);
	}
	
}


