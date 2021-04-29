public class PrintedBook extends Book {

	protected CoverType cover;

	public PrintedBook() {
		super();
		this.cover = CoverType.HardCover;
		this.pages += 6;
	}

	public PrintedBook(String author, String title, int pages, CoverType cover) {
		super(author, title, pages + 6);
		this.cover = cover;
		
	}
	
	@Override
	public int getPrice() {
		if(this.cover == CoverType.SoftCover) {
			return this.pages * 2;
		
		} else {
			return this.pages * 3;
		}
	}
	
	@Override
	public String toString() {
		if(cover == CoverType.SoftCover) {
			return super.toString() + " (soft cover)";
		} else {
			return super.toString() + " (hard cover)";
		}
	}
	
	@Override
	public String createReference(String article, int from, int to) {
		return super.toString() + " [" + from + "-" + to + "] referenced in article: " + article;
	}
}