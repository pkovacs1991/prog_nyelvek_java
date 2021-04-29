public class Main {

	public static void foo(Printable printable) {
		printable.print();
	}

	public static void main(String[] args) {
		ReversablePoint reversable = new ReversablePoint(1,2);	
		reversable.setX(10);
		reversable.setY(20);
		System.out.println(reversable.getX() + " " + reversable.getY());
		reversable.reverse();
		System.out.println(reversable.getX() + " " + reversable.getY());
		
		PrintablePoint printablePoint = new PrintablePoint(4,5);
		foo(printablePoint);
		PrintableBook printableBook = new PrintableBook("author","title");
		foo(printableBook);
		PrintableAndReverseablePoint printableAndReverseablePoint = new PrintableAndReverseablePoint(8,9);
		printableAndReverseablePoint.setX(80);
		printableAndReverseablePoint.setY(90);
		foo(printableAndReverseablePoint);
		printableAndReverseablePoint.reverse();
		foo(printableAndReverseablePoint);
	}


}