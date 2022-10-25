public class Dog{
	public int weightInPounds;
	public String color;
	public static String binomen = "Canis familiaris";

	public Dog(int w, String c) {
		weightInPounds = w;
		color = c;
	}

	public void makeNoise() {
		if (weightInPounds < 10) {
			System.out.println("yip!");
		}
		else if (weightInPounds < 30) {
			System.out.println("bark.");
		}
		else {
			System.out.println("wooof!");
		}
	}

	public void displayColor(){
		System.out.println(color);
	}

	public static Dog maxDog(Dog d1, Dog d2) {
		if (d1.weightInPounds > d2.weightInPounds) {
			return d1;
		}
		return d2;
	}

	public Dog maxDog(Dog d2) {
		if (this.weightInPounds > d2.weightInPounds) {
			return this;
		}
		return d2;
	}
}