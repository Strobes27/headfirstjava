public class Dog {
	String name;
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "bart";
		
		//dog array
		Dog[] myDogs = new Dog[3];
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		//array access to dogs
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		
		//ask for myDogs[2] name
		System.out.print("last dogs name is ");
		System.out.println(myDogs[2].name);
		
		int x = 0;
		while(x < myDogs.length) {
			myDogs[x].bark();
			x = x + 1;
		}
	}
		public void bark() {
			System.out.println(name + " says Ruff!");
		}
		
	}
