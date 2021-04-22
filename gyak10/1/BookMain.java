public class BookMain {

	public static void main(String[] args) {
		Book book = new Book();
		Book book2 = new Book("author", "title", 120);
		EBook eBook = new EBook("eauthor", "etitle", 110, 50);
		PrintedBook pBook2 = new PrintedBook("pauthor", "ptitle", 110, CoverType.SoftCover);
		System.out.println(book);
		System.out.println(book2);
		System.out.println(pBook2);
		System.out.println(eBook);
		System.out.println(book.createReference("articleName", 10, 20));
		System.out.println(book2.createReference("articleName", 10, 20));
		System.out.println(pBook2.createReference("articleName", 10, 20));
		System.out.println(eBook.createReference("articleName", 10, 20));
		
		
		Article myArticle = new Article("article", "body", "conclusion");
		myArticle.addBookToReferences(book);
		myArticle.addBookToReferences(book2);
		myArticle.addBookToReferences(eBook);
		myArticle.addBookToReferences(pBook2);
		myArticle.print("out.txt");
	}


}