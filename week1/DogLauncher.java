public class DogLauncher {
	public static void main(String[] args) {
		Dog smallDog;
		smallDog = new Dog(5, "black");

		Dog hugeDog = new Dog(150, "white");

		// d.weightInPounds = 51;

		smallDog.makeNoise();
		hugeDog.makeNoise();

		smallDog.displayColor();
		hugeDog.displayColor();

		Dog bigger = Dog.maxDog(smallDog, hugeDog);
		bigger.makeNoise();

		Dog bigger2 = smallDog.maxDog(hugeDog);
		bigger2.displayColor();

		System.out.println(Dog.binomen);

		// Dog[] dogs = new Dog[2];
		// dogs[0] = new Dog(8);
		// dogs[1] = new Dog(20);

		// dogs[0].makeNoise();
		// dogs[1].makeNoise();
	}
}