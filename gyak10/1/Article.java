import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Article {
	private String title, body, conclusion;
	private PrintWriter pw;
	private ArrayList<Book> refs;
	//private ArrayList<Object> refs;
	
	public Article(String title, String body, String conclusion) {
		this.title = title;
		this.body = body;
		this.conclusion = conclusion;
		this.refs = new ArrayList<>();
	}
	
	public void addBookToReferences(Book book) {
		refs.add(book);
	}
	
	private void printReference(Book book, int from, int to) {
		String ref = book.createReference(this.title, from, to);
		pw.print(ref);
		pw.print(System.lineSeparator());
	}
	
	public void print(String destFileName) {
		try{
			pw = new PrintWriter(new File(destFileName));
			pw.print(title);
			pw.print(System.lineSeparator());
			pw.print(body);
			pw.print(System.lineSeparator());
			pw.print(conclusion);
			pw.print(System.lineSeparator());
			for(Book book : refs) {
				printReference(book, 1, book.getPages());
			}
			/*for(Object book: refs) {
				if(book instanceof Book) {
					
				} else if(book instanceof PrintedBook) {
				...	
				
				printReference(book, 1, book.getPages());
			}*/
		} catch(IOException exc) {
			System.out.println(exc.getStackTrace());
		} finally {
			pw.close();
		}
		
	}
}