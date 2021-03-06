public class BookMain {

	public static void main(String[] args) {
		Book book = new Book();
		Book book2 = new Book("author", "title", 120);
		System.out.println(book);
		System.out.println(book.getShortName());
		System.out.println(book2.getShortName());
		
		
		PrintedBook pBook2 = new PrintedBook("pauthor", "ptitle", 110, CoverType.SoftCover);
		
		System.out.println(pBook2.getShortName());
		System.out.println(pBook2.getPrice());
		System.out.println(pBook2);
		EBook eBook = new EBook("eauthor", "etitle", 110, 50);
		
		System.out.println(eBook.getShortName());
		System.out.println(eBook.getPrice());
		System.out.println(eBook);
		
		System.out.println(book2.createReference("articleName", 10, 20));
		System.out.println(pBook2.createReference("articleName", 10, 20));
		System.out.println(eBook.createReference("articleName", 10, 20));
		System.out.println(eBook.createReference("articleName", "2020/04/08"));
	}


}