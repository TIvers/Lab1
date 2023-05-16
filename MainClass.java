
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class MainClass {
	public static void main(String[] args) {

		// Массив книг
		Book books[] = new Book[13];
		books[0] = new Book ("Хуан Рульфо", "Педро Парамо", 1955, 10);
		books[1] = new Book ("История", "Эльза Моранте", 1974, 10);
		books[2] = new Book ("Любовь во время чумы", "Габриэль Гарсиа Маркес", 1985, 13);
		books[3] = new Book ("Отец Горио", "Оноре де Бальзак", 1835, 4);
		books[4] = new Book ("1984", "Джордж Оруэлл", 1949, 11);
		books[5] = new Book ("Шум и ярость", "Уильям Фолкнер", 1929, 21);
		books[6] = new Book ("Миссис Дэллоуэй", "Вирджиния Вулф", 1925, 7);
		books[7] = new Book ("Книга непокояr", "Фернандо Пессоа", 1913, 2);
		books[8] = new Book ("Кукольный дом", "Генрик Ибсен", 1879, 2);
		books[9] = new Book ("Война и мир", "Лев Толстой", 1865, 15);
		books[10] = new Book ("Анна Каренина", "Лев Толстой", 1873, 12);
		books[11] = new Book ("Детство", "Лев Толстой", 1852, 15);
		books[12] = new Book ("После бала", "Лев Толстой", 1903, 15);
				
		// Сортировка
		Arrays.sort(books);
    	System.out.println(Arrays.asList(books));

		// Заголовки	
		books[0].printTitlesToConsole();
		for (Book book : books) {			
			book.print();
		}

		// Запись в файл		
		try {
			PrintStream out = new PrintStream(new File("..//Lab1/book.txt"));
			books[0].printTitlesToFile(out);
			for (Book book : books) {
				book.printToFile(out);
			}
		} 
		catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		}	
		
	}}
	
	
