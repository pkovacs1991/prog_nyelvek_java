public class PrintableBook implements Printable {

	private String author,title;
	
	public PrintableBook(String author, String title) {
		this.author = author;
		this.title = title;
		
	}

	@Override 
	public void print() {
		System.out.println(author + ": " + title);
	}

}