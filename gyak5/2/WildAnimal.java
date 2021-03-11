public enum WildAnimal {
	MONKEY("bananas", 5),
	ELEPHANT("raspberries", 30),
	GIRAFFE("apples", 10),
	RACCOON("walnuts", 20);

	private final String food;
	private final int amount;
	
	WildAnimal(String food, int amount) {
		this.food = food;
		this.amount = amount;
		
	}
	
	public static String listAllAnimals() {
		StringBuilder sb = new StringBuilder();
		for(WildAnimal wildAnimal : WildAnimal.values()) {
			sb.append(wildAnimal.ordinal() + 1)
			.append(": ")
			.append(wildAnimal.name())
			.append(" desires eating ")
			.append(wildAnimal.amount * 7 )
			.append(" " )
			.append(wildAnimal.food)
			.append(" a week.")
			.append(System.lineSeparator());
			
		}
		return sb.toString();
		
		
	}
	
	
	public String toString() {
		return "A(n) " + this.name() + " eats " + this.amount + " " + this.food + " a day.";
		 
		
	}
	
}