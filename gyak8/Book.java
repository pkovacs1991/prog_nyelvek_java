public class Book {
	
	private String author;
	private String title;
	protected int pages;
	
	public Book() {
		this.author = "John Steinbeck";
		this.title = "Of Mice and Men";
		this.pages = 107;
	}
	
	public Book(String author, String title, int pages) {
		if(author.length() < 2 || title.length() < 4) {
			throw new IllegalArgumentException();
		}
		this.author = author;
		this.title = title;
		this.pages = pages;
	}

	public String getShortName() {
		return author.substring(0, 2) + ": " + title.substring(0, 4) + "; " + pages;
	}


	@Override
	public String toString() {
		return this.author + ": " + this.title + "; " + pages;
	}

	public String createReference(String article, int from, int to) {
		return this.getShortName() + " [" + from + "-" + to + "] referenced in article: " + article;
	}

}