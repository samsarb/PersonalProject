import java.util.Scanner;

public class Book {
	
	Scanner inputBook = new Scanner (System.in);
	
	
	public String genreOfBook() {
		System.out.println(" which gener do you prefer ? SF-> Science fiction, N-> Novel , S -> Spirituality and Scichology");
		System.out.println("Warning :)!  it is case sensitive ");
		String genre =inputBook.nextLine();							
		return  genre;		
	}
			

	public void sBookName() {
		System.out.printf("%s %n %s","The Four Agreement", " The Secret ");	
	}
	
	public void sFBookName() {
		System.out.printf("%s %n %s","Harry Ptter", " Forever Free");	
	}
	
	public void NBookName() {
		System.out.printf("%s %n %s", "The Little Prince" , " Hobbit ");
	}
	
	
}
