public class DogProblem {
	public static Dog[] largerThanFourNeighbors(Dog[] dogs) {
		Dog[] returnDogs = new Dog[dogs.length];

		int cnt = 0;
		for (int i = 0; i < dogs.length; i += 1) {
			if (isBiggestOfFour(dogs, i)) {
				returnDogs[cnt] = dogs[i];
				cnt = cnt + 1;
			}
		}

		returnDogs = arrayWithNoNulls(returnDogs, cnt);
		return returnDogs;
	}

	public static Dog[] arrayWithNoNulls(Dog[] dogs, int cnt) {
		Dog[] noNullDogs = new Dog[cnt];

		for (int i = 0; i < cnt; i += 1) {
			noNullDogs[i] = dogs[i];
		} 
		return noNullDogs;
	}

	public static boolean validIndex(Dog[] dogs, int i) {
		if ((i < 0) || (i >= dogs.length)) {
			return false;
		}
		return true;
	}

	public static boolean isBiggestOfFour(Dog[] dogs, int i) {
		boolean isBiggest = true;

		for (int j = -2; j <= 2; j += 1) {
			int compareIndex = i + j;

			if (j == 0) {
				continue;
			}

			if (validIndex(dogs, compareIndex)) {
				if (dogs[compareIndex].weightInPounds >= dogs[i].weightInPounds) {
					isBiggest = false;
				}
			}
		}
		return isBiggest;
	}

	public static void main(String[] args) {
		Dog[] dogs = new Dog[]{
			new Dog(10, "white"),
			new Dog(15, "black"),
			new Dog(20, "yellow"),
			new Dog(15, "orange"),
			new Dog(10, "brown"),
			new Dog(5, "white"),
			new Dog(10, "black"),
			new Dog(15, "yellow"),
			new Dog(22, "orange"),
			new Dog(20, "brown")
		};

		Dog[] bigDogs = largerThanFourNeighbors(dogs);

		for (int k = 0; k < bigDogs.length; k += 1) {
			System.out.print(bigDogs[k].weightInPounds + " ");
		}
		System.out.println();
	}
}