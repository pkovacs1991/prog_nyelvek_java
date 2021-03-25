public class Book {

	static enum Genre {
		FANTASY, SATIRE, SCIFI, PHILOSOPHY, EDUCATIONAL;
		
	}

	private final String author;
	private final String title;
	private final int reservedPrice;
	private final int id;
	private final Genre genre;
	
	private static int lastId;
	
	public static void resetId() {
		lastId = 0;
	}
	
	private Book(String author, String title, Genre genre, int reservedPrice ){
		this.author = author;
		this.title = title;
		this.reservedPrice= reservedPrice;
		this.genre = genre;
		id = lastId++;
		
		
	}
	
	
	public static Book make(String author, String title, String genre, String reservedPriceStr ){
		try {
			int reservedPrice = Integer.parseInt(reservedPriceStr);
			if(author == null || title == null || title.length() < 2 || author.length() < 2 || reservedPrice <= 0 ||genre == null) {
				return null;
			}
			
			Genre g  = Genre.valueOf(genre);
			int i = 0;
			while (i< title.length()) {
				if(Character.isLetter(title.charAt(i)) || Character.isDigit(title.charAt(i)) || Character.isWhitespace(title.charAt(i))) {
					++i;
				} else {
					return null;
				}
				
			}
			
			
			return new Book(author, title, g, reservedPrice);
			
		} catch (NumberFormatException e) {
			return null;
		} catch (IllegalArgumentException e) {
			return null;
		}
		
		
		
	}
	
	
	public static boolean isSameGenre(Book b1, Book b2) {
		return b1.getGenre() == b2.getGenre();
		
	}
	
	
	public int compare(Book that) {
		if(!isSameGenre(this, that)) {
			throw new IllegalArgumentException();
		}
		
		return Integer.compare(this.reservedPrice, that.getReservedPrice());
	}

	public Genre getGenre() {
		return this.genre;
		
	}
	
	public int getReservedPrice(){
		return reservedPrice;
	}
	
	public int getId(){
		return id;
	}

}