public class EatCake {
	public EatCake() {
		
	}
	
	public static void eatCake(Cake cake) {
		if(!cake.isEmpty()) {
			cake.takeABite();
			eatCake(cake);
		}
	}
	
	public static void main(String[] arg) {
		Cake cake = new Cake();
		eatCake(cake);
		System.out.println("Done eating cake");
	}

}