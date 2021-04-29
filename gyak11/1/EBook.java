public class EBook extends Book{
	
	protected int pdfSize;

	public EBook(String author, String title, int pages, int pdfSize) {
		super(author, title, pages);
		this.pdfSize = pdfSize;
	}
	
	@Override
	public int getPrice() {
		return pages + pdfSize;
	}
	
	@Override
	public String createReference(String article, int from, int to) {
		return super.toString() + "( PDF size: " + this.pdfSize  + ") [" + from + "-" + to + "] referenced in article: " + article;
	}
	
	
	public String createReference(String article, String date) {
		return super.toString() + "( PDF size: " + this.pdfSize  + ") referenced in article: " + article + 
		", accessing PDF date: " + date;
	}
}